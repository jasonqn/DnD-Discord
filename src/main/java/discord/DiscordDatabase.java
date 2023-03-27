package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;

import java.sql.*;
import java.time.Instant;

public class DiscordDatabase {
    private final String url;
    private final String user;
    private final String password;


    public DiscordDatabase(String url, String user, String password) {
        this.url = "jdbc:mysql://localhost:3306/discord-dnd";
        this.user = "root";
        this.password = "password";
    }

    public void insertMessage(String message) {
        String query = "INSERT INTO message (message) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, message);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertUserID(long userID) {
        String query = "INSERT INTO users (user_id) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setLong(1, userID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}

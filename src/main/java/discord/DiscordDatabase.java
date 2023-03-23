package discord;

import java.sql.*;

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
        String query = "INSERT INTO messages (message) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, message);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

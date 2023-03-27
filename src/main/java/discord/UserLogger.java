package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.sql.PreparedStatement;

public class UserLogger extends ListenerAdapter {

    private User user;

    public UserLogger(User user) {
        this.user = user;
    }

    public UserLogger() {

    }

    private User getUser(JDA api) {

        // Acquire a reference to the User instance though the id
        User newUser = api.getUserById(this.user.getIdLong());
        if (newUser != null)
            this.user = newUser;
        return this.user;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        User author = event.getAuthor();
        Message message = event.getMessage();
        if (author.getIdLong() == this.user.getIdLong())
        {
            // Update user from message instance (likely more up-to-date)
            this.user = author;
            // Print the message of the user
            System.out.println(author.getAsTag() + ": " + message.getContentDisplay());
        }
    }


    @Override
    public void onGuildJoin(GuildJoinEvent event)
    {
        JDA api = event.getJDA();
        User user = getUser(api); // use getter to refresh user automatically on access
        long userID = user.getIdLong();

        DiscordDatabase database = new DiscordDatabase("jdbc:mysql://localhost:3306/discord-dnd", "root", "password");
        database.insertUserID(userID);
        System.out.println(userID);


    }



}

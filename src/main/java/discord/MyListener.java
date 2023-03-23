package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.sql.*;


import javax.security.auth.login.LoginException;

public class MyListener extends ListenerAdapter {

    public MyListener() throws LoginException {

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }
        TextChannel channel = event.getChannel().asTextChannel();
        String message = event.getMessage().getContentRaw();
        DiscordDatabase database = new DiscordDatabase("jdbc:mysql://localhost:3306/discord-dnd", "root", "password");
        database.insertMessage(message);
        System.out.println(message);
        // Do something with the message received from Discord
        // For example, you could store it in a database
    }



}





package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;


public class DiscordBot {

    public static void main(String[] arguments) throws Exception {

        JDA api = JDABuilder.createDefault("")
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new MyListener())
                .addEventListeners(new UserLogger())
                .build();

    }
}

package discord;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class EmbeddedMessage {

    public static MessageEmbed getEmbed() {

        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Embed Title");
        builder.setDescription("Description");
        builder.setColor(0XFF0000);
        builder.addField("field 1","field 1", true);

        return builder.build();

    }
}

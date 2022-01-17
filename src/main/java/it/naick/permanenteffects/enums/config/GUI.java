package it.naick.permanenteffects.enums.config;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.config.objects.ConfigFile;
import it.naick.permanenteffects.utils.Utils;
import lombok.AllArgsConstructor;
import org.bukkit.command.CommandSender;

import java.util.List;

@AllArgsConstructor
public enum GUI {

    TITLE("title"),
    SIZE("slots");

    private final String path;
    private final ConfigFile file = PermanentEffects.getInstance().getFileManager().getFile("gui");

    public void send(CommandSender sender) {
        if (file.getConfig().get(path) instanceof List)
            for (String message : file.getConfig().getStringList(path))
                sender.sendMessage(Utils.textColor(message));
        else sender.sendMessage(Utils.textColor(file.getConfig().getString(path)));
    }

    public String getMessage() {
        return Utils.textColor(file.getConfig().getString(path));
    }

    public Object get() {
        return file.getConfig().get(path);
    }

}

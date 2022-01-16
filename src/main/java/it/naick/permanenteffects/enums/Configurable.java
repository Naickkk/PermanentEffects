package it.naick.permanenteffects.enums;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.config.objects.ConfigFile;
import it.naick.permanenteffects.utils.Utils;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public enum Configurable {

    MSG_();

    private final String path;
    private final ConfigFile messages = PermanentEffects.getInstance().getFileManager().getFile("messages");
    private final FileConfiguration config = PermanentEffects.getInstance().getConfig();

    public void send(CommandSender sender) {
        if (file.getConfig().get(path) instanceof List)
            for (String message : file.getConfig().getStringList(path))
                sender.sendMessage(Utils.textColor(message));
        else sender.sendMessage(Utils.textColor(file.getConfig().getString(path)));
    }

    public String get() {
        return Utils.textColor(file.getConfig().getString(path));
    }

    public Object getConfig() {
        return config.get
    }

    public Object getGui() {

    }


}

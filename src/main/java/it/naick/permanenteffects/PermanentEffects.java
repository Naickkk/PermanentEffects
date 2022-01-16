package it.naick.permanenteffects;

import com.google.common.collect.Maps;
import it.naick.permanenteffects.config.FileManager;
import it.naick.permanenteffects.config.IFileManager;
import it.naick.permanenteffects.listeners.InventoryListener;
import it.naick.permanenteffects.objects.Effect;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Getter
public final class PermanentEffects extends JavaPlugin {

    public final static HashMap<String, Set<Effect>> PLAYERS = Maps.newHashMap();

    @Getter
    private static PermanentEffects instance;

    private IFileManager fileManager;

    @Override
    public void onLoad() {
        instance = this;

        this.fileManager = new FileManager();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        saveDefaultConfig();

        new InventoryListener(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}

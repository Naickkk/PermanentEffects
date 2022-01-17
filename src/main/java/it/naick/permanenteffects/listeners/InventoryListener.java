package it.naick.permanenteffects.listeners;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.enums.config.GUI;
import it.naick.permanenteffects.listeners.manager.ListenerManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener extends ListenerManager {

    public InventoryListener(PermanentEffects plugin) {
        super(plugin);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (!e.getClickedInventory().getTitle().equals(GUI.TITLE.getMessage())) e.setCancelled(true);
    }
}

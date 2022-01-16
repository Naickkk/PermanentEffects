package it.naick.permanenteffects.listeners;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.listeners.manager.ListenerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener extends ListenerManager {

    public InventoryListener(PermanentEffects plugin) {
        super(plugin);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        if (!e.getClickedInventory().getTitle().equals()) return;
    }
}

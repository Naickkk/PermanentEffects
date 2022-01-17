package it.naick.permanenteffects.commands;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.enums.config.GUI;
import it.naick.permanenteffects.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PermanentEffectsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        Inventory inventory = Bukkit.createInventory(null, (int) GUI.SIZE.get(), GUI.TITLE.getMessage());
        PermanentEffects.INTERFACE_ITEMS.forEach(interfaceItem -> inventory.setItem(interfaceItem.getSlot(), new ItemBuilder(interfaceItem.getMaterial(), interfaceItem.getDurability()).setLore(interfaceItem.getLore()).build()));

        player.openInventory(inventory);

        return true;
    }
}

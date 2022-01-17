package it.naick.permanenteffects.objects;

import it.naick.permanenteffects.PermanentEffects;
import it.naick.permanenteffects.config.objects.ConfigFile;
import it.naick.permanenteffects.utils.Utils;
import lombok.Getter;
import org.bukkit.Material;

import java.util.List;

public class InterfaceItem {

    @Getter
    private final int slot;
    @Getter
    private final Material material;
    @Getter
    private final short durability;
    @Getter
    private final List<String> lore;

    public InterfaceItem(int slot, Material material, short durability, List<String> lore) {
        this.slot = slot;
        this.material = material;
        this.durability = durability;
        this.lore = lore;
    }

    public static void loadAll() {
        ConfigFile file = PermanentEffects.getInstance().getFileManager().getFile("gui");

        for (String item : file.getConfig().getConfigurationSection("items").getKeys(false)) {
            PermanentEffects.INTERFACE_ITEMS.add(
                    new InterfaceItem(
                            Integer.parseInt(item),
                            Material.valueOf(file.getConfig().getString("items." + item + ".material")),
                            (Short) file.getConfig().get("items." + item + ".durability"),
                            Utils.textColor(file.getConfig().getStringList("items." + item + ".lore"))));
        }
    }
}

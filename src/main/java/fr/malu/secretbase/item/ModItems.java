package fr.malu.secretbase.item;

import fr.malu.secretbase.SecretBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item REMOTE_CONTROL = registerItem("remote_control",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SecretBase.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SecretBase.LOGGER.info("Registering Mod Items for " + SecretBase.MOD_ID);
    }
}

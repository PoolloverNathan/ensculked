package com.sculkman.ensculked.item;

import com.sculkman.ensculked.Ensculked;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.tools.Tool;

public class ModItems {
    public static final Item HEART_CATALYST = registerItem("heart_catalyst", new Item(new FabricItemSettings()));
    public static final Item SCULK_POTION = registerItem("sculk_potion", new Item(new FabricItemSettings()));
    public static final Item CATALYST_FRAGMENT = registerItem("catalyst_fragment", new Item(new FabricItemSettings()));
    public static final Item WARDEN_HEART = registerItem("warden_heart", new Item(new FabricItemSettings()));
    public static final Item SOUL_BOOK = registerItem("soul_book", new Item(new FabricItemSettings()));
    public static final Item SOUL_SNATCHER = registerItem("soul_snatcher",
            new SwordItem(ModToolMaterials.ToolMaterials.CATALYST, 0, -1f, new FabricItemSettings().maxCount(1)));
    public static final Item PLAYER_SOUL = registerItem("player_soul", new Item(new FabricItemSettings()));
    public static final Item SCULK_PILE = registerItem("sculk_pile", new Item(new FabricItemSettings()));
    public static final Item CLAW_OF_D = registerItem("claw_of_d",
            new SwordItem(ModToolMaterials.ToolMaterials.CATALYST, 2, 0f, new FabricItemSettings().maxCount(1)));
    public static final Item PRAETORIAN = registerItem("praetorian",
            new SwordItem(ModToolMaterials.ToolMaterials.CATALYST, 6, -3.5f, new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ensculked.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        Ensculked.LOGGER.info("Registering mod items for " + Ensculked.MOD_ID);
    }
}


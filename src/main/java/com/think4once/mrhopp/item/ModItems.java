package com.think4once.mrhopp.item;

import com.think4once.mrhopp.MrHopp;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PLASTIC = registerItem("plastic", new Item(new Item.Settings()));
    public static final Item RAW_PLASTIC = registerItem("raw_plastic", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MrHopp.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MrHopp.LOGGER.info("Registering mod items for " + MrHopp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLASTIC);
            entries.add(RAW_PLASTIC);
        });
    }

}

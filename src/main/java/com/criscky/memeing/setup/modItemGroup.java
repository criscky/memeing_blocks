package com.criscky.memeing.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class modItemGroup extends ItemGroup {

    public static final modItemGroup MEMEING = new modItemGroup(ItemGroup.TABS.length,
            "memeing");

    public modItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(modBlocks.OGEY_BLOCK.get().asItem());
    }

    static void register(){}
}

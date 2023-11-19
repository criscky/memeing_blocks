package com.criscky.memeing.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static final RegistryObject<Block> OGEY_BLOCK = register("ogey", () -> new Block(AbstractBlock.Properties.of(Material.CLAY)));

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(modItemGroup.MEMEING)));
        return ret;
    }

    static void register(){}
}

package com.criscky.memeing.data;

import com.criscky.memeing.memeing;
import com.criscky.memeing.setup.modBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class modRecipeProvider  extends RecipeProvider {
    public modRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }


    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(modBlocks.OGEY_BLOCK.get())
                .define('n', Items.DIRT)
                .pattern("   ")
                .pattern(" n ")
                .pattern("   ")
                .unlockedBy("has_item", has(Items.DIRT))
                .save(consumer, modId("ogey"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(memeing.MOD_ID, path);
    }

}

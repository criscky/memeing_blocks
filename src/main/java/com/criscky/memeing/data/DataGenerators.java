package com.criscky.memeing.data;

import com.criscky.memeing.data.client.blockStateProvider;
import com.criscky.memeing.data.client.itemModelsProvider;
import com.criscky.memeing.memeing;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = memeing.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators(){}


    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();


        gen.addProvider(new blockStateProvider(gen, existingFileHelper));
        gen.addProvider(new itemModelsProvider(gen, existingFileHelper));



        gen.addProvider(new modLootTables(gen));
        gen.addProvider(new modRecipeProvider(gen));
    }
}

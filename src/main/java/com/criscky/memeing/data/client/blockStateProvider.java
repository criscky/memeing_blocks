package com.criscky.memeing.data.client;

import com.criscky.memeing.memeing;
import com.criscky.memeing.setup.modBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class blockStateProvider extends BlockStateProvider {
    public blockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, memeing.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(modBlocks.OGEY_BLOCK.get());
    }
}

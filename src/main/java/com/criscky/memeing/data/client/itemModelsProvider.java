package com.criscky.memeing.data.client;

import com.criscky.memeing.memeing;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class itemModelsProvider extends ItemModelProvider {

    public itemModelsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, memeing.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        withExistingParent("ogey", modLoc("block/ogey"));

    }

    private void builder(ModelFile itemgenerated, String name) {
        getBuilder(name).parent(itemgenerated).texture("layer0", "item/" +name);
    }
}

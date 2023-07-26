package com.shadowshae25.cropcraft.init.items;

import com.shadowshae25.cropcraft.Cropcraft;
import com.shadowshae25.cropcraft.init.blocks.blockInit;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class itemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cropcraft.MOD_ID);

    //Makes a blueberry
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance).stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    //Makes blueberry seeds
    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            ()-> new ItemNameBlockItem(blockInit.BLUEBERRY_BUSH.get(),
                    new Item.Properties().tab(ModCreativeTab.instance)));

    //Makes a banana
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance).food(new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));


    //Inner class for creative tab
    public static final class ModCreativeTab extends CreativeModeTab {
        //Description: Creates a creative mode tab
        //Variables: int index, String label
        //Return: void
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        //Description: Sets icon for creative mode tab
        //Variables: None
        //Return: ItemStack
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(BANANA.get());
        }


        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "tutorialmod"); //set the tab index and label
    }
}

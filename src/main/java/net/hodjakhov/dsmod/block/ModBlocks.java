package net.hodjakhov.dsmod.block;


import net.hodjakhov.dsmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.hodjakhov.dsmod.DsMod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DsMod.MOD_ID);


    public static final RegistryObject<Block> FIRE = registryBlock("fire",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> VITSWORD = registryBlock("vitsword",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> ATROTIAS = registryBlock("atrotias",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> GG = registryBlock("gg",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);




    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab  tab){
        RegistryObject<T> toReturns = BLOCKS.register(name,block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}

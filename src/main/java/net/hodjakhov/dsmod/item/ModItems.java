package net.hodjakhov.dsmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.hodjakhov.dsmod.DsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DsMod.MOD_ID);

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }

    private static final RegistryObject<Item> SOLER = ITEMS.register("soler",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)));



    private static final RegistryObject<Item> ESTUS = ITEMS.register("estus",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)));


    private static final RegistryObject<Item> ESTUSM = ITEMS.register("estusm",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)));


    private static final RegistryObject<Item> IS = ITEMS.register("is",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)));




}

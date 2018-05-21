package com.snackhole.simplefoods;

import com.snackhole.simplefoods.items.ModItems;
import com.snackhole.simplefoods.proxy.IProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SimpleFoodsMain.MODID, version = SimpleFoodsMain.VERSION)
public class SimpleFoodsMain {
    public static final String MODID = "simplefoods";
    public static final String VERSION = "1";
    @SidedProxy(clientSide = "com.snackhole.simplefoods.proxy.ClientProxy", serverSide = "com.snackhole.simplefoods.proxy.ServerProxy")
    public static IProxy proxy;
    @Mod.Instance
    public static SimpleFoodsMain simpleFoodsMainInstance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    public SimpleFoodsMain() {
        simpleFoodsMainInstance = this;
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();
        }
    }
}

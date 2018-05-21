package com.snackhole.simplefoods.proxy;

import com.snackhole.simplefoods.SimpleFoodsMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ClientProxy implements IProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {

    }

    @Override
    public EntityPlayer getPlayerEntityFromContext(net.minecraftforge.fml.common.network.simpleimpl.MessageContext parContext) {
        return (parContext.side.isClient() ? Minecraft.getMinecraft().player : parContext.getServerHandler().player);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SimpleFoodsMain.MODID + ":" + id, "inventory"));
    }
}

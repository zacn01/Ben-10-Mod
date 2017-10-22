package com.ben10.mod;



import net.minecraftforge.fml.common.Mod;
import com.ben10.mod.items.Ben10ModItems;
import net.minecraftforge.fml.common.Mod.EventHandler;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;



@Mod(modid = Ben10Mod.MODID, version = Ben10Mod.VERSION)
@SidedProxy(clientSide="com.ben10.mod.proxy.ClientProxy", serverSide="com.ben10.mod.proxy.ServerProxy")

public static CommonProxy proxy;

public class Ben10Mod

{

    public static final String MODID = "ben10";

    public static final String VERSION = "a0.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(e);
        ModItems.init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postinit(e);
    }

}

package com.ben10.mod.proxy;

import com.ben10.mod.proxy.CommonProxy;
import net.minecraftforge.common.event.FMLInitializationEvent;
import net.minecraftforge.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {

        @Override
        public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

}

package me.codecraft.sunhurt.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class SunhurtClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello Fabric world!");
    }
}

package com.example.my_mod;

import net.fabricmc.api.ModInitializer;

public class MyMod implements ModInitializer {
    public static final String MOD_ID = "my_mod";

    @Override
    public void onInitialize() {
        System.out.println("My Mod loaded");
    }
}

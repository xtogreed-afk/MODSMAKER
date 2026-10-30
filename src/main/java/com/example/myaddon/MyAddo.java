package com.example.myaddon;

import net.fabricmc.api.ModInitializer;

public class MyAddo implements ModInitializer {
    public static final String MOD_ID = "myaddon";

    @Override
    public void onInitialize() {
        System.out.println("My Addo loaded");
    }
}

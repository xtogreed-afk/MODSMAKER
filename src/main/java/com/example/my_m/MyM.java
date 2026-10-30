package com.example.my_m;

import net.fabricmc.api.ModInitializer;

public class MyM implements ModInitializer {
    public static final String MOD_ID = "my_m";

    @Override
    public void onInitialize() {
        System.out.println("My M loaded");
    }
}

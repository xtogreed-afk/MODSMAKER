package com.example.my

import net.fabricmc.api.ModInitializer

object My : ModInitializer {
    const val MOD_ID = "my"

    override fun onInitialize() {
        println("My loaded")
    }
}

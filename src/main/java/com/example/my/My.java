package com.example.my

import net.fabricmc.api.ModInitializer

object My private constructor() : ModInitializer {
   @JvmStatic
   public My INSTANCE = new My();

   public const val MOD_ID: String = "my"


   public open fun onInitialize() {
      System.out.println("My loaded");
   }
}

package de.axelrindle.chickendropfeathersmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Collections;

@Mod(
        name = ChickenDropFeathersMod.NAME,
        modid = ChickenDropFeathersMod.MODID,
        version = ChickenDropFeathersMod.VERSION
)
public class ChickenDropFeathersMod {

    public static final String NAME = "@NAME@";
    public static final String MODID = "@MODID@";
    public static final String VERSION = "@VERSION@";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModMetadata meta = event.getModMetadata();

        meta.autogenerated = false;
        meta.modId = MODID;
        meta.name = NAME;
        meta.version = VERSION;
        meta.description = "@DESCRIPTION@";
        meta.url = "@PROJECT_URL@";
        meta.authorList = Collections.singletonList("Axel Rindle");
        meta.credits = "Thanks to Mojang as well as the Forge and FML guys.";
        meta.logoFile = "logo.png";
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EntitySpawnHandler());
    }
}

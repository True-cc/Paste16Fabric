package uwu.smsgamer.paste.paste16fabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import uwu.smsgamer.paste.paste16fabric.command.CommandManager;
import uwu.smsgamer.paste.paste16fabric.config.ConfigManager;
import uwu.smsgamer.paste.paste16fabric.module.ModuleManager;

import java.io.File;

public class Paste16Fabric implements ModInitializer {
    private static Paste16Fabric instance;

    public static Paste16Fabric getInstance() {
        if (instance == null) instance = new Paste16Fabric();
        return instance;
    }

    public static File getModDirectory() {
        return MinecraftClient.getInstance().runDirectory;
    }

    @Override
    public void onInitialize() {
        System.out.println("Starting Paste16Fabric...");

        ModuleManager.getInstance();
        CommandManager.getInstance();

        ConfigManager.getInstance().loadConfig("config.yml");
    }

    public void onDisable() {
        ConfigManager.getInstance().saveConfig("config.yml");
    }
}

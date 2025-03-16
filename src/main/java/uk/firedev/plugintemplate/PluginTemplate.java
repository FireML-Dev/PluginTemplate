package uk.firedev.plugintemplate;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

    private static PluginTemplate instance;

    public PluginTemplate() {
        if (instance != null) {
            throw new UnsupportedOperationException(getClass().getName() + " has already been assigned!");
        }
        instance = this;
    }

    public static PluginTemplate getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {}

    @Override
    public void onEnable() {}

    @Override
    public void onDisable() {}

}
package uk.firedev.plugintemplate;

import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import uk.firedev.daisylib.DaisyLib;

public final class PluginTemplate extends JavaPlugin {

    private static PluginTemplate INSTANCE;

    public PluginTemplate() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException(getClass().getName() + " has already been assigned!");
        }
        INSTANCE = this;
    }

    public static @NotNull PluginTemplate getInstance() {
        if (INSTANCE == null) {
            throw new IllegalStateException(PluginTemplate.class.getSimpleName() + " has not been assigned!");
        }
        return INSTANCE;
    }

    @Override
    public void onLoad() {}

    @Override
    public void onEnable() {
        // This has to be done in the onEnable method.
        DaisyLib.get().init(this);
    }

    @Override
    public void onDisable() {}

    private void registerCommands() {
        this.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
            // Register Brigadier commands here.
            // commands.registrar().register(MyCommand.get());
        });
    }

}

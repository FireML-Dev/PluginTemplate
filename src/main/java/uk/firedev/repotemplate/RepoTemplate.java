package uk.firedev.repotemplate;

import org.bukkit.plugin.java.JavaPlugin;

public final class RepoTemplate extends JavaPlugin {

    private static RepoTemplate instance;

    public RepoTemplate() {
        if (instance != null) {
            throw new UnsupportedOperationException(getClass().getName() + " has already been assigned!");
        }
        instance = this;
    }

    public static RepoTemplate getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {}

    @Override
    public void onEnable() {}

    @Override
    public void onDisable() {}

}
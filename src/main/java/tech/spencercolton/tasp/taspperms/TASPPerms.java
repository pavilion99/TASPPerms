package tech.spencercolton.tasp.taspperms;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TASPPerms extends JavaPlugin {

    @Override
    public void onEnable() {
        Plugin p = this.getServer().getPluginManager().getPlugin("TASP");

        if(p == null) {
            this.getLogger().severe("TASP plugin not loaded.");
            this.getServer().getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {

    }

}

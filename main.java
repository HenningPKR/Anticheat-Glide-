package de.henningpkr.anticheat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.henningpkr.anticheat.modules.Glide;


public class main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new Glide(), this);
	}

}

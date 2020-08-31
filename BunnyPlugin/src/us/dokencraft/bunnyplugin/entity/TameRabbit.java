package us.dokencraft.bunnyplugin.entity;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;

import jdk.jfr.internal.tool.Main;

public class TameRabbit implements Entity{
	
	private static Main plugin;
	
	public TameRabbit(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getEntity(uuid)
		
	}

}

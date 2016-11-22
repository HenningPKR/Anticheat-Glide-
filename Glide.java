package de.henningpkr.anticheat.modules;


import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import net.minecraft.server.v1_8_R3.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.material.*;
import org.bukkit.event.player.PlayerMoveEvent;







public class Glide implements Listener{
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		if(e.getTo().getY() - e.getFrom().getY() == -10.10000D) 
			e.getTo().clone().subtract(0.0D, 1.0D, 0.0D).getBlock().getType().equals(Material.AIR);
			e.setCancelled(true);
			e.getPlayer().sendMessage("§4PHAX!");
		return;
	}
}

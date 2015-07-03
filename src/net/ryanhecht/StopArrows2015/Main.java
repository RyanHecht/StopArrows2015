package net.ryanhecht.StopArrows2015;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Time to #StopArrows2015");
	}
	@Override
	public void onDisable() {
		getLogger().info("The arrows shall run rampant once more.");
	}
	@EventHandler
	public void onMinecartBreak(VehicleDestroyEvent e) {
		if(e.getVehicle() instanceof Minecart) {
			if(e.getAttacker() instanceof Player) {
				e.setCancelled(true);
			}
		}
	}
}

package com.aicontroller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class AIActionExecutor {

    public void runCommand(String command) {
        Bukkit.getScheduler().runTaskAsynchronously(
                Bukkit.getPluginManager().getPlugin("AIController"),
                () -> Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command)
        );
    }

    public void kickPlayer(String playerName, String reason) {
        Player player = Bukkit.getPlayer(playerName);
        if (player != null) {
            player.kickPlayer(reason);
        }
    }

    public void broadcast(String message) {
        Bukkit.getScheduler().runTaskAsynchronously(
                Bukkit.getPluginManager().getPlugin("AIController"),
                () -> Bukkit.broadcastMessage(message)
        );
    }

    // More actions like spawning NPCs can be added here later
}

package com.aicontroller;

import org.bukkit.plugin.java.JavaPlugin;

public class AIController extends JavaPlugin {

    private AIHttpClient aiHttpClient;
    private AIActionExecutor actionExecutor;

    @Override
    public void onEnable() {
        getLogger().info("AIController enabled!");

        // Initialize helper classes
        aiHttpClient = new AIHttpClient("http://localhost:5000/command");
        actionExecutor = new AIActionExecutor();

        // Example: send test command to AI backend
        String response = aiHttpClient.sendCommand("{\"prompt\":\"Say hello in Minecraft chat\"}");
        getLogger().info("AI response: " + response);

        // Example: broadcast message in game
        actionExecutor.broadcast("AIController is now running!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AIController disabled!");
    }

    public AIHttpClient getAiHttpClient() {
        return aiHttpClient;
    }

    public AIActionExecutor getActionExecutor() {
        return actionExecutor;
    }
}

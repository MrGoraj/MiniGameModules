package me.goraj.minigamemodules.api.model;

import org.bukkit.entity.Player;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class TeamEntity {

    private final String name;
    private final Color color;
    private final boolean friendlyFire;
    private final Set<Player> members = new HashSet<>();
    static Set<TeamEntity> instances = new HashSet<>();

    public TeamEntity(String name, Color color, boolean friendlyFire) {
        this.name = name;
        this.color = color;
        this.friendlyFire = friendlyFire;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    public Set<Player> getMembers() {
        return members;
    }

    public static Set<TeamEntity> getInstances() {
        return instances;
    }
}

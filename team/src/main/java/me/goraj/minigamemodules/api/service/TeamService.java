package me.goraj.minigamemodules.api.service;

import me.goraj.minigamemodules.api.model.TeamEntity;
import org.bukkit.entity.Player;

public interface TeamService {

    default void addPlayerToTeam(Player player, TeamEntity team) {
        removePlayerFromTeam(player);
        team.getMembers().add(player);
    }

    default void removePlayerFromTeam(Player player, TeamEntity team) {
        team.getMembers().remove(player);
    }

    default void removePlayerFromTeam(Player player) {
        for (TeamEntity team : TeamEntity.getInstances()) {
            team.getMembers().remove(player);
        }
    }

    default int teamMembersCounter(TeamEntity team) {
        return team.getMembers().size();
    }

    default boolean isPlayerInTeam(Player player) {
        boolean isInTeam = false;
        for (TeamEntity team : TeamEntity.getInstances()) {
            isInTeam = team.getMembers().contains(player);
        }
        return isInTeam;
    }
}

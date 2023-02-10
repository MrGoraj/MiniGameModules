package me.goraj.minigamemodules.paper_1_19_3_R0_1.listener;

import me.goraj.minigamemodules.api.model.TeamEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class TeamListener implements Listener {

    @EventHandler
    void friendlyFireDamage(EntityDamageByEntityEvent damageByEntityEvent) {
        Player attacker = (Player) damageByEntityEvent.getDamager();
        Player victim = (Player) damageByEntityEvent.getEntity();

        for (TeamEntity team : TeamEntity.getInstances()) {
            if (team.getMembers().contains(attacker) && team.getMembers().contains(victim)) {
                damageByEntityEvent.setCancelled(true);
            }
        }
    }
}

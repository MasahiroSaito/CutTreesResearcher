package com.masahirosaito.spigot.cuttreesresearcher.listeners

import com.masahirosaito.spigot.cuttrees.events.CutTreesToolDamageEvent
import com.masahirosaito.spigot.cuttrees.utils.getRemainingDurability
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener

class ToolDamageEventListener : Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    fun onToolDamage(event: CutTreesToolDamageEvent) {
        if (event.isCancelled) return

        val player = event.player
        val tool = player.tool

        player.player.sendMessage(buildString {
            append("【Tool】")
            append("CanBeDamaged: ${tool.canBeDamaged()}").append(", ")
            append("Damage: ${tool.calcDamage(event.tree)}").append(", ")
            append("Durability: ${tool.itemStack.getRemainingDurability()}")

            player.DamageToTool(event.tree)

            append(" -> ${tool.itemStack.getRemainingDurability()}")
        })

        event.cancel()
    }
}
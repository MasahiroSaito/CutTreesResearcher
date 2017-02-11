package com.masahirosaito.spigot.cuttreesresearcher.listeners

import com.masahirosaito.spigot.cuttrees.events.CutTreesBreakEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener

class CutTreesBreakEventListener : Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    fun onCutTreesBreak(event: CutTreesBreakEvent) {
        val tree = event.tree
        val player = event.player

        player.player.sendMessage(buildString {
            append("【Tree】")
            append("Blocks: ${tree.blocks.size}").append(", ")
            append("Leaves: ${tree.leaves.size}")
        })
    }
}
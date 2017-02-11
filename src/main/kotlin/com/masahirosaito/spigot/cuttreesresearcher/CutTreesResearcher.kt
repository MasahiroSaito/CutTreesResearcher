package com.masahirosaito.spigot.cuttreesresearcher

import com.masahirosaito.spigot.cuttrees.utils.register
import com.masahirosaito.spigot.cuttreesresearcher.listeners.CutTreesBreakEventListener
import org.bukkit.plugin.java.JavaPlugin

class CutTreesResearcher : JavaPlugin() {

    override fun onEnable() {
        CutTreesBreakEventListener().register(this)
    }

    override fun onDisable() {

    }
}

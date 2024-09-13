package me.slide.xprenamefixer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class XpRenameFixer extends JavaPlugin implements Listener {

    @EventHandler
    public void renameEvent(PrepareAnvilEvent event){
        if(event.getView().getItem(1).getData().getItemType().isAir() && !event.getView().getRenameText().isEmpty()){
            event.getView().setRepairCost(1);
        }
    }
}

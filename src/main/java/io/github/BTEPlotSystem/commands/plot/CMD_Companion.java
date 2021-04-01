package github.BTEPlotSystem.commands.plot;

import github.BTEPlotSystem.core.menus.CompanionMenu;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.sql.SQLException;
import java.util.logging.Level;

public class CMD_Companion implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player){
            if(sender.hasPermission("alpsbte.plot")) {
                new CompanionMenu((Player) sender);
            }
        }
        return true;
    }
}
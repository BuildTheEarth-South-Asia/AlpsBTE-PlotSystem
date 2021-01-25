package github.BTEPlotSystem.commands;

import github.BTEPlotSystem.BTEPlotSystem;
import github.BTEPlotSystem.core.Review;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.sql.SQLException;

public class CMDReview implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player)commandSender;
            if (commandSender.hasPermission("alpsbte.review")){
                try {
                    Bukkit.getPluginManager().registerEvents(new Review(player), BTEPlotSystem.getPlugin());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    player.sendMessage("§4SQL Error!");
                }
            }
        }
        return false;
    }
}

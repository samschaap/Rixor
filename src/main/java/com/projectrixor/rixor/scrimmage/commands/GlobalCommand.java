package com.projectrixor.rixor.scrimmage.commands;

import com.projectrixor.rixor.scrimmage.Rixor;
import com.projectrixor.rixor.scrimmage.player.Client;
import com.projectrixor.rixor.scrimmage.api.PlayerChatEvent;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlobalCommand  {


	@Command(aliases = { "g", "global"}, desc = "Speaks in Global Chat", usage = "[message]", min = 1, max = -1)
	public static void global(final CommandContext args, CommandSender sender) throws Exception {

		String message = "";

		message = args.getJoinedStrings(0);
		Rixor.callEvent(new PlayerChatEvent(Client.getClient((Player)sender),message,false));
	}
	
}

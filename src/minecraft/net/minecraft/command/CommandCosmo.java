package net.minecraft.command;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class CommandCosmo extends CommandBase
{
    /**
     * Check if the given ICommandSender has permission to execute this command
     */
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return server.isSinglePlayer() || super.checkPermission(server, sender);
    }

    /**
     * Gets the name of the command
     */
    public String getCommandName()
    {
        return "cosmo";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    /**
     * Gets the usage string for the command.
     */
    public String getCommandUsage(ICommandSender sender)
    {
        return "commands.cosmo.usage";
    }

    /**
     * Callback for when the command is executed
     */
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        sender.addChatMessage(new TextComponentTranslation("commands.cosmo.success", new Object[] {"You have run COSMO"}));
        //sender.addChatMessage(new TextComponentTranslation("commands.seed.success", new Object[] {Long.valueOf(world.getSeed())}));
    }
}

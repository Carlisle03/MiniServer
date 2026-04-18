package carlisle.MiniServer.commands;

import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.LivingEntity;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.damage.DamageType;

public class KillCommand extends Command {

    public KillCommand() {
        super("kill", "k");
        
        setDefaultExecutor((sender, context) -> {
        	if (!(sender instanceof Player player)) {
                sender.sendMessage("This command can only be used by a player.");
                return;
                
            }
        	player.setGameMode(GameMode.SURVIVAL);
        	player.damage(DamageType.GENERIC, 38*10f);
        	sender.sendMessage(player.getUsername() + "'s health became null");
        	player.setGameMode(GameMode.CREATIVE);
        	
        });

    }
}

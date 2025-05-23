package ti4.commands.omega_phase;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import ti4.commands.GameStateSubcommand;
import ti4.helpers.Constants;
import ti4.helpers.omega_phase.PriorityTrackHelper;

class PrintPriorityTrack extends GameStateSubcommand {
    public PrintPriorityTrack() {
        super(Constants.PRINT_PRIORITY_TRACK, "Print the current Priority Track", false, false);
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        PriorityTrackHelper.PrintPriorityTrack(getGame());
    }
}

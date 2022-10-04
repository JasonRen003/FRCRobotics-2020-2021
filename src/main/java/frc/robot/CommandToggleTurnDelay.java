//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandToggleTurnDelay extends CommandBase {
    private HazyMechBase c_ToggleTurnDelay;
    public CommandToggleTurnDelay(HazyMechBase base){
        c_ToggleTurnDelay = base;
        addRequirements(c_ToggleTurnDelay);
    }
    
   
    public void execute(){ 
        c_ToggleTurnDelay.toggleTurnDelay();
    }

}
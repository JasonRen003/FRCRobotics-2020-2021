//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandToggleDelay extends CommandBase {
    private HazyMechBase c_ToggleDelay;
    public CommandToggleDelay(HazyMechBase base){
        c_ToggleDelay = base;
        addRequirements(c_ToggleDelay);    
}
    
    public void execute(){ 
        c_ToggleDelay.toggleDelayed();
    }

   
}
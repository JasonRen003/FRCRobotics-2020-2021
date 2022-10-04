//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandToggleColorArm extends CommandBase {
    private HazyColorArm c_ToggleColorArm;
    public CommandToggleColorArm(HazyColorArm arm){
        c_ToggleColorArm = arm;
        addRequirements(c_ToggleColorArm);
    }
    public void execute(){ 
        c_ToggleColorArm.moveToggle();
    }

}
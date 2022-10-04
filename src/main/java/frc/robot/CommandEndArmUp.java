//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandEndArmUp extends CommandBase {
    private HazyEndArm c_EndArmUp;
    public CommandEndArmUp(HazyEndArm arm){
        c_EndArmUp = arm;
        addRequirements(c_EndArmUp);
    }
    
    public void execute(){
        c_EndArmUp.foldUp();
        //System.out.println("Pressed End Arm Up");
    }

}
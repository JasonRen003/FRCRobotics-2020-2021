//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandEndArmDown extends CommandBase {
    private HazyEndArm c_EndArmDown;
    public CommandEndArmDown(HazyEndArm arm){
        c_EndArmDown = arm;
        addRequirements(c_EndArmDown);
    }

    public void execute(){
        c_EndArmDown.foldDown();
        //System.out.println("Pressed End Arm Down");
    }

}
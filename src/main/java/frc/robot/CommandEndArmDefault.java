//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandEndArmDefault extends CommandBase {
    private HazyEndArm c_EndArm;
    public CommandEndArmDefault(HazyEndArm arm ){
        c_EndArm = arm;


        addRequirements(c_EndArm);
    }
  

    public void execute(){
        c_EndArm.stopMotors();
    }

   
}
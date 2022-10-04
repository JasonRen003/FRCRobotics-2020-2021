//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.DriverStation;

public class CommandColorArmDefault extends CommandBase {

    private HazyColorArm c_ColorArmDefault;
    public CommandColorArmDefault(HazyColorArm arm ){
        c_ColorArmDefault = arm;
        addRequirements(c_ColorArmDefault);
    }
    

    public void execute(){ 
       
        c_ColorArmDefault.goToColor('B');
        c_ColorArmDefault.spinWheel(4);
    }

}
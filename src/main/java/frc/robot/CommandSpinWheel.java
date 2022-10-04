//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSpinWheel extends CommandBase {
    private HazyColorArm c_SpinWheel;
    public CommandSpinWheel(HazyColorArm arm){
        c_SpinWheel = arm;
        addRequirements(c_SpinWheel);
    }
    
    public void execute(){
        c_SpinWheel.setInitColor();
        c_SpinWheel.spinToggle();
        //System.out.println("Pressed Spin Color Wheel");
    }
}
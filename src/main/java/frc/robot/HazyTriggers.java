//Imports fot the Joysticks and its functions
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;


public class HazyTriggers extends XboxController {
    
    public HazyTriggers(int p){
        super(p);
    }

    public boolean getLeftAxis(){
        return this.getLeftTriggerAxis() > .1;
    }

    public boolean getRightAxis(){
        return this.getRightTriggerAxis() > .1;
    }
}
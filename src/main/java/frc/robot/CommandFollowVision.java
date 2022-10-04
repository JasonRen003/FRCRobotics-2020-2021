//Imports fot the Command
package frc.robot;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

public class CommandFollowVision extends CommandBase {
    private HazyMechBase c_PreciseMecanum;
    

    

    public CommandFollowVision(HazyMechBase base){
        c_PreciseMecanum = base;
        addRequirements(c_PreciseMecanum);    
}

    @Override
    public void execute(){
        //c_PreciseMecanum.driveCartesian(0, -.25*c_leftJoystick.getY(), -.25*c_rightJoystick.getX());
        c_PreciseMecanum.readData();
        c_PreciseMecanum.goToTarget();
        
    }

}
//Imports fot the Command
package frc.robot;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

public class CommandPreciseMecanum extends CommandBase {
    private HazyMechBase c_PreciseMecanum;
    
    private final Joystick c_leftJoystick;
    private final Joystick c_rightJoystick;
    

    public CommandPreciseMecanum(HazyMechBase base, Joystick left, Joystick right){
        c_PreciseMecanum = base;
        c_leftJoystick = left;
        c_rightJoystick = right;
        addRequirements(c_PreciseMecanum);    
}

    public void execute(){
        c_PreciseMecanum.driveCartesian(0, -.25*c_leftJoystick.getY(), -.25*c_rightJoystick.getX());
        c_PreciseMecanum.readData();
    }

}
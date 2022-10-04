//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandShooterDefault extends CommandBase {
    private HazyShooter c_Shooter;
    public CommandShooterDefault(HazyShooter shooter){
        c_Shooter = shooter;
        addRequirements(c_Shooter);
    }

    public void execute(){
        //c_Shooter.toggleFeederMove();
        c_Shooter.stopShooter();
        c_Shooter.stopHighFeeder();
    }

   
}
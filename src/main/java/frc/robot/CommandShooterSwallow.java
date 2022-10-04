//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandShooterSwallow extends CommandBase {
    private HazyShooter c_ShooterSwallow;
    public CommandShooterSwallow(HazyShooter shooter){
        c_ShooterSwallow = shooter;
        addRequirements(c_ShooterSwallow);
    }
    

    public void execute(){
        //c_ShooterSwallow.shooterSwallow();
        //System.out.println("Pressed Shooter Swallow");
    }
}
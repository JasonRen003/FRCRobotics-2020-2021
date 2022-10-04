//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandShooterSpit extends CommandBase {
    private HazyShooter c_ShooterSpit;
    public CommandShooterSpit(HazyShooter shooter){
        c_ShooterSpit = shooter;
        addRequirements(c_ShooterSpit);
    }
    
    public void execute(){
        c_ShooterSpit.shooterSpit();
        //System.out.println("Pressed Shooter Spit");
    }
}
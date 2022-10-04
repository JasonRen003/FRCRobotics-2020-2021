///Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.*;

public class CommandHighFeedDefault extends CommandBase {

    private HazyHighFeeder c_hazyHighFeeder;
    private HazyShooter c_hazyShooter;
    public CommandHighFeedDefault(HazyHighFeeder feeder, HazyShooter shooter){
        c_hazyHighFeeder = feeder;
        c_hazyShooter = shooter;
        addRequirements(c_hazyHighFeeder);
    }

    public void execute(){
        if(c_hazyShooter.getShooterRPM() >= RobotMap.SHOOTERSETPOINT)
            c_hazyHighFeeder.feedWhileShooting(true);
        else    
            c_hazyHighFeeder.feedWhileShooting(false);
    }
}
 
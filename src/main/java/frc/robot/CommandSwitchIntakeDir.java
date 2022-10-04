//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSwitchIntakeDir extends CommandBase {
    private HazyIntake c_Intake;
    public CommandSwitchIntakeDir(HazyIntake intake){
        c_Intake = intake;
        addRequirements(c_Intake);
    }
    
    public void execute(){
        c_Intake.switchDir();
        //System.out.println("SWITHCINTAKEDIR");
    }

}
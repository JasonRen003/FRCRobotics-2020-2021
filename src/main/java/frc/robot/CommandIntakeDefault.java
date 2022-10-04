//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandIntakeDefault extends CommandBase {
    private HazyIntake c_Intake;
    public CommandIntakeDefault(HazyIntake intake){
        c_Intake = intake;
        addRequirements(c_Intake);
    }
    
    public void execute(){
        c_Intake.moveIntake();
        c_Intake.intakeStopSpin();
    }

    public boolean isFinished(){
        return false;
    }

    

}
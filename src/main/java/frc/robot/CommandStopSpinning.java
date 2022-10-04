//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandStopSpinning extends CommandBase {
    private HazyIntake c_StopSpinning;
    public CommandStopSpinning(HazyIntake intake){
        c_StopSpinning = intake;
        addRequirements(c_StopSpinning);
    }
    
   public void execute(){
    c_StopSpinning.intakeStopSpin();
        //System.out.println("Pressed Drop Intake");
    }

   
}
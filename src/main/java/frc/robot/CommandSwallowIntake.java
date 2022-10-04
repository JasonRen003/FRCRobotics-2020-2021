//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSwallowIntake extends CommandBase {
    private HazyIntake c_SwallowIntake;
    public CommandSwallowIntake(HazyIntake intake)
    {
        c_SwallowIntake = intake;
        addRequirements(c_SwallowIntake);
    }
    
    public void execute()
    {
        c_SwallowIntake.intakeSwallow();
        //System.out.println("Pressed Swallow intake");
    }

}
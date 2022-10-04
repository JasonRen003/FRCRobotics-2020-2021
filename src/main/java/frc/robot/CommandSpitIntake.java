//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSpitIntake extends CommandBase {
    private HazyIntake c_SpitIntake;
    public CommandSpitIntake(HazyIntake intake)
    {
        c_SpitIntake = intake;
        addRequirements(c_SpitIntake);
    }
    
    public void execute()
    {
        c_SpitIntake.intakeSpit();
        //System.out.println("Pressed Spit Intake");
    }

}
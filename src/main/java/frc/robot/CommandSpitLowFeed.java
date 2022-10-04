//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSpitLowFeed extends CommandBase {
    private HazyLowFeeder c_SpitLowFeed;
    public CommandSpitLowFeed(HazyLowFeeder feeder){
        c_SpitLowFeed = feeder;
        addRequirements(c_SpitLowFeed);
    }
    
    public void execute(){
        c_SpitLowFeed.spit();
        //System.out.println("Pressed Move Low Feed");
    }
}
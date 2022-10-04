//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSwallowLowFeed extends CommandBase {
    private HazyLowFeeder c_SwallowLowFeed;
    public CommandSwallowLowFeed(HazyLowFeeder feeder){
        c_SwallowLowFeed = feeder;
        addRequirements(c_SwallowLowFeed);
    }
    public void execute(){
        c_SwallowLowFeed.swallow();
        //System.out.println("Pressed Move Low Feed");
    }
}
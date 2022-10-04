//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandLowFeedDefault extends CommandBase {
    private HazyLowFeeder c_LowFeedDefault;
    public CommandLowFeedDefault(HazyLowFeeder feeder){
        c_LowFeedDefault = feeder;
        addRequirements(c_LowFeedDefault);
    }

    public void execute(){
        c_LowFeedDefault.stop();
    }
}

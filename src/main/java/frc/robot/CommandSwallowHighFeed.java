//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandSwallowHighFeed extends CommandBase {
    private HazyHighFeeder c_SwallowHighFeed;
    public CommandSwallowHighFeed(HazyHighFeeder feeder){
        c_SwallowHighFeed = feeder;
        addRequirements(c_SwallowHighFeed);    
}
    
   public void execute(){
    c_SwallowHighFeed.swallow();
        //System.out.println("Pressed Move High Feed");
    }

}
//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandFoldUp extends CommandBase {
    private HazyColorArm c_FoldUp;
    public CommandFoldUp(HazyColorArm arm){
        c_FoldUp = arm;
        addRequirements(c_FoldUp);
    }
    
    public void execute(){
        c_FoldUp.foldUp();
    }

}
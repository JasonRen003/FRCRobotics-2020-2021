//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandFoldDown extends CommandBase {
    private HazyColorArm c_FoldDown;
    public CommandFoldDown(HazyColorArm arm){
        c_FoldDown = arm;
        addRequirements(c_FoldDown);
    }
    
   
    public void execute(){
        c_FoldDown.foldDown();
    }

}
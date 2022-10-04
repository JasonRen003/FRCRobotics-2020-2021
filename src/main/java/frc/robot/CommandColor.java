//Imports fot the Command
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class CommandColor extends CommandBase {

    private HazyColorSensor c_ColorSensor;
    public CommandColor(HazyColorSensor sensor) {
        c_ColorSensor = sensor;
       addRequirements(c_ColorSensor);
    }
    
    
    public void execute(){
        //nothing yet...
    }

}
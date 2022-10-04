package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import static edu.wpi.first.wpilibj.XboxController.Button;

import javax.lang.model.util.ElementScanner6;
public class RobotContainer {

    //Robot's controllers that drivers use
    XboxController hazyController = new XboxController(RobotMap.CONTROLLERPORT);
    Joystick leftJoystick = new Joystick(RobotMap.LEFTJOYSTICKPORT);
    Joystick rightJoystick = new Joystick(RobotMap.RIGHTJOYSTICKPORT);

    //Chassis subystem and command setup
    HazyMechBase hazyMechBase = new HazyMechBase();
    HazyShooter hazyShooter = new HazyShooter();
    
    CommandMecanum commandMecanum = new CommandMecanum(hazyMechBase, leftJoystick, rightJoystick);
    CommandShooterDefault commandShooterDefault = new CommandShooterDefault(hazyShooter);
    CommandPIDShoot commandPIDShoot = new CommandPIDShoot(hazyShooter, hazyController);
    CommandFollowVision commandFollowVision = new CommandFollowVision(hazyMechBase);
    CommandPreciseMecanum commandPreciseMecanum = new CommandPreciseMecanum(hazyMechBase, leftJoystick, rightJoystick);
    CommandToggleDelay commandToggleDelay = new CommandToggleDelay(hazyMechBase);
    //Ball feeder subsystem and command setup
    //HazyHighFeeder hazyHighFeeder = new HazyHighFeeder();
    HazyLowFeeder hazyLowFeeder = new HazyLowFeeder();
    //CommandHighFeedDefault commandHighFeedDefault = new CommandHighFeedDefault(hazyHighFeeder);
    //CommandSpitHighFeed commandSpitHighFeed = new CommandSpitHighFeed(hazyHighFeeder);
    //CommandSwallowHighFeed commandSwallowHighFeed = new CommandSwallowHighFeed(hazyHighFeeder);
    CommandLowFeedDefault commandLowFeedDefault = new CommandLowFeedDefault(hazyLowFeeder);
    CommandSpitLowFeed commandSpitLowFeed = new CommandSpitLowFeed(hazyLowFeeder);
    CommandSwallowLowFeed commandSwallowLowFeed = new CommandSwallowLowFeed(hazyLowFeeder);

    //End Arm subsystem and commands
    HazyEndArm hazyEndArm = new HazyEndArm();
    CommandEndArmDefault commandEndArmDefault = new CommandEndArmDefault(hazyEndArm);
    CommandEndArmUp commandEndArmUp = new CommandEndArmUp(hazyEndArm);
    CommandEndArmDown commandEndArmDown = new CommandEndArmDown(hazyEndArm);

    //Color Arm subsystem and commands
    HazyColorArm hazyColorArm = new HazyColorArm();
    CommandFoldDown commandFoldDown = new CommandFoldDown(hazyColorArm);
    CommandFoldUp commandFoldUp = new CommandFoldUp(hazyColorArm);
    CommandColorArmDefault commandColorArmDefault = new CommandColorArmDefault(hazyColorArm);
    CommandToggleColorArm commandToggleColorArm = new CommandToggleColorArm(hazyColorArm);
    CommandSpinWheel commandSpinWheel = new CommandSpinWheel(hazyColorArm);
    
    //Intake Arm subsystem and commands
    HazyIntake hazyIntake = new HazyIntake();
    CommandIntakeDefault commandIntakeDefault = new CommandIntakeDefault(hazyIntake);
    CommandSpitIntake commandSpitIntake = new CommandSpitIntake(hazyIntake);
    CommandSwallowIntake commandSwallowIntake = new CommandSwallowIntake(hazyIntake);
    CommandSwitchIntakeDir commandSwitchIntakeDir = new CommandSwitchIntakeDir(hazyIntake);
    
    

    //set default commands inside RobotContainer constructor
    //This constructor is called once in Robotinit and should set up all button-> command bindings and default commands
    public RobotContainer(){
        configureButtonBindings();
        hazyMechBase.setDefaultCommand(commandMecanum);
        hazyShooter.setDefaultCommand(commandShooterDefault);
        //hazyHighFeeder.setDefaultCommand(commandHighFeedDefault);
        hazyLowFeeder.setDefaultCommand(commandLowFeedDefault);
        hazyIntake.setDefaultCommand(commandIntakeDefault);
        hazyColorArm.setDefaultCommand(commandColorArmDefault);
        hazyEndArm.setDefaultCommand(commandEndArmDefault);
    }

    //Use this method to define button->command mappings
    private void configureButtonBindings(){

        new JoystickButton(hazyController, Button.kStart.value).toggleWhenPressed(commandPIDShoot);
        new JoystickButton(rightJoystick, 1).whileHeld(commandSwallowLowFeed); //Joystick Trigger 
        new JoystickButton(rightJoystick, 1).whileHeld(commandSwallowIntake);//Joystick Trigger 
        new JoystickButton(leftJoystick, 1).whileHeld(commandSpitLowFeed);//Joystick Trigger
        new JoystickButton(leftJoystick, 1).whileHeld(commandSpitIntake);//Joystick Trigger
        new JoystickButton(rightJoystick, 2).whileHeld(commandFollowVision);
        new JoystickButton(leftJoystick, 2).whileHeld(commandPreciseMecanum);
        
        new JoystickButton(rightJoystick, 3).whenInactive(commandToggleDelay);
        //Boolean switch command
        new JoystickButton(hazyController, Button.kB.value).whileHeld(commandSwitchIntakeDir); //ideally this command should be mapped to a whenPressed() method but for some reason it only works with a whileHeld() method.
        new JoystickButton(hazyController, Button.kRightBumper.value).whileHeld(commandEndArmUp);
        new JoystickButton(hazyController, Button.kLeftBumper.value).whileHeld(commandEndArmDown);

        
        //new JoystickButton(leftJoystick, 1).whileHeld(commandSpitIntake);
        //Boolean switch commands
        new JoystickButton(hazyController, Button.kX.value).whileHeld(commandToggleColorArm);
        new JoystickButton(hazyController, Button.kY.value).whileHeld(commandSpinWheel);
    }

    public void DPadWrapper(){ //You can't make the dpad a joystick button to use "whileHeld" or "whilePressed" functions on, so we have to create a wrapper to run ourselves

        if(hazyController.getPOV()==0){ //DPad Up
            hazyColorArm.foldUp();
        }
        else if(hazyController.getPOV() == 180){ //DPad Down
            hazyColorArm.foldDown();
        }
        if(hazyController.getPOV() == 90){//DPad Right
            //hazyHighFeeder.spit();
        }
        else if(hazyController.getPOV() == 270){//DPad Left
            //hazyHighFeeder.swallow();
        }

        //hazyHighFeeder.stop(); //Sets default state for High feeder so it doesn't keep spinning forever
    }


}

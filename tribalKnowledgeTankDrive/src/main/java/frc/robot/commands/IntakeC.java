package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.IntakeS;

public class IntakeC extends Command {
    // imports the Intake Subsystem as the object "m_IntakeS"
    private final IntakeS m_IntakeS;

    //sets m_IntakeS to be able to call things from the Intake subsystem
    public IntakeC(IntakeS intakeS){
        m_IntakeS= intakeS;
        addRequirements(intakeS);
    }

    //needed but not used in our example    
    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        m_IntakeS.spinWheels(RobotContainer.m_driverController.getLeftTriggerAxis()); //tells the intake subsystem to call the spinWheels() function and pass the driver controller's left trigger
        if(RobotContainer.m_driverController.getAButton()==true ){ //checks to see if the A button on the driver controller is pressed
            m_IntakeS.actuateIntake(0.5); // sets the actuation motor to 0.5
        }
        if(RobotContainer.m_driverController.getBButton()==true){ //checks to see if the B button on the driver controller is pressed
            m_IntakeS.actuateIntake(-0.5); // sets the actuation motor to -0.5 (negative makes it go the opposite direction to the "if(...AButton()==True)" )
        }
    }

    //needed but not used in our example
    @Override
    public void end(boolean interrupted){

    }
    
    //needed but not used in our example
    @Override
    public boolean isFinished(){
        return false;
    }
}

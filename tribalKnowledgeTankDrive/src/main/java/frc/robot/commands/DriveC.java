package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveS;

public class DriveC extends Command{
    //imports the drive subsystem as an object
    private final DriveS m_DriveS;

    //required for allowing the drive subsystem to be called through our object
    public DriveC(DriveS driveS){
        m_DriveS = driveS;
        addRequirements(driveS);
    }

    //needed but not used in our example
    @Override
    public void initialize(){}

    @Override 
    public void execute(){
        //sets the "left" value to the left stick on the xbox controller
        double left = RobotContainer.m_driverController.getLeftY();
        //sets the "right" value to the right stick on the xbox controller
        double right = RobotContainer.m_driverController.getRightY();
        //calls the drive subsystem through our object, calls the function tankDrice(), and passes on the parameters of "left" and "right"
        m_DriveS.tankDrive(left, right);
    }

    //needed but not used in our example
    @Override
    public void end(boolean interrupted){}

    //needed but not used in our example
    @Override
    public boolean isFinished(){
        return false;
    }

}

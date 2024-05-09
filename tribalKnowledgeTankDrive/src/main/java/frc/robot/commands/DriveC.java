package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveS;

public class DriveC extends Command{
    private final DriveS m_DriveS;

    public DriveC(DriveS driveS){
        m_DriveS = driveS;
        addRequirements(driveS);
    }

    @Override
    public void initialize(){}

    @Override 
    public void execute(){
        double left = RobotContainer.m_driverController.getLeftY();
        double right = RobotContainer.m_driverController.getRightY();
        m_DriveS.tankDrive(left, right);
    }

    @Override
    public void end(boolean interrupted){}

    @Override
    public boolean isFinished(){
        return false;
    }

}

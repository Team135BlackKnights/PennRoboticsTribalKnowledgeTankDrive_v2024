package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.IntakeS;

public class IntakeC extends Command {
    private final IntakeS m_IntakeS;
    public IntakeC(IntakeS intakeS){
        m_IntakeS= intakeS;
        addRequirements(intakeS);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        m_IntakeS.spinWheels(RobotContainer.m_driverController.getLeftTriggerAxis());
        if(RobotContainer.m_driverController.getAButton()==true ){
            m_IntakeS.actuateIntake(0.5);
        }
        if(RobotContainer.m_driverController.getBButton()==true){
            m_IntakeS.actuateIntake(-0.5);
        }
    }

    @Override
    public void end(boolean interrupted){

    }
    
    @Override
    public boolean isFinished(){
        return false;
    }
}

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeS extends SubsystemBase{
    public IntakeS(){
        intakeMotor1.setIdleMode(IdleMode.kBrake);
        intakeMotor2.setIdleMode(IdleMode.kBrake);
        intakeMotor3.setIdleMode(IdleMode.kBrake);
    }

    public CANSparkMax intakeMotor1 = new CANSparkMax(Constants.intake_Motor1, MotorType.kBrushless);
    public CANSparkMax intakeMotor2 = new CANSparkMax(Constants.intake_Motor2, MotorType.kBrushless);
    public CANSparkMax intakeMotor3 = new CANSparkMax(Constants.intake_Motor3, MotorType.kBrushless);
    
    public void spinWheels(double speed){
        intakeMotor1.set(speed);
        intakeMotor2.set(-speed);
    }
    
    public void actuateIntake(double speed){
        intakeMotor3.set(speed);
    }

}

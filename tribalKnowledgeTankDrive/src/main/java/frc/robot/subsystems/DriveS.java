package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveS extends SubsystemBase{
    public DriveS(){
        //sets the default states for the motors
        frontLeft.setIdleMode(IdleMode.kBrake);
        frontRight.setIdleMode(IdleMode.kBrake);
        backLeft.setIdleMode(IdleMode.kBrake);
        backRight.setIdleMode(IdleMode.kBrake);

        //tells the back two motors to follow their front motor counterpart
        backLeft.follow(frontLeft);
        backRight.follow(frontRight);
    }

    //drive motors
    public CANSparkMax frontLeft = new CANSparkMax(Constants.frontLeftMotor, MotorType.kBrushless);
    public CANSparkMax frontRight = new CANSparkMax(Constants.frontRightMotor, MotorType.kBrushless);
    public CANSparkMax backLeft = new CANSparkMax(Constants.backLeftMotor, MotorType.kBrushless);
    public CANSparkMax backRight = new CANSparkMax(Constants.frontLeftMotor, MotorType.kBrushless);

    //creates the tank drive with the front two motors (which the back two motors follow)
    DifferentialDrive tankDrive = new DifferentialDrive(frontLeft, frontRight);

    //creates the tankDrive executable for the command file
    public void tankDrive(double left, double right){
        tankDrive(left, right);
    }
}

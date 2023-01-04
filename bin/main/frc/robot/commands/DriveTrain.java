package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import static frc.robot.Constants.*;

public class DriveTrain extends SubsystemBase {
    WPI_TalonFX frontLeft = new WPI_TalonFX(Constants.FRONT_LEFT_MOTOR);
    WPI_TalonFX frontRight = new WPI_TalonFX(Constants.FRONT_RIGHT_MOTOR);   
    WPI_TalonFX rearLeft = new WPI_TalonFX(Constants.REAR_LEFT_MOTOR);   
    WPI_TalonFX rearRight = new WPI_TalonFX(Constants.REAR_RIGHT_MOTOR);   

    MotorControllerGroup leftSide = new MotorControllerGroup(frontLeft, rearLeft);
    MotorControllerGroup rightSide = new MotorControllerGroup(rearLeft, rearRight);

    DifferentialDrive difDrive = new DifferentialDrive(leftSide, rightSide);

    public void drive(double speed, double rotation) {
        difDrive.arcadeDrive(speed, rotation, true);
    }

    public void stop() {
        difDrive.tankDrive(0,0);
    }

}

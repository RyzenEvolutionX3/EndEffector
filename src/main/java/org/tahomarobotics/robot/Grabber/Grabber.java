package org.tahomarobotics.robot.Grabber;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.tahomarobotics.robot.RobotMap;
import org.tahomarobotics.robot.util.SubsystemIF;



public class Grabber extends SubsystemIF {
    private static final Grabber INSTANCE = new Grabber();
    public static Grabber getInstance() {
        return INSTANCE;
    }
    private Grabber() {
        final TalonFX GrabberMotor = new TalonFX(RobotMap.GRABBER);
    }


}

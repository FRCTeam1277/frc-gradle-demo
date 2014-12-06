package org.team1277.robot;

import edu.wpi.first.wpilibj.*;

public class DemoRobot extends IterativeRobot
{
    public Jaguar leftDriveMotor;
    public Jaguar rightDriveMotor;

    public Joystick leftJoystick;
    public Joystick rightJoystick;
    private RobotDrive robotDrive;

    public void robotInit()
    {
        leftDriveMotor = new Jaguar(1);
        rightDriveMotor = new Jaguar(2);

        leftJoystick = new Joystick(1);
        rightJoystick = new Joystick(2);
        robotDrive = new RobotDrive(leftDriveMotor, rightDriveMotor);

        System.out.println("Resistance is futile.");
    }

    public void teleopInit()
    {
        System.out.println("Ready to drive");
    }

    public void teleopPeriodic()
    {
        robotDrive.tankDrive(leftJoystick, rightJoystick);
    }
}

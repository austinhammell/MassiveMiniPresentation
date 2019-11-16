/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark left1 = new Spark(1);
  Spark left2 = new Spark(0);
  Spark right1 = new Spark(8);
  Spark right2 = new Spark(9);

  public void setLeft(double _speed, double _throttle){
    left1.set(-_speed);
    left2.set(-_speed);
  }

  public void setRight(double _speed, double _throttle){
    right1.set(_speed);
    right2.set(_speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }
}

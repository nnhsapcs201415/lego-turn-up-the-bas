import lejos.nxt.Motor;
import lejos.nxt.Button;

public class MotorMove
{
    public static void main(String[] args)
    {
        System.out.println("Program 1");
        Button.waitForAnyPress();
        Motor.A.forward();
        Button.waitForAnyPress();
    }
}
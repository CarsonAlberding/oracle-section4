
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height*height);

        System.out.println("Your BMI is: "+bmi);
        sc.close();
        
        }
}

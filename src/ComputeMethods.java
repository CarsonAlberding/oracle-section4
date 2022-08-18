import java.util.Random;
import java.lang.Math;

public class ComputeMethods {

    public void FtoC(double degreesF){
        double celcius = (degreesF - 32) * (5/9);
        System.out.println("Temp in celcius is: "+celcius);
    }

    public void hypotenuse(int a, int b){
        double result = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse is: "+result);
    }

    public void roll(){
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int dicesum = dice1 + dice2;
        System.out.println("The sum of the dice values is: "+dicesum);

    }




}


import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = sc.next();
        System.out.print("Enter your middle name: ");
        middleName = sc.next();
        System.out.print("Enter you last name: ");
        lastName = sc.next();

        System.out.println("Your name is: "+firstName+" "+middleName+" "+lastName);
        sc.close();

    }
    
}

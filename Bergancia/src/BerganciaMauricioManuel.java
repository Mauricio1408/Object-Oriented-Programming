import java.util.Scanner;

public class BerganciaMauricioManuel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String Fname = sc.nextLine();

        System.out.print("Last Name: ");
        String Lname = sc.nextLine();
  
        System.out.print("Middle Initial: ");
        String MiddleI = sc.next();

        System.out.print("ID Number: ");
        String Id = sc.next();

        System.out.print("Email Address: ");
        String Email = sc.next();


        System.out.printf("\nHello %s %s %s!\n", Fname,MiddleI, Lname);
        System.out.println("Your ID Number is: " + Id);
        System.out.println("Your Email is: " + Email);
        sc.close();
    }
}

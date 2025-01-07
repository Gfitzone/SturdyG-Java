import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birthYear=sc.nextInt();
        System.out.println("Enter the current year");
        int currentYear=sc.nextInt();
        if(currentYear>=birthYear){
            int age=currentYear-birthYear;
            System.out.println("Your are "+age+" years old");
        }
        else{
            System.out.println("Error: Current year cannot be earlier than the birth year");
            
        }
        sc.close();
    }
}
import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the desired password length: ");
        int length=sc.nextInt();
        String characters="AQWERTYUIOPLKJHGFDSZXCVBNMasdfghjklpoiuytrewqzxcvbnm0123654789!@#$%^&*()";
        String password=generatePassword(length,characters);
         System.out.println("Generated password is :"+password);
         sc.close();
    }
    public static String generatePassword(int length,String characters){
        Random random=new Random();
        StringBuilder password=new StringBuilder();
        for(int i=0;i<length;i++){
            int index=random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}
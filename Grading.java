import java.util.Scanner;

public class Grading {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Grading system of BIM students.");
    System.out.println("Enter the number of the subjects : ");
    int num = sc.nextInt();
    System.out.println("Enter the maximum marks per subject : ");
    double max = sc.nextDouble();
    double maxmarks = max * num;
    double totalmark = 0;
    for (int i = 1; i <= num; i++) {
      System.out.println("Enter the marks for subject " + i + " (out of 100)");
      double marks = sc.nextDouble();
      // ensure the valid marks
      if (marks < 0 || marks > 100) {
        System.out.println("Invalid marks entered. Please enter the marks between 0 to 100");
        return;
      }
      totalmark = totalmark + marks;

    }
    double percentage = (totalmark / maxmarks) * 100;
    double average = totalmark / num;
    String grade;
    if (average >= 90) {
      grade = "Distinction";
    } else if (average >= 80) {
      grade = "Very Good";
    } else if (average >= 70) {
      grade = "First Division";
    } else if (average >= 60) {
      grade = "Second Division";
    } else if (average >= 50) {
      grade = "Pass in individual subject";
    } else {
      grade = "Fail";
    }
    System.out.println("Total marks : " + totalmark);
    System.out.println("Average marks : " + average);
    System.out.println("Percentage : " + percentage + "%");
    System.out.println("Remarks/Division : " + grade);

  }
}

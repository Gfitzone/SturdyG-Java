import java.util.Scanner;

public class UpgradeGrading {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Grading system of BIM students.");
    System.out.println();
    System.out.println(
        " Here you can check your theory marks (no need to include practical mark) because some semester has subjects which have both 100 and 60 as full mark in theory exam. Just enter total number of subjects and total marks obtained by you or (your expected mark) and then enter the maximum mark of each subject in theory. ");
    System.out.println();
    System.out.println("Enter the number of the subjects : ");
    int num = sc.nextInt();
    // System.out.println("Enter the maximum marks per subject : ");
    // for(int j=0;j<num;j++){

    // }

    double maximum = 0;
    double totalmark = 0;
    for (int i = 1; i <= num; i++) {

      System.out.println("Enter the marks for subject " + i + " (out of 100)");
      double marks = sc.nextDouble();
      System.out.println("Enter the maximum mark for subject " + i + " (out of 100)");
      double max = sc.nextDouble();
      // ensure the valid marks
      if (marks < 0 || marks > 100) {
        System.out.println("Invalid marks entered. Please enter the marks between 0 to 100");
        return;

      }
      maximum = maximum + max;
      totalmark = totalmark + marks;
      // double maxmarks=maximum;
    }
    double percentage = (totalmark / maximum) * 100;
    // double average=totalmark/num;
    String grade;
    if (percentage >= 90) {
      grade = "Distinction";
    } else if (percentage >= 80) {
      grade = "Very Good";
    } else if (percentage >= 70) {
      grade = "First Division";
    } else if (percentage >= 60) {
      grade = "Second Division";
    } else if (percentage >= 50) {
      grade = "Pass in individual subject";
    } else {
      grade = "Fail";
    }
    System.out.println("Maximum marks : " + maximum);
    System.out.println("Total marks : " + totalmark);
    // System.out.println("Average marks : "+average);
    System.out.println("Percentage : " + percentage + " %");
    System.out.println("Remarks/Division : " + grade);

  }
}

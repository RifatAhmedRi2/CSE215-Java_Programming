/*
(Find the two highest scores) Write a program that prompts the user to enter
the number of students and each student’s name and score, and finally displays
the student with the highest score and the student with the second-highest score.
*/

import java.util.*;

public class FindHighestScores_05_09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the number of students
    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();

    System.out.print("Enter a student name: ");
    String student1 = input.next();

    System.out.print("Enter a student score: ");
    double score1 = input.nextDouble();

    System.out.print("Enter a student name: ");
    String student2 = input.next();

    System.out.print("Enter a student score: ");
    double score2 = input.nextDouble();

    // Make sure that student1 is for the highest 
    // and student2 is for the second highest
    if (score1 < score2) {
      // Swap
      String tempString = student1;
      double tempScore = score1;

      student1 = student2;
      score1 = score2;

      student2 = tempString;
      score2 = tempScore;
    }

    for (int i = 0; i < numberOfStudents - 2; i++) {
      System.out.print("Enter a student name: ");
      String student = input.next();

      System.out.print("Enter a student score: ");
      double score = input.nextDouble();

      if (score > score1) {
        student2 = student1; // student1 now is the second highest
        score2 = score1;

        student1 = student; // new student becomes the highest
        score1 = score;
      }
      else if (score > score2) {
        student2 = student; // new student becomes the second highest
        score2 = score;
      }
    }

    System.out.println("Top two students:");
    System.out.println(student1 + "'s score is " + _______);
    System.out.println(student2 + "'s score is " + _________);
  }
}
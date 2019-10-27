
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class TestScoresDemo {
    public static void main(String[] args) {

    double test1;
    double test2;
    double test3;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter test score: ");
    test1 = keyboard.nextDouble();

    System.out.print("Enter test score: ");
    test2 = keyboard.nextDouble();

    System.out.print("Enter test score: ");
    test3 = keyboard.nextDouble();

    keyboard.close();

    TestScoresDemo classProgram = new TestScoresDemo();
    TestScores scores = classProgram.new TestScores(test1, test2, test3);

    System.out.println("The average test score: "
            + scores.getAverageScore());
}
}

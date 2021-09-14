package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int numQuestions, keyAnswers;
        String user = "y";
        Scanner scan = new Scanner(System.in);

        //initiate array
        System.out.println("How many questions are in the quiz?");
        numQuestions = scan.nextInt();

        int[] quizKey = new int [numQuestions];
        int[] answers = new int [numQuestions];

        //enter answer quizKey
        for(int i = 0; i < numQuestions; i++)
        {
            System.out.println("Enter the answer for solution " + (i + 1) + ":");
            keyAnswers = scan.nextInt();
            quizKey[i] = keyAnswers;
        }

        //Make array for test grading and compare to answer key
        while(user.equalsIgnoreCase("y"))
        {
            double total = 0.0;
            System.out.println("Begin entering the answers to be graded");

            for(int i = 0; i < numQuestions; i++)
            {
                System.out.println("Enter answer for question " + (i + 1) + ":");
                answers[i] = scan.nextInt();
            }
            int score = 0;
            for(int i = 0; i < numQuestions; i++)
            {
                if(quizKey[i] == answers[i])
                {
                    score++;
                }
            }
            System.out.println("Your score is " + score + " out of " + numQuestions);
            System.out.println("Your percentage is " + (double)score/numQuestions * 100 + "%");
            System.out.println("Is there another quiz to grade? <y/n>");
            user = scan.next();
            if(user.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }
}

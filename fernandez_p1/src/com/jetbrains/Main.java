package com.jetbrains;

//imports
import java.util.Scanner;
import java.security.SecureRandom;

//main class
public class Main {
    //main method
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //variables to calculate percentage of correct answers
        int questionCount = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        double percentageCorrect = 0;

        System.out.println();
        System.out.println();
        System.out.println("Are you ready to being your quiz?");
        System.out.println();
        System.out.println("Enter your desired  difficulty level from 1 (easiest) to 4 (hardest) : ");
        System.out.println("1) Single-digit problems");
        System.out.println("2) Double-digit problems");
        System.out.println("3) Triple-digit problems");
        System.out.println("4) Four-digit problems");
        int difficultyLevel = scnr.nextInt();

        // switch statement for difficulty level
        switch(difficultyLevel)
        {
            // first level of difficulty
            case 1:
                //while loop allows 10 questions and counts right and wrong answers
                while (questionCount < 10)
                {
                    ++questionCount;
                    System.out.println("Question " + questionCount + ")");
                    if (singleDigitQuestion() == true)
                    {
                        correctAnswers++;
                    }
                    else
                    {
                        wrongAnswers++;
                    }
                } //end 10 question while loop

                //calculate percentage
                percentageCorrect = (correctAnswers * 100.0) / (questionCount);
                if (percentageCorrect < 75)
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Please ask your teacher for extra help.");
                }
                else
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                break;
                // second level of difficulty
            case 2:
                //while loop allows 10 questions and counts right and wrong answers
                while (questionCount < 10)
                {
                    ++questionCount;
                    System.out.println("Question " + questionCount + ")");
                    if (doubleDigitQuestion() == true)
                    {
                        correctAnswers++;
                    }
                    else
                    {
                        wrongAnswers++;
                    }
                } //end 10 question while loop

                //calculate percentage
                percentageCorrect = (correctAnswers * 100.0) / (questionCount);
                if (percentageCorrect < 75)
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Please ask your teacher for extra help.");
                }
                else
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                break;
            case 3:
                //while loop allows 10 questions and counts right and wrong answers
                while (questionCount < 10)
                {
                    ++questionCount;
                    System.out.println("Question " + questionCount + ")");
                    if (tripleDigitQuestion() == true)
                    {
                        correctAnswers++;
                    }
                    else
                    {
                        wrongAnswers++;
                    }
                } //end 10 question while loop

                //calculate percentage
                percentageCorrect = (correctAnswers * 100.0) / (questionCount);
                if (percentageCorrect < 75)
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Please ask your teacher for extra help.");
                }
                else
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                break;
            case 4:
                //while loop allows 10 questions and counts right and wrong answers
                while (questionCount < 10)
                {
                    ++questionCount;
                    System.out.println("Question " + questionCount + ")");
                    if (fourDigitQuestion() == true)
                    {
                        correctAnswers++;
                    }
                    else
                    {
                        wrongAnswers++;
                    }
                } //end 10 question while loop

                //calculate percentage
                percentageCorrect = (correctAnswers * 100.0) / (questionCount);
                if (percentageCorrect < 75)
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Please ask your teacher for extra help.");
                }
                else
                {
                    System.out.println("You scored a " + (int)percentageCorrect + "%");
//            System.out.println("You answered " + (questionCount) + " question(s)");
//            System.out.println(correctAnswers + " question(s) were correct");
//            System.out.println(wrongAnswers + " question(s) were incorrect");
                    System.out.println();
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                break;
            default:
                System.out.println("Not a valid difficulty");
                break;
        }

//new code to edit
/*
problemType();
//end new code to edit
 */
    } //end main method

//new code to edit
/*
    private static void generateQuestions()
    {

    } //end generateQuestions method
    //end new code to edit
 */

    //method to generate the random response
    private static void randomComments(String response1, String response2, String response3, String response4)
    { //random choice for switch case (1-4)
        int choice = new SecureRandom().nextInt(3) + 1;
        //switch case for random comments
        switch(choice)
        {
            case 1:
                System.out.println(response1);
                System.out.println();
                break;
            case 2:
                System.out.println(response2);
                System.out.println();
                break;
            case 3:
                System.out.println(response3);
                System.out.println();
                break;
            case 4:
                System.out.println(response4);
                System.out.println();
                break;
            default:
        } //end switch statement for random comments
    } //end randomComments method

//new code to edit
/*
    //method to choose difficulty level
    private static void difficultyLevel()
    {
        Scanner keyboard = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        int randNum1 = 0, randNum2 = 0;
        int difficulty;

        //prompt the user which difficulty to pick
        System.out.println("Enter your desired  difficulty level from 1 (easiest) to 4 (hardest) : ");
        System.out.println("1) Easy - Single-digit problems");
        System.out.println("2) Medium - Double-digit problems");
        System.out.println("3) Hard - Triple-digit problems");
        System.out.println("4) Very hard - Four-digit problems");
        System.out.println("Enter your choice of difficulty (from 1 to 4)");
        //allow user to choose difficulty level
        difficulty = keyboard.nextInt();
        //menu for choosing difficulty level
        if (difficulty == 1)
        {
            randNum1 = rand.nextInt(10);
            randNum2 = rand.nextInt(10);
            System.out.println("The random numbers are " + randNum1 + " and " + randNum2);
        }
        else if (difficulty == 2)
        {
            randNum1 = rand.nextInt(100);
            randNum2 = rand.nextInt(100);
            System.out.println("The random numbers are " + randNum1 + " and " + randNum2);
        }
        else if (difficulty == 3)
        {
            randNum1 = rand.nextInt(1000);
            randNum2 = rand.nextInt(1000);
            System.out.println("The random numbers are " + randNum1 + " and " + randNum2);
        }
        else if (difficulty == 4)
        {
            randNum1 = rand.nextInt(10000);
            randNum2 = rand.nextInt(10000);
            System.out.println("The random numbers are " + randNum1 + " and " + randNum2);
        }
        else
        {
            System.out.println("That is not a valid option");
        }
    } //end difficultyLevel method


    private static void problemType()
    {
        difficultyLevel();
        Scanner keyboard = new Scanner(System.in);

        int typeOfProblem;
        double answer;

        //prompt user to choose the type of problem they want
        System.out.println("Choose your desired arithmetic problem type");
        System.out.println("1) Only addition type problems");
        System.out.println("2) Only multiplication type problems");
        System.out.println("3) Only subtraction type problems");
        System.out.println("4) Only division type problems");
        System.out.println("5) Random mixture of all 4 types problems");
        System.out.println("Enter your choice: (from 1 to 5)");
        //allow user to choose their type of problem
        typeOfProblem = keyboard.nextInt();

        if (typeOfProblem == 1) //addition
        {
            //ask user the question
            System.out.println("How much is " + randNum1 + " plus " + randNum2 + "? \nEnter your answer below:");
            //calculate the answer to the question
            answer = randNum1 + randNum2;
        }
        else if (typeOfProblem == 2) //multiplication
        {

        }
        else if (typeOfProblem == 3) //subtraction
        {

        }
        else if (typeOfProblem == 4) //division
        {

        }
//        else if (operatorType == 5) //mixture of all types
//        {
//
//        }
        else
            {
                System.out.println("That is not a valid option");
            }




//        Scanner keyboard = new Scanner(System.in);
//
//        //menu for choosing arithmetic operator
//        int operatorType;
//        int answer = 0;
//
//        System.out.println("Choose the arithmetic operator you want to test on");
//        System.out.println("1) Addition");
//        System.out.println("2) Multiplication");
//        System.out.println("3) Subtraction");
//        System.out.println("4) Division");
//        System.out.println("5) Mixture of all four types");
//        operatorType = keyboard.nextInt();
//
//        if (operatorType == 1) //addition
//        {
//            //ask user the question
//            System.out.println("How much is " + randNum1 + " plus " + randNum2 + "? \nEnter your answer below:");
//            //calculate the answer to the question
//            answer = randNum1 + randNum2;
//        }
//        else if (operatorType == 2) //multiplication
//        {
//            //ask user the question
//            System.out.println("How much is " + randNum1 + " times " + randNum2 + "? \nEnter your answer below:");
//            //calculate the answer to the question
//            answer = randNum1 * randNum2;
//        }
//        else if (operatorType == 3) //subtraction
//        {
//            //ask user the question
//            System.out.println("How much is " + randNum1 + " minus " + randNum2 + "? \nEnter your answer below:");
//            //calculate the answer to the question
//            answer = randNum1 - randNum2;
//        }
//        else if (operatorType == 4) //division
//        {
//            //ask user the question
//            System.out.println("How much is " + randNum1 + " divided by " + randNum2 + "? \nEnter your answer below:");
//            //calculate the answer to the question
//            answer = randNum1 / randNum2;
//        }
////        else if (operatorType == 5) //mixture of all types
////        {
////
////        }
//        else
//            {
//                System.out.println("That is not a valid option");
//            }

    } //end problemType method
    //end new code to edit
*/

    //method that generates a single-digit question and checks if it is correct
    private static boolean singleDigitQuestion()
    {
        //create a RandomSecure and Scanner object
        SecureRandom rand = new SecureRandom();
        Scanner keyboard = new Scanner(System.in);

        //create 2 secure random integers
        int randNum1 = rand.nextInt(10);
        int randNum2 = rand.nextInt(10);

        //ask user the question
        System.out.println("How much is " + randNum1 + " times " + randNum2 + "? \nEnter your answer below:");
        //calculate the answer to the question
        int answer = randNum1 * randNum2;
        //allow user to scan in the answer
        int input = keyboard.nextInt();

        //checks if the answer is correct or not
        if (input != answer) {
            randomComments("No. Please try again.", "Wrong. Try once more.", "Don’t give up!", "No. Keep trying.");
            return false;
        }
        randomComments("Very good!", "Excellent!", "Nice work!", "Keep up the good work!");
        return true;
    } //end singleDigitQuestion method

    //method that generates a double-digit question and checks if it is correct
    private static boolean doubleDigitQuestion()
    {
        //create a RandomSecure and Scanner object
        SecureRandom rand = new SecureRandom();
        Scanner keyboard = new Scanner(System.in);

        //create 2 secure random integers
        int randNum1 = rand.nextInt(100);
        int randNum2 = rand.nextInt(100);

    //change this into a menu
        //ask user the question
        System.out.println("How much is " + randNum1 + " times " + randNum2 + "? \nEnter your answer below:");
        //calculate the answer to the question
       int answer = randNum1 * randNum2;

        //allow user to enter their answer
        int input = keyboard.nextInt();
        //checks if the answer is correct or not
        if (input != answer) {
            randomComments("No. Please try again.", "Wrong. Try once more.", "Don’t give up!", "No. Keep trying.");
            return false;
        }
        randomComments("Very good!", "Excellent!", "Nice work!", "Keep up the good work!");
        return true;
    } //end doubleDigitQuestion method

    //method that generates a triple-digit question and checks if it is correct
    private static boolean tripleDigitQuestion()
    {
        //create a RandomSecure and Scanner object
        SecureRandom rand = new SecureRandom();
        Scanner keyboard = new Scanner(System.in);

        //create 2 secure random integers
        int randNum1 = rand.nextInt(1000);
        int randNum2 = rand.nextInt(1000);
        //ask user the question
        System.out.println("How much is " + randNum1 + " times " + randNum2 + "? \nEnter your answer below:");
        //calculate the answer to the question
        int answer = randNum1 * randNum2;
        //allow user to scan in the answer
        int input = keyboard.nextInt();

        //checks if the answer is correct or not
        if (input != answer) {
            randomComments("No. Please try again.", "Wrong. Try once more.", "Don’t give up!", "No. Keep trying.");
            return false;
        }
        randomComments("Very good!", "Excellent!", "Nice work!", "Keep up the good work!");
        return true;
    } //end tripleDigitQuestion method

    //method that generates a four-digit question and checks if it is correct
    private static boolean fourDigitQuestion()
    {
        //create a RandomSecure and Scanner object
        SecureRandom rand = new SecureRandom();
        Scanner keyboard = new Scanner(System.in);

        //create 2 secure random integers
        int randNum1 = rand.nextInt(10000);
        int randNum2 = rand.nextInt(10000);
        //ask user the question
        System.out.println("How much is " + randNum1 + " times " + randNum2 + "? \nEnter your answer below:");
        //calculate the answer to the question
        int answer = randNum1 * randNum2;
        //allow user to scan in the answer
        int input = keyboard.nextInt();

        //checks if the answer is correct or not
        if (input != answer) {
            randomComments("No. Please try again.", "Wrong. Try once more.", "Don’t give up!", "No. Keep trying.");
            return false;
        }
        randomComments("Very good!", "Excellent!", "Nice work!", "Keep up the good work!");
        return true;
    } //end fourDigitQuestion method

} //end main class
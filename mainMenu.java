// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Different calculations depending on the menu choice
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner;   
class mainMenu{
    public static void main(String[]args ){

        //Declares and initializes variables needed for the menu.
        Scanner input = new Scanner(System.in);
        String userIn = null;
        int selection = 0;
        boolean selectCheck = true;
        boolean stringCheck = true;

        //Creates objects of the other classes for each part of the program.
        part1 partOneObject = new part1();
        part2 partTwoObject = new part2();
        part3 partThreeObject = new part3();
        part4 partFourObject = new part4();
        part5 partFiveObject = new part5();
        part6 partSixObject = new part6();

        //For every user option the corresponding method is called that executes the different parts of the projects. After a program is finished we return to the menu.
        do{
            selectCheck = false;
            System.out.println("Please select a program:");
            System.out.println("\n 1. -> Standard Variance and Standard Deviation Calculator");
            System.out.println("\n 2. -> Exact square identifier and calculator");
            System.out.println("\n 3. -> Factorial Calculator");
            System.out.println("\n 4. -> Guessing game");
            System.out.println("\n 5. -> Automorphic number calculator");
            System.out.println("\n 6. -> Pythagorian triples");
            System.out.println("\n 7. -> Exit");
            System.out.print("\n input: ");
            

            userIn = input.nextLine();

            //STRING CHECK LOOP: Checks for the case that the user inputs anything other than numbers
            do{
                stringCheck = false;
                try {
                    selection = Integer.parseInt(userIn);                                         
                } catch (Exception e) {
                    System.out.println("Invalid input, please input an integer.");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();
                    stringCheck = true;
                }
            }
            while(stringCheck == true); 
            stringCheck = true;

            switch(selection){

                case 1: 
                    partOneObject.uno();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;

                case 2:
                    partTwoObject.dos();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;

                case 3:
                    partThreeObject.tres();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;
                
                case 4:
                    partFourObject.quatro();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;

                case 5:
                    partFiveObject.fiveInSpanish();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;
                
                case 6:
                    partSixObject.sixInSpanish();
                    System.out.println("\n\n\nProgram complete, returning to program selection");   
                    selectCheck = true;
                    break;

                case 7: 
                    System.out.println("Thank you!\n\n Good Bye!");
                    break;

                default:   
                    System.out.println("Invalid input, returning to program selection");   
                    selectCheck = true;
                    break;        

            }

        }
        while(selectCheck == true);

        
    }
}
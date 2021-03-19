// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Guessing game
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner;//Calls the scanner utility, enabling us to accept user input.
import java.util.Random;//Calls the random utility, enabling the creation of random numbers.

class part4{
    public void quatro() {

        //Declares and initializes all needed variables
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = 0;
        int counter = 0;
        double userNum = 0;
        String userIn = null;
        boolean z = true;

        //Accepts user input
        randomNum = rand.nextInt(65);
        System.out.println("Guess my number!");

        for(int i = 0; i < 1;){ //repeats until the user guesses correctly
            System.out.print("\n input: ");
            userIn = input.nextLine();//Stores input as a string to check for erratic input

                //Checks for the case that the user inputs anything other than numbers
                do{
                    z = false;
                    try {
                        userNum = Double.parseDouble(userIn);                                         
                    } catch (Exception e) {
                        System.out.println("And what a strange number " + userIn + " would be. Try again.");
                        System.out.print("\n input: ");
                        counter++;
                        userIn = input.nextLine();
                        z = true;
                    }
                }
                while(z == true); 
                z = true;
            
            
            //Guides the user towards the solution and congratulates him upon success
            if(userNum != (int)(userNum)){ 
                System.out.println("Hint hint, my number is an integer.");
                counter++;
            }
            else if(userNum < 0 || userNum > 65){
                 System.out.println("Hint hint, my number is bigger than zero and smaller than 65");
                 counter++;
            }
            else if(userNum < randomNum){
                 System.out.println("Maybe try higher...");
                 counter++;
            }
            else if(userNum > randomNum){
                System.out.println("Maybe a little lower...");
                counter++;
            }
            else {
                counter++;
                System.out.println("You finally got it! And it only took you " + counter + " tries!");
                i++;
            }

        }

    }
}
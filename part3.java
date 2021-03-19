// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Calculations
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner;//Calls the scanner utility, enabling us to accept user input.

class part3{
    public void tres() {
        Scanner input = new Scanner(System.in);

        //Declares and initializes all needed variables
        double[] userNumbers = new double[5];
        double[] userFinal = new double[5];
        double[] subResult = new double[5];
        double sum = 0;
        double avg = 0;
        double champ = 0;
        double closestNum = 0;
        double factorial = 1; //Initialized as 1 in order to avoid always getting zero as the factorial result
        String userIn = null;
        boolean z = true;

        //Asks for user input, stores it as a string so it can be tested for erratic input
        System.out.println("Give me 5 integers between 0 and 15 ");
        for (int i = 0; i < 5; i++){
            System.out.print("\n input: ");
            userIn = input.nextLine();


            //Predicts the case that the user enters anything other than numbers
            do{ 
                z = false;
                try {
                    userNumbers[i] = Double.parseDouble(userIn);                                         
                } catch (Exception e) {
                    System.out.println("And what a strange number " + userIn + " would be. Try again.");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();
                    z = true;
                }
            }
            while(z == true); 
            z = true;

            //Predicts the case that the user enters out of bounds numbers, or non integers
            if(userNumbers[i] >= 0 && userNumbers[i] <= 15 && userNumbers[i] == (int)(userNumbers[i])){
                userFinal[i]= userNumbers[i];
            }
            else{
                System.out.println("Nope, try again");
                i--;
            }
        }

        //Calculates the sum and then the average and also displays the average to the user for clarity
        for(int i = 0; i < 5; i++){
            sum += userFinal[i];
        }

        avg = sum / 5.0;

        System.out.println("The average is: " + avg);

        //Calculates the number closest to the average by substracting all the user inputs fro the average value, storing 
        //the results in a subResult and then sorting that array to find the smallest value. 
        for(int i = 0; i < 5; i++){
            subResult[i] = userFinal[i] - avg;
            if(subResult[i] < 0) subResult[i] *= -1;
        }

        if(subResult[0] < subResult[1]) champ = subResult[0];
        else champ = subResult[1];


        for(int i = 1; i < 4; i++){
            if(champ > subResult[i]) {
            champ = subResult[i];
            closestNum = userFinal[i];
            }
        }

        System.out.println("The closest value to the average is: " + closestNum);//Displays the closest number for clarity.

        //Calculates the factorial and displays it to the user
        for(int i = 1; i < closestNum;){
            factorial *= closestNum;  
            closestNum --;
            
        }

        System.out.println("Here is the factorial: " + factorial);
    }
}
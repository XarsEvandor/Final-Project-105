// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Calculations
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner; //Calls for the scanner utility, enabling us to accept user input.

class part1{

    public void uno(){

        //Creates the scanner and all needed variables. Variables are initialised.
        Scanner input = new Scanner(System.in); 
        double num1 = 0;
        double sum = 0;
        double sumAvg = 0;
        double sumOfSquares = 0;
        double sumSquared = 0;
        double product = 1;
        double SV = 0;
        double SD = 0;
        String userIn = null;
        boolean z = true;
        
        for(int i = 0; i < 6; i++){ //Repeats until the user has given 6 real numbers
            System.out.println("Give me a real number"); //Asks for user input
            System.out.print("\n input: ");
            userIn = input.nextLine(); //Stores user input in userIn as a string

            do{ //Traps erratic input.
                z = false;
                try {
                    num1 = Double.parseDouble(userIn);                                         
                } catch (Exception e) {
                    System.out.println("And what a strange number " + userIn + " would be. Try again.");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();
                    z = true;
                }
            }
            while(z == true); 
            z = true;
            
            sum += num1; //Calculates the sum the product and the sum of the squared values
            product *=  num1;
            sumOfSquares += num1 * num1;
        }

        sumAvg = sum / 6.0; //Calculates the average of the sum
        sumSquared = sumAvg * sumAvg; 
        sumOfSquares /= 6.0;
        SV = (sumOfSquares - sumSquared); //Calculates standard variance
        SD = Math.sqrt(SV); //Calculates standard deviation 

        System.out.println("Here are your results : \n" + "Sum is : " + sum + "\n" + "Product is : " + product);
        System.out.println("Standard variance is : " + SV + "\n" + "Standard deviation is : " + SD);//Displayes results to the user


    }
}
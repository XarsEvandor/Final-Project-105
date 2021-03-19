// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Calculations
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner;   
class part5{
    public void fiveInSpanish(){

        Scanner input = new Scanner(System.in);
        int valSquare = 0;
        int val = 0;
        int lowerLim = 0;
        int upperLim = 0;
        int selection = 0;
        String userIn = null;
        boolean stringCheck = true;
        boolean limCheck = true;
        boolean selectCheck = true;

        //SELECT CHECK LOOP: Checks for erratic input on the selection menu
        do{
            selectCheck = false;
            System.out.println("Please select:"); 
            System.out.println("1. -> Calcuate automorphic numbers for any range.");
            System.out.println("2. -> Calculate automorphic numbers from 0 to 10.000");
            System.out.print("\n input: ");

            userIn = input.nextLine();

            //STRING CHECK LOOP: Checks for the case that the user inputs anything other than numbers
            do{
                stringCheck = false;
                try {
                    selection = Integer.parseInt(userIn);                                         
                } catch (Exception e) {
                    System.out.println("Invalid input, please input either 1. or 2.");
                    System.out.println("1. -> Calcuate automorphic integers for any range.");
                    System.out.println("2. -> Calculate automorphic integers from 1 to 10.000");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();
                    stringCheck = true;
                }
            }
            while(stringCheck == true); 
            stringCheck = true;


            //SELECTION NUMBER 1

            if(selection == 1){
                //LIM CHECK LOOP: Checks for the case that upperLim is smaller than lowerLim
                limCheck = false;
                do{
                    System.out.println("Please select lower limit.");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();

                    do{
                        stringCheck = false;
                        try {
                            lowerLim = Integer.parseInt(userIn);                                         
                        } catch (Exception e) {
                            System.out.println("Invalid input, please input an integer");
                            System.out.print("\n input: ");
                            userIn = input.nextLine();
                            stringCheck = true;
                        }
                    }
                    while(stringCheck == true); 
                    stringCheck = true;

                    System.out.println("Please select upper limit.");
                    System.out.print("\n input: ");
                    userIn = input.nextLine();

                    do{
                        stringCheck = false;
                        try {
                            upperLim = Integer.parseInt(userIn);                                         
                        } catch (Exception e) {
                            System.out.println("Invalid input, please input an integer");
                            System.out.print("\n input: ");
                            userIn = input.nextLine();
                            stringCheck = true;
                        }
                    }
                    while(stringCheck == true); 
                    stringCheck = true;

                    if(upperLim <= lowerLim){
                        System.out.println("Please make sure the upper limit is a higher number than the lower limit. Try again.");
                        limCheck = true;
                    }

                }
                while(limCheck == true);

                //CALCULATIONS AND OUTPUT

                System.out.println("Here are all the automorphic integers from " +lowerLim+ " to " + upperLim );
                for(int i = lowerLim; i < upperLim; i++){
                    val = i;
                    valSquare = i*i;
                    if(val%10 == valSquare%10){
                        for(int k = 0; k < 1;){
                            val /= 10;
                            valSquare /= 10;
                            if(val == 0){
                                //if(i != 0)
                                System.out.println(i);
                                k++;
                            }
                            if(val%10 != valSquare%10) break;
                        }

                    }
                }

            }


            //SELECTION NUMBER 2

            else if(selection == 2){
                System.out.println("Here are all the automorphic integers from 0 to 10000" + "\n" + "0");
                for(int i = 1; i < 10000; i++){
                    val = i;
                    valSquare = i*i;
                    if(val%10 == valSquare%10){
                        for(int k = 0; k < 1;){
                            val /= 10;
                            valSquare /= 10;
                            if(val == 0){
                                System.out.println(i);
                                k++;
                            }
                            if(val%10 != valSquare%10) break;
                        }

                    }
                }

                
            }


            //ERRATIC INPUT CHECK

            else{
                System.out.println("Invalid input please try again.");
                System.out.print("\n input: ");
                selectCheck = true;
            }
        }
        while(selectCheck == true);

    }
}

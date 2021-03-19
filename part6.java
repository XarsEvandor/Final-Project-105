// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Calculations
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

import java.util.Scanner;
 
class part6{
    public void sixInSpanish(){

        //User related Variables
        Scanner input = new Scanner(System.in);
        int lowerLim = 0;
        int upperLim = 0;
        int selection = 0;
        String userIn = null;
        boolean stringCheck = true;
        boolean limCheck = true;
        boolean selectCheck = true;

        //Calculation related Variables
        int hypotenuse = 0;
        int sideOne = 1;
        int sideTwo = 0;
        int counterNumbers = 0;
        int counterDuplicates = 0;
        int counterMultiples = 0;
        
        int[] sideOneArray;
        int[] sideTwoArray;
        int[] hypotenuseArray;
        boolean[] checkDuplicates;
        boolean[] checkMultiples;


        //SELECT CHECK LOOP: Checks for erratic input on the selection menu
        do{
            selectCheck = false;
            System.out.println("Please select:"); 
            System.out.println("1. -> Calcuate pythagorian triples for any range.");
            System.out.println("2. -> Calculate pythagorian triples from 0 to 100");
            System.out.print("\n input: ");

            userIn = input.nextLine();

            //STRING CHECK LOOP: Checks for the case that the user inputs anything other than numbers
            do{
                stringCheck = false;
                try {
                    selection = Integer.parseInt(userIn);                                         
                } catch (Exception e) {
                    System.out.println("Invalid input, please input either 1. or 2.");
                    System.out.println("1. -> Calcuate pythagorian triples for any range.");
                    System.out.println("2. -> Calculate pythagorian triples from 1 to 100");
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
                    
                    limCheck = false;

                    if(upperLim == 0){
                        System.out.println("That would be a very short calculation. Please challenge me a bit more.");
                        limCheck = true;
                        continue;
                    }

                    if(upperLim < 0 || lowerLim <0){
                        System.out.println("Please only input positive limits.");
                        limCheck = true;
                        continue;
                    }

                    if(upperLim <= lowerLim){
                        System.out.println("Please make sure the upper limit is a higher number than the lower limit. Try again.");
                        limCheck = true;
                    }

                    if((upperLim - lowerLim > 300 && upperLim - lowerLim < 500)){
                        System.out.println("This will propably take a while. Continue? \n" + "1. YES \n" + "2. NO");
                        System.out.print("\n input: ");
                        userIn = input.nextLine();
                        do{
                            stringCheck = false;
                            try {
                                selection = Integer.parseInt(userIn);                                         
                            } catch (Exception e) {
                                System.out.println("Invalid input, please input either 1. or 2.");
                                System.out.println("1. -> CONTINUE.");
                                System.out.println("2. -> TRY AGAIN.");
                                System.out.print("\n input: ");
                                userIn = input.nextLine();
                                stringCheck = true;
                            }
                        }
                        while(stringCheck == true); 
                        stringCheck = true;

                        if(selection == 1){
                            System.out.println("COMMENCING \n .\n .\n .\n .\n .");
                        }
                        else if(selection == 2){
                            limCheck = true;
                        }
                        else{
                            System.out.println("INVALID INPUT. RETURNING TO LIMIT SELECTION. \n . \n . \n .");
                        }
                    }

                    if((upperLim - lowerLim >= 500 && upperLim - lowerLim < 700 )){
                        System.out.println("This will take a really long time. Continue? \n" + "1. YES \n" + "2. NO");
                        System.out.print("\n input: ");
                        userIn = input.nextLine();
                        do{
                            stringCheck = false;
                            try {
                                selection = Integer.parseInt(userIn);                                         
                            } catch (Exception e) {
                                System.out.println("Invalid input, please input either 1. or 2.");
                                System.out.println("1. -> CONTINUE.");
                                System.out.println("2. -> TRY AGAIN.");
                                System.out.print("\n input: ");
                                userIn = input.nextLine();
                                stringCheck = true;
                            }
                        }
                        while(stringCheck == true); 
                        stringCheck = true;

                        if(selection == 1){
                            System.out.println("COMMENCING \n .\n .\n .\n .\n .");
                        }
                        else if(selection == 2){
                            limCheck = true;
                        }
                        else{
                            System.out.println("INVALID INPUT. RETURNING TO LIMIT SELECTION. \n . \n . \n .");
                            limCheck = true;
                        }
                    }

                    if(upperLim - lowerLim >= 700){
                        System.out.println("I'M SORRY USER, I'M AFRAID I CAN'T LET YOU DO THAT. \n RETURNING TO LIMIT SELECTION. \n . \n . \n . ");
                        limCheck = true;
                    }

                }
                while(limCheck == true);

                int range = (upperLim-lowerLim) * 100;
                sideOneArray = new int[range];
                sideTwoArray = new int[range];
                hypotenuseArray = new int[range];
                checkDuplicates = new boolean[range];
                checkMultiples = new boolean[range];

                //CALCULATIONS AND OUTPUT
                //Triple calculation
                for(int i = lowerLim + 1; i < upperLim; i++){
                    hypotenuse = i;
                    for(int k = lowerLim + 1; k < upperLim; k++){
                        sideOne = k;
                        
                        for(int r = lowerLim; r < upperLim; r++){
                            sideTwo = r;
                            if(hypotenuse * hypotenuse == sideOne * sideOne + sideTwo * sideTwo){
                                
                                hypotenuseArray[counterNumbers] = hypotenuse;
                                sideOneArray[counterNumbers] = sideOne;
                                sideTwoArray[counterNumbers] = sideTwo;
                                counterNumbers++;
                                
                            }
                        }
                    }
                }


                

                System.out.println("Here are the pythagorian triples from " + lowerLim + " to " + upperLim);
                for(int i = 0; i < counterNumbers; i++){
                    System.out.println((i+1) +sideOneArray[i] + ", " +sideTwoArray[i] + ", " + hypotenuseArray[i]);
                }


                //Duplicate Calculation
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"Here are the Duplicates: ");
                for(int i = 0; i <= counterNumbers; i++){  
                    checkDuplicates[i] = true;     
                    for(int k = 0; k <= counterNumbers; k++){
                        if(sideOneArray[k] + sideTwoArray[k] + hypotenuseArray[k] == sideOneArray[i] + sideTwoArray[i] + hypotenuseArray[i]){
                            if((sideOneArray[k] != sideOneArray[i]) && (sideTwoArray[k] != sideTwoArray[i]) && (sideOneArray[k] != 0) && (sideTwoArray[k] != 0)){
                                if(checkDuplicates[k] == false){
                                    System.out.println((counterDuplicates + 1) +" [" + sideOneArray[k] + ", " + sideTwoArray[k] + ", " + hypotenuseArray[k] + "]");
                                    checkDuplicates[k] = true;  
                                    counterDuplicates++; 
                                }
                            }
                        }
                    }
                }

                for(int i = 0; i <= counterNumbers; i++){
                    checkDuplicates[i] = false;
                }

                //Multiples Calculation
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"Here are the Multiples: ");
                for(int i = 0; i <= counterNumbers; i++){  
                    checkMultiples[i] = true;     
                    for(int k = 0; k <= counterNumbers; k++){
                        if((sideOneArray[k] != sideOneArray[i]) && (sideTwoArray[k] != sideTwoArray[i]) && (sideOneArray[k] != 0) && (sideTwoArray[k] != 0) && (hypotenuseArray[k] != 0)){
                            if(((sideOneArray[k] * sideTwoArray[k] * hypotenuseArray[k])+1) % ((sideOneArray[i] * sideTwoArray[i] * hypotenuseArray[i])+1) == 0){
                                if(checkMultiples[k] == false && checkDuplicates[k] == false){
                                    System.out.println((counterMultiples + 1) +" {" + sideOneArray[k] + ", " + sideTwoArray[k] + ", " + hypotenuseArray[k] + "}");
                                    checkMultiples[k] = true;  
                                    counterMultiples++; 
                                }
                                
                            }
                        }
                    }
                }
                

            }


            //SELECTION NUMBER 2
            else if(selection == 2){
                System.out.println("Here are all the pythagorian triples from 0 to 100");

                //Reinitialization of vairables related to calculations
                hypotenuse = 0;
                sideOne = 1;
                sideTwo = 0;
                counterNumbers = 0;
                counterDuplicates = 0;
                counterMultiples = 0;
                
                sideOneArray = new int[200];
                sideTwoArray = new int[200];
                hypotenuseArray = new int[200];
                checkDuplicates = new boolean[200];
                checkMultiples = new boolean[200];


                //Triple calculation
                for(int i = 1; i <= 100; i++){
                    hypotenuse = i;
                    for(int k = 1; k <= 100; k++){
                        sideOne = k;
                        
                        for(int r = 1; r <= 100; r++){
                            sideTwo = r;
                            if(hypotenuse * hypotenuse == sideOne * sideOne + sideTwo * sideTwo){
                                
                                hypotenuseArray[counterNumbers] = hypotenuse;
                                sideOneArray[counterNumbers] = sideOne;
                                sideTwoArray[counterNumbers] = sideTwo;
                                counterNumbers++;
                                
                            }
                        }
                    }
                }

                //Triple display
                for(int i = 0; i < counterNumbers; i++){
                    System.out.println((i+1) +sideOneArray[i] + ", " +sideTwoArray[i] + ", " + hypotenuseArray[i]);
                }


                //Duplicate Calculation and display
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"Here are the Duplicates: ");
                for(int i = 0; i <= counterNumbers; i++){  
                    checkDuplicates[i] = true;     
                    for(int k = 0; k <= counterNumbers; k++){
                        if(sideOneArray[k] + sideTwoArray[k] + hypotenuseArray[k] == sideOneArray[i] + sideTwoArray[i] + hypotenuseArray[i]){
                            if((sideOneArray[k] != sideOneArray[i]) && (sideTwoArray[k] != sideTwoArray[i]) && (sideOneArray[k] != 0) && (sideTwoArray[k] != 0)){
                                if(checkDuplicates[k] == false){
                                    System.out.println((counterDuplicates + 1) +" [" + sideOneArray[k] + ", " + sideTwoArray[k] + ", " + hypotenuseArray[k] + "]");
                                    checkDuplicates[k] = true;  
                                    counterDuplicates++; 
                                }
                            }
                        }
                    }
                }

                for(int i = 0; i <= counterNumbers; i++){
                    checkDuplicates[i] = false;
                }

                //Multiples Calculation and display
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"Here are the Multiples: ");
                for(int i = 0; i <= counterNumbers; i++){  
                    checkMultiples[i] = true;     
                    for(int k = 0; k <= counterNumbers; k++){
                        if((sideOneArray[k] != sideOneArray[i]) && (sideTwoArray[k] != sideTwoArray[i]) && (sideOneArray[k] != 0) && (sideTwoArray[k] != 0) && (hypotenuseArray[k] != 0)){
                            if(((sideOneArray[k] * sideTwoArray[k] * hypotenuseArray[k])+1) % ((sideOneArray[i] * sideTwoArray[i] * hypotenuseArray[i])+1) == 0){
                                if(checkMultiples[k] == false && checkDuplicates[k] == false){
                                    System.out.println((counterMultiples + 1) +" {" + sideOneArray[k] + ", " + sideTwoArray[k] + ", " + hypotenuseArray[k] + "}");
                                    checkMultiples[k] = true;  
                                    counterMultiples++; 
                                }
                                
                            }
                        }
                    }
                }
            }


            //ERRATIC INPUT CHECK

            else{
                System.out.println("Invalid input please try again.");
                selectCheck = true;
            }
        }
        while(selectCheck == true);

    }
}

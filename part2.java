// PROJECT TITLE: Course Project
// AUTHOR NAME: GIORGOS-PANAGIOTIS KATSONIS
// PURPOSE OF PROJECT: Calculations
// VERSION or DATE: 06/12/2019
// AUTHORS: giorgos_katsonis@hotmail.com 
// COPYRIGHT INFORMATION:  Content is copyright © Open Source Guides authors, released under CC-BY-4.0.

class part2{
    public void dos(){

        //Declares and initializes all needed variables
        double counter = 0;
        double sum = 0;
        double sumAvg = 0;
        double sumOfSquares = 0;
        double sumSquared = 0;
        double SV = 0;
        double SD = 0;

        //Calculates and separates the desired values. We initialise i as 2 cause 1^2 = 1.
        for(double i = 2; i < 500; i++){ 
            if(Math.sqrt(i) == (int)(Math.sqrt(i))){
                System.out.println(i);

                sum += i;
                sumOfSquares += i * i;
                counter ++;
            }
        }

        //Calculates the results according to their mathematic formulas.
        sumAvg = sum / counter; 
        sumSquared = sumAvg * sumAvg; 
        sumOfSquares /= counter;
        SV = (sumOfSquares - sumSquared);
        SD = Math.sqrt(SV);

        //Output.
        System.out.println("Here are your results : \n" + "Sum is : " + sum + "\n" + "Average is : " + sumAvg);
        System.out.println("Standard variance is : " + SV + "\n" + "Standard deviation is : " + SD);
    }
}
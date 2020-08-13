public class DigitSumChallenge {

    public static int sumDigits(int number){

        //1. check if the number (parameter) is >0 AND >10

        if(number >= 10){
            int lastDigit;
            int container = 0;

        //2. Creating a loop for selecting and picking all the numbers in input.

            while(number > 0){
                lastDigit = number % 10;                                                                                //It takes the last digit only without the decimals because is an int.
                System.out.println("the last digit is: " + lastDigit);
                number /= 10;                                                                                           //Discard the last digit and replace the original variable with the new one (number = number/10).
                System.out.println("the number left is: "+ number);
                container += lastDigit;                                                                                 //We save the last value in the variable 'container' and every cicle, it add the next value.
                System.out.println("The sum of all numbers so long is: "+ container);                                                              
            }

        //3. Return the result of the loop.

            return container;

        }else{

        //4. If the number is less than 10 and 0.

            if(number <= 0){
                System.out.println("the number inserted is invalid");
            }else{
                System.out.println("the number inserted is less than 10, so the sum of the digits of it, is :" + number);
            }
            return -1;
        }
    }
}

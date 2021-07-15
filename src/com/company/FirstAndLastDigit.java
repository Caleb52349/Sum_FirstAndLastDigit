package com.company;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit (int number){
       //  number validation
        if(number <0) {
            return -1;
        }
       // extracting the last digit from the number
        int lastDigit = number % 10;

       //Using a for loop to get the first digit of the number
        for(int i =number ; i>=10; i/=10) {    // setting the increment to (number or i = number or i/10)
            number /= 10;       // Dividing the number/10 for every iteration, following the condition in the for loop
            System.out.println("number:" + number);
        }
            return lastDigit + number;
        }
}

/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/26 16:12:45 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/26 16:12:45 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import java.util.*;

public class Main{
    public static void main(String[] arg){
        // div by 5 we get fizz
        // div by 3 we get buzz
        // div by 5 and 3 we get fizzbuzz
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int userNumber = scanner.nextInt();
        Boolean wholeNumberDivideByThree = userNumber % 3 == 0;
        Boolean wholeNumberDivideByFive = userNumber % 5 == 0;
        int oneHundred = 100; // used for while loop

        if (wholeNumberDivideByThree && wholeNumberDivideByFive)
            System.out.println("FizBuzz");
        else if (wholeNumberDivideByThree || wholeNumberDivideByFive)
        {
            if (wholeNumberDivideByThree)
            System.out.println("Buzz");
            else
            System.out.println("Fizz");
        } 
        else
            System.out.println(userNumber);
        
        //useing loop from left over numbers to 100 to display fizzBuzz
        System.out.print("Enter Number 1: WhileLoop or 2: ForLoop: ");
        int whatLoop = scanner.nextInt();
        if (whatLoop == 1)
        {
            if (userNumber > 100)
            System.out.println("Number User Entered is greater than 100 only checks to 100");
        while (userNumber <= oneHundred)
        {
            wholeNumberDivideByThree = userNumber % 3 == 0;
            wholeNumberDivideByFive = userNumber % 5 == 0;
            if (wholeNumberDivideByThree && wholeNumberDivideByFive)
                System.out.println("FizBuzz");
            else if (wholeNumberDivideByThree || wholeNumberDivideByFive)
            {
                if (wholeNumberDivideByThree)
                System.out.println("Buzz");
                else
                System.out.println("Fizz");
            } 
            else
                System.out.println(userNumber);
            userNumber++;
        }
        }
        else if (whatLoop == 2)
        {
            if (userNumber > 100)
            System.out.println("Number User Entered is greater than 100 only checks to 100");
        for (int i = userNumber; userNumber < 100; i++)
        {
            wholeNumberDivideByThree = i % 3 == 0;
            wholeNumberDivideByFive = i % 5 == 0;
            if (wholeNumberDivideByThree && wholeNumberDivideByFive)
                System.out.println("FizBuzz");
            else if (wholeNumberDivideByThree || wholeNumberDivideByFive)
            {
                if (wholeNumberDivideByThree)
                System.out.println("Buzz");
                else
                System.out.println("Fizz");
            } 
            else
                System.out.println(userNumber);
            userNumber++;
        }
        }
        else
        System.out.println("Invalid Number");
    }catch (InputMismatchException e) {
            System.out.println("Must enter a Number!.");
        } catch (Exception e)
        {
            System.out.println("Something is wrong.");
        }
    }
}
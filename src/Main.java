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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        Boolean wholeNumberDivideByThree = number % 3 == 0;
        Boolean wholeNumberDivideByFive = number % 5 == 0;

        if (wholeNumberDivideByThree && wholeNumberDivideByFive)
        {
            System.out.println("FizBuzz");
        }
        else if (wholeNumberDivideByThree || wholeNumberDivideByFive)
        {
            if (wholeNumberDivideByThree)
            System.out.println("Buzz");
            else
            System.out.println("Fizz");
        } else
        {
        System.out.println(number);
        }
        // useing loop from left over numbers to 100 to display fizzBuzz
        while (number <= 100)
        {
            wholeNumberDivideByThree = number % 3 == 0;
            wholeNumberDivideByFive = number % 5 == 0;
            if (wholeNumberDivideByThree && wholeNumberDivideByFive)
            {
                System.out.println("FizBuzz");
            }
            else if (wholeNumberDivideByThree || wholeNumberDivideByFive)
            {
                if (wholeNumberDivideByThree)
                System.out.println("Buzz");
                else
                System.out.println("Fizz");
            } else
            System.out.println(number);
            number++;
        }
    }
}
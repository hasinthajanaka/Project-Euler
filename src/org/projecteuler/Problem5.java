package org.projecteuler;

import java.util.ArrayList;

/*
    Smallest multiple
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

    public static void main(String[] args) {

        boolean divisible = false;
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        multiples.add(2);
        multiples.add(3);
        multiples.add(4);
        multiples.add(5);
        multiples.add(6);
        multiples.add(7);
        multiples.add(8);
        multiples.add(9);
        multiples.add(10);
        multiples.add(11);
        multiples.add(12);
        multiples.add(13);
        multiples.add(14);
        multiples.add(15);
        multiples.add(17);
        multiples.add(19);

        int number = 1;

        while (divisible == false) {
            for (Integer multiple : multiples) {
                if (number % multiple == 0) {
                    if (divisible == false) {
                        divisible = true;
                    }
                } else {
                    divisible = false;
                    break;
                }
            }
            number++;
        }
        System.out.println(number - 1);
    }
}

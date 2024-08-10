/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.oop_coursework;

/**
 *
 * @author HP
 */
public class Second_FastestRunner {

    public static void main(String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James",
            "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };
        int[] times = {
            341, 273, 278, 329, 445,
            402, 388, 275, 243, 334,
            412, 393, 299, 343, 317, 265
        };
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;
        int fastestIndex = -1;
        int secondFastestIndex = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTime) {
                secondFastestTime = fastestTime;
                secondFastestIndex = fastestIndex;
                fastestTime = times[i];
                fastestIndex = i;
            } else if (times[i] < secondFastestTime) {
                secondFastestTime = times[i];
                secondFastestIndex = i;
            }
        }
        System.out.println("The second fastest runner is " + names[secondFastestIndex] + " with a time of " + secondFastestTime + " minutes.");
    }
}


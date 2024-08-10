/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.oop_coursework;

/**
 *
 * @author HP
 */
public class FastestRunner {

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
        int fastestTime = times[0];
        int fastestIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < fastestTime) {
                fastestTime = times[i];
                fastestIndex = i;
            }
        }
        System.out.println("The fastest runner is " + names[fastestIndex] + " with a time of " + fastestTime + " minutes.");
    }
}



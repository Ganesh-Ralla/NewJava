package com.exe;

import java.util.Arrays;
import java.util.Scanner;

public class Contacts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        String fname, fletter, s;
        String arr[] = new String[4];
        System.out.println("Enter the names");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        // Printing names in the order they were entered
        System.out.println("Names entered:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Sorting the array
        Arrays.sort(arr);
        System.out.println("Names in sorted order:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Asking for a letter and printing names starting with that letter
        System.out.println("Enter a letter to find names:");
        s = sc.next();
        
        System.out.println("Names with "+s+"are :");
        for (i = 0; i < arr.length; i++) {
            fname = arr[i];
            if (fname.startsWith(s)) {
                System.out.println(fname);
                
            }
        }

        
    }

}
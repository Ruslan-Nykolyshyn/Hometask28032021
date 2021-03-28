package com.company;

import java.io.*;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("Mark", 1234567, 2134);
        do {
            int act = scanner.nextInt();
            if (act >= 1 && act <= 2) {
                switch (act) {
                    case 1:

                        System.out.println();
                        break;
                    case 2:

                        System.out.println();
                        break;

                }

            } else {
                System.out.println("Incorrect choice. Try again.");
            }

        } while (true);

    }

}


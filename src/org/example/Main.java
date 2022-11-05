package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is weekend today? Enter pls");
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Is it Rainy today?");
        boolean isRain = scanner.nextBoolean();
        boolean canWalk;
        if (isWeekend == true && isRain == false)
        canWalk = true;
     else
         canWalk=false;
     System.out.println("Can walk:"+canWalk);
     scanner.close();



    }
}

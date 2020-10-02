package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0;
        int d1, d2;
        System.out.print("Quantes vegades vols llançar el dau? ");
        int n = scanner.nextInt();

        System.out.println("Llançament...\nResultat:");

        do {
            d1 = ThreadLocalRandom.current().nextInt(1, 7);
            d2 = ThreadLocalRandom.current().nextInt(1, 7);

            if (d1+d2 == 2) c2++;
            else if (d1+d2 == 3) c3++;
            else if (d1+d2 == 4) c4++;
            else if (d1+d2 == 5) c5++;
            else if (d1+d2 == 6) c6++;
            else if (d1+d2 == 7) c7++;
            else if (d1+d2 == 8) c8++;
            else if (d1+d2 == 9) c9++;
            else if (d1+d2 == 10) c10++;
            else if (d1+d2 == 11) c11++;
            else c12++;

            i++;
        }while(i != n);

        System.out.println("2 --> " + c2 + " vegades");
        System.out.println("3 --> " + c3 + " vegades");
        System.out.println("4 --> " + c4 + " vegades");
        System.out.println("5 --> " + c5 + " vegades");
        System.out.println("6 --> " + c6 + " vegades");
        System.out.println("7 --> " + c7 + " vegades");
        System.out.println("8 --> " + c8 + " vegades");
        System.out.println("9 --> " + c9 + " vegades");
        System.out.println("10 --> " + c10 + " vegades");
        System.out.println("11 --> " + c11 + " vegades");
        System.out.println("12 --> " + c12 + " vegades");


    }
}

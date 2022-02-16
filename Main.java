package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :2\n :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();

        System.out.println("Toplam Tutar : = " + (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg));
    }
}

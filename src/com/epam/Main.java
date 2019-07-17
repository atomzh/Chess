package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen(8);
        queen.callplaceNqueens();
        System.out.println(queen.getQuantity());

        System.out.println("--------------------------------------------------------");
        System.out.println("Hours algoritm");
        Hourse hourse = new Hourse(8,8,6,4);
        hourse.startWorking();
        hourse.nextStep();
        hourse.getResult();

    }
}

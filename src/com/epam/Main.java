package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen(8);
        queen.callplaceNqueens();
        System.out.println(queen.getQuantity());

    }
}

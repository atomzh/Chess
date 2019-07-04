package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите N-Число верзей и N х N клеток");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        Queen queen = new Queen(Integer.parseInt(n));

    }
}

package atos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zug: a2-a4
        // Zugfolge: a2-a4;b2-b4
        var scanner = new Scanner(System.in);
        var game = new Game();

        String eingabe;
        do {
            eingabe = scanner.nextLine();
        } while (!eingabe.equals(""));
    }
}

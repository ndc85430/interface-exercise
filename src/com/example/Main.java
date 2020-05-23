package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RowWriter rowWriter;
        System.out.print("Enter 'c' to separate by commas, or 't' to separate by tabs: ");
        String input = scanner.next();

        if (input.charAt(0) == 'c') {
            rowWriter = new CommaRowWriter();
        } else {
            rowWriter = new TabRowWriter();
        }

        System.out.println();

        new ContactsApplication(rowWriter).run();
    }
}

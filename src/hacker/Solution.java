package hacker;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] book = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                String isbn = scanner.nextLine();
                book[i] = new Book(name, author, isbn);
                System.out.println(book[i]);
                scanner.close();
            }
}

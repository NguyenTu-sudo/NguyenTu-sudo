package lab;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác (n): ");
        int n = scanner.nextInt();

        // In tam giác
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng ở đầu mỗi dòng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In các ngôi sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng mới
            System.out.println();
        }

        scanner.close();
    }
}

package lab;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1); // Chuyển đổi từ String sang double

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2); // Chuyển đổi từ String sang double

        // Tính toán các phép tính cơ bản
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Kiểm tra phép chia cho 0
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Thương (num1 / num2) = " + quotient);
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        // Hiển thị kết quả các phép tính
        System.out.println("Tổng (num1 + num2) = " + sum);
        System.out.println("Hiệu (num1 - num2) = " + difference);
        System.out.println("Tích (num1 * num2) = " + product);

        scanner.close(); // Đóng đối tượng Scanner
    }
}

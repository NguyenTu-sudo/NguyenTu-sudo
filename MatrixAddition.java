package lab;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        
        // Khai báo hai ma trận với kích thước đã nhập
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];  // Ma trận kết quả
        
        // Nhập các phần tử của ma trận 1
        System.out.println("Nhập các phần tử của ma trận 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix1[" + i + "][" + j + "] = ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Nhập các phần tử của ma trận 2
        System.out.println("Nhập các phần tử của ma trận 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix2[" + i + "][" + j + "] = ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Cộng hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Hiển thị ma trận kết quả
        System.out.println("Ma trận kết quả sau khi cộng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();  // Xuống dòng sau mỗi hàng
        }
        
        // Đóng đối tượng scanner
        scanner.close();
    }
}


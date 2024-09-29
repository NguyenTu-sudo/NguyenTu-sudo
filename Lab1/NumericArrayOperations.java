package lab;

import java.util.Arrays;
import java.util.Scanner;

public class NumericArrayOperations {
    public static void main(String[] args) {
        // Tạo một mảng (có thể thay đổi giá trị hoặc nhập từ người dùng)
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
        
        // Sắp xếp mảng
        Arrays.sort(my_array1);
        
        // Tính tổng
        int sum = 0;
        for (int num : my_array1) {
            sum += num;
        }
        
        // Tính trung bình
        double average = (double) sum / my_array1.length;
        
        // Hiển thị mảng đã sắp xếp, tổng và trung bình
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(my_array1));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Giá trị trung bình: " + average);
    }
}

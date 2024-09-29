package lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaysInMonth {
    
    // Phương thức kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Phương thức lấy số ngày trong tháng
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Tháng không hợp lệ
        }
    }

    public static void main(String[] args) {
        // Tạo cửa sổ chính
        JFrame frame = new JFrame("Days in Month Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Tạo label cho nhập tháng
        JLabel monthLabel = new JLabel("Enter month (name or number):");
        monthLabel.setBounds(20, 20, 200, 30);
        frame.add(monthLabel);

        // Tạo ô nhập tháng
        JTextField monthField = new JTextField();
        monthField.setBounds(220, 20, 150, 30);
        frame.add(monthField);

        // Tạo label cho nhập năm
        JLabel yearLabel = new JLabel("Enter year:");
        yearLabel.setBounds(20, 60, 200, 30);
        frame.add(yearLabel);

        // Tạo ô nhập năm
        JTextField yearField = new JTextField();
        yearField.setBounds(220, 60, 150, 30);
        frame.add(yearField);

        // Tạo nút tính toán
        JButton calculateButton = new JButton("Calculate Days");
        calculateButton.setBounds(120, 100, 150, 30);
        frame.add(calculateButton);

        // Tạo label để hiển thị kết quả
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 140, 350, 30);
        frame.add(resultLabel);

        // Mảng chứa tên các tháng
        String[] months = { "January", "February", "March", "April", "May", "June", "July", 
                            "August", "September", "October", "November", "December" };

        // Xử lý sự kiện khi nhấn nút "Calculate Days"
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String monthInput = monthField.getText().trim();
                String yearInput = yearField.getText().trim();
                
                try {
                    // Kiểm tra năm nhập vào có hợp lệ không
                    int year = Integer.parseInt(yearInput);
                    if (year < 0) {
                        resultLabel.setText("Invalid year! Please enter a non-negative number.");
                        return;
                    }

                    int month = -1;
                    
                    try {
                        // Kiểm tra xem người dùng nhập số cho tháng
                        month = Integer.parseInt(monthInput);
                        if (month < 1 || month > 12) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException ex) {
                        // Nếu không phải số, kiểm tra tên hoặc viết tắt của tháng
                        for (int i = 0; i < months.length; i++) {
                            if (months[i].equalsIgnoreCase(monthInput) || 
                                months[i].substring(0, 3).equalsIgnoreCase(monthInput) || 
                                (months[i].substring(0, 3) + ".").equalsIgnoreCase(monthInput)) {
                                month = i + 1;
                                break;
                            }
                        }
                    }

                    if (month == -1) {
                        resultLabel.setText("Invalid month! Please try again.");
                        return;
                    }

                    // Lấy số ngày trong tháng
                    int days = getDaysInMonth(month, year);
                    resultLabel.setText("Month " + months[month - 1] + " of year " + year + " has " + days + " days.");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}

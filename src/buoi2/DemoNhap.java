package buoi2;

import java.util.Scanner;

public class DemoNhap {

    public static void main(String[] args) {
        // B1: Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập 1 số: ");

        // B2: dựa trên biến sc của Scanner, gọi hàm nextInt() để nhập số nguyên
        int i = sc.nextInt();

        // B3: In kết quả
        System.out.print("Số vừa nhập: ");
        System.out.println(i);
    }
}

package lab5;

import java.util.ArrayList;

public class Bai_5_6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(10); // Thêm vào ArrayList một số nguyên
        list.add(3.14); // Thêm vào ArrayList một số thực
        list.add(true); // Thêm vào ArrayList một giá trị boolean
        list.add("Hello, world!"); // Thêm vào ArrayList một chuỗi

        System.out.println("Các giá trị trong ArrayList:");
        System.out.println(list.get(0)); // In ra giá trị đầu tiên (số nguyên)
        System.out.println(list.get(1)); // In ra giá trị thứ hai (số thực)
        System.out.println(list.get(2)); // In ra giá trị thứ ba (boolean)
        System.out.println(list.get(3)); // In ra giá trị thứ tư (chuỗi)
    }
}

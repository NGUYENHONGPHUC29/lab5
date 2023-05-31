package lab5;

import java.util.*;

public class Bai_5_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    System.out.print("Nhập số lượng phần tử của stack: ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
        int x = scanner.nextInt();
        stack.push(x);
    }

    System.out.print("Nhập số phần tử bạn muốn lấy ra từ Stack: ");
    int m = scanner.nextInt();

    for (int i = 0; i < m; i++) {
        int x = stack.pop();
        System.out.println("Phần tử lấy ra: " + x);
    }
  }
}

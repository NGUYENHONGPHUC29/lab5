package lab5;

import java.util.*;

public class Bai_5_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số tự nhiên n: ");
    int n = scanner.nextInt();

    List<Integer> digits = new ArrayList<>();

    int temp = n;
    while (temp > 0) {
        digits.add(temp % 10);
        temp /= 10;
    }

    boolean isPalindrome = true;
    for (int i = 0; i < digits.size() / 2; i++) {
        if (digits.get(i) != digits.get(digits.size() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println(n + " là số thuận nghịch.");
    } else {
        System.out.println(n + " không phải là số thuận nghịch.");
    }
  }
}

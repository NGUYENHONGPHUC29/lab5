package lab5;

import java.util.*;

public class Bai_5_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số lượng phần tử của mảng: ");
    int n = scanner.nextInt();

    double[] arr = new double[n];
    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextDouble();
    }

    System.out.print("Nhập số thực A: ");
    double A = scanner.nextDouble();

    Set<Double> uniqueElements = new TreeSet<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
        double x = arr[i];
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == x) {
                count++;
            }
        }
        if (count == 1) {
            uniqueElements.add(x);
        }
    }

    if (uniqueElements.contains(A)) {
        System.out.println("Mảng chứa số thực A.");
    } else {
        System.out.println("Mảng không chứa số thực A.");
    }

    System.out.println("Các phần tử xuất hiện một lần trong mảng theo thứ tự giảm dần:");
    for (double x : uniqueElements) {
        System.out.print(x + " ");
    }
    System.out.println();
  }
}

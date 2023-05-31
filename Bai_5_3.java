package lab5;

import java.util.*;

public class Bai_5_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số lượng phần tử của mảng: ");
    int n = scanner.nextInt();

    double[] arr = new double[n];
    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextDouble();
    }

    Set<Double> uniqueElements = new HashSet<>();
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

    System.out.println("Các phần tử xuất hiện đúng 1 lần trong mảng (sử dụng Set):");
    for (double x : uniqueElements) {
        System.out.print(x + " ");
    }
    System.out.println();

    Map<Double, Integer> elementCounts = new HashMap<>();
    for (int i = 0; i < n; i++) {
        double x = arr[i];
        if (elementCounts.containsKey(x)) {
            elementCounts.put(x, elementCounts.get(x) + 1);
        } else {
            elementCounts.put(x, 1);
        }
    }

    System.out.println("Các phần tử xuất hiện đúng 1 lần trong mảng (sử dụng Map):");
    for (double x : elementCounts.keySet()) {
        if (elementCounts.get(x) == 1) {
            System.out.print(x + " ");
        }
    }
    System.out.println();
  }
}

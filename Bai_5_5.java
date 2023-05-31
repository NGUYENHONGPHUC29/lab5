package lab5;

import java.util.*;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
       this.maSV = maSV;
       this.hoTen = hoTen;
       this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}

public class Bai_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        Map<String, SinhVien> sinhVienMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sinh viên: ");
            String maSV = scanner.next();
            System.out.print("Nhập họ và tên: ");
            String hoTen = scanner.nextLine().trim(); // Xóa bỏ kí tự '\n' tự động được thêm vào sau khi nhập số lượng sinh viên
            System.out.print("Nhập lớp: ");
            String lop = scanner.next();
            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            sinhVienMap.put(maSV, sinhVien);
        }

        System.out.print("Nhập tên lớp cần tìm: ");
        String tenLop = scanner.next();
        System.out.println("Các sinh viên thuộc lớp " + tenLop + ":");
        for (SinhVien sv : sinhVienMap.values()) {
            if (sv.getLop().equals(tenLop)) {
                System.out.println(sv.getMaSV() + "\t" + sv.getHoTen() + "\t" + sv.getLop());
            }
        }

        System.out.print("Nhập mã sinh viên cần tìm: ");
        String maSVCanTim = scanner.next();
        SinhVien sinhVienCanTim = sinhVienMap.get(maSVCanTim);
        if (sinhVienCanTim != null) {
            System.out.println("Thông tin sinh viên có mã " + maSVCanTim + ":");
            System.out.println(sinhVienCanTim.getHoTen() + "\t" + sinhVienCanTim.getLop());
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maSVCanTim);
        }
    }
}

import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n--- KET QUA NHAP KHO ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("---------------------------");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);
        System.out.println("TONG TIEN NHAP: " + tongTienNhap);

        scanner.close();
    }
}
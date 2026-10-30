import java.util.Scanner;

public class BTT4 {
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

    
        System.out.print("Chon loai sach (1-Giao khoa, 2-Tham khao, 3-Chuyen nganh, 4-Khac): ");
        int loaiSach = scanner.nextInt();

        
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("\n--- KET QUA PHAN TICH SACH ---");

            System.out.print("-> Muc gia: ");
            if (donGia < 50000) {
                System.out.println("Sach gia thap");
            } else if (donGia <= 100000) {
                System.out.println("Sach gia trung binh");
            } else if (donGia <= 200000) {
                System.out.println("Sach gia cao");
            } else {
                System.out.println("Sach gia dac biet");
            }

            // BÀI 3: Phân loại tồn kho bằng if-else[cite: 13]
            System.out.print("-> Tinh trang kho: ");
            if (soLuong == 0) {
                System.out.println("Het sach");
            } else if (soLuong >= 1 && soLuong <= 5) {
                System.out.println("Sap het");
            } else if (soLuong >= 6 && soLuong <= 20) {
                System.out.println("Con it");
            } else {
                System.out.println("Con nhieu");
            }

            System.out.print("-> Phan loai: ");
            switch (loaiSach) {
                case 1:
                    System.out.println("Sach giao khoa");
                    break;
                case 2:
                    System.out.println("Sach tham khao");
                    break;
                case 3:
                    System.out.println("Sach chuyen nganh");
                    break;
                case 4:
                    System.out.println("Sach khac");
                    break;
                default:
                    System.out.println("Khong xac dinh");
                    break;
            }
        } else {
            System.out.println("\n[LOI] Thong tin khong hop le! Gia phai > 0, So luong >= 0, Nam XB hop le.");
        }

        scanner.close();
    }
}
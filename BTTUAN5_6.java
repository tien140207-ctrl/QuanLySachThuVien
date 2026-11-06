import java.util.Scanner;

public class BTTUAN5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Khai báo các mảng để chứa tối đa 100 cuốn sách
        String[] arrMaSach = new String[100];
        String[] arrTenSach = new String[100];
        double[] arrDonGia = new double[100];
        int[] arrSoLuong = new int[100];
        
        int n = 0; 
        int luaChon;

        do {
            System.out.println("\n===== HE THONG QUAN LY THU VIEN =====");
            System.out.println("1. Nhap danh sach sach (Bai 1 & 2)");
            System.out.println("2. Tim sach theo ma (Bai 4)");
            System.out.println("3. Thoat");
            System.out.print("Chon chuc nang (1-3): ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sach muon them (n): ");
                    n = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;
                    
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap thong tin cuon sach thu " + (i + 1) + " ---");
                        System.out.print("Ma sach: ");
                        arrMaSach[i] = scanner.nextLine();
                        
                        System.out.print("Ten sach: ");
                        arrTenSach[i] = scanner.nextLine();
                        
                        System.out.print("Don gia: ");
                        arrDonGia[i] = scanner.nextDouble();
                        
                        System.out.print("So luong: ");
                        arrSoLuong[i] = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        tongSoLuong += arrSoLuong[i];
                        tongGiaTri += (arrDonGia[i] * arrSoLuong[i]);
                    }
                    
                    System.out.println("\n=> DA NHAP XONG " + n + " CUON SACH!");
                    System.out.println("=> Tong so luong tat ca cac sach: " + tongSoLuong);
                    System.out.println("=> Tong gia tri kho sach: " + tongGiaTri);
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("\n[LOI] Kho dang trong! Vui long chon 1 de nhap sach truoc.");
                    } else {
                        System.out.print("\nNhap MA SACH can tim: ");
                        String maTimKiem = scanner.nextLine();
                        boolean timThay = false;
                        
                        for (int i = 0; i < n; i++) {
                            if (arrMaSach[i].equals(maTimKiem)) {
                                System.out.println("--- DA TIM THAY SACH ---");
                                System.out.println("Ten sach: " + arrTenSach[i]);
                                System.out.println("Don gia: " + arrDonGia[i]);
                                System.out.println("So luong: " + arrSoLuong[i]);
                                timThay = true;
                                break; 
                            }
                        }
                        
                        if (!timThay) {
                            System.out.println("Khong tim thay sach nao co ma: " + maTimKiem);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nDa thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("\n[LOI] Lua chon khong hop le. Vui long nhap lai!");
            }
        } while (luaChon != 3); 
        
        scanner.close();
    }
}
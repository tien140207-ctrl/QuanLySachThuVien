import java.util.ArrayList;
import java.util.Scanner;

public class BTTUAN5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- BÀI 1: Xử lý mảng cố định (Mảng int[]) ---[cite: 20]
        System.out.println("=== BAI 1: MANG SO LUONG CO DINH ===");
        int[] soLuong = new int[5];
        int tongSoLuongBai1 = 0;
        int maxSoLuong = 0;
        
        System.out.println("Vui long nhap so luong cho 5 cuon sach:");
        for (int i = 0; i < 5; i++) {
            System.out.print("So luong cuon thu " + (i + 1) + ": ");
            soLuong[i] = scanner.nextInt();
            
            // Tính tổng
            tongSoLuongBai1 += soLuong[i];
            
            // Tìm số lượng lớn nhất
            if (i == 0 || soLuong[i] > maxSoLuong) {
                maxSoLuong = soLuong[i];
            }
        }
        
        System.out.println("\n-> Danh sach so luong vua nhap: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soLuong[i] + "  ");
        }
        System.out.println("\n-> Tong so luong: " + tongSoLuongBai1);
        System.out.println("-> So luong lon nhat: " + maxSoLuong);
        System.out.println("\n------------------------------------------------\n");
        scanner.nextLine(); // Xóa bộ nhớ đệm trước khi sang Bài 2,3,4
        
        
        // --- BÀI 2, 3 & 4: HỆ THỐNG QUẢN LÝ BẰNG ARRAYLIST ---[cite: 21]
        // Khai báo ArrayList chứa thông tin sách (Mỗi phần tử là 1 chuỗi chứa toàn bộ thông tin 1 cuốn)[cite: 21]
        ArrayList<String> danhSachSach = new ArrayList<>();
        int luaChon;

        // BÀI 4: Xây dựng menu hoàn chỉnh[cite: 21]
        do {
            System.out.println("\n===== MENU QUAN LY THU VIEN (ARRAYLIST) =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Moi chon chuc nang (1-8): ");
            
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm
            
            switch (luaChon) {
                case 1: // Thêm sách[cite: 21]
                    System.out.println("\n--- THEM SACH MOI ---");
                    System.out.print("Nhap Ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhap Ten sach: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhap So luong: ");
                    int sl = scanner.nextInt();
                    System.out.print("Nhap Don gia: ");
                    double gia = scanner.nextDouble();
                    
                    // Gộp tất cả thông tin thành 1 chuỗi và đưa vào ArrayList
                    String thongTinSach = ma + " - " + ten + " - SL: " + sl + " - Gia: " + gia;
                    danhSachSach.add(thongTinSach);
                    System.out.println("=> Da them sach thanh cong!");
                    break;
                    
                case 2: // Hiển thị sách[cite: 21]
                    System.out.println("\n--- DANH SACH CA T THE TRONG THU VIEN ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Kho sach dang trong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;
                    
                case 3: // Tìm sách[cite: 21]
                    System.out.print("\nNhap Ma sach hoac Ten sach can tim: ");
                    String tuKhoa = scanner.nextLine();
                    boolean timThay = false;
                    
                    for (String s : danhSachSach) {
                        // Hàm contains() giúp tìm chuỗi con nằm bên trong chuỗi lớn
                        if (s.contains(tuKhoa)) {
                            System.out.println("=> Tim thay: " + s);
                            timThay = true;
                        }
                    }
                    if (!timThay) System.out.println("Khong tim thay sach nao phu hop!");
                    break;
                    
                case 4: // Xóa sách[cite: 21]
                    System.out.print("\nNhap Ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    boolean daXoa = false;
                    
                    // Vòng lặp ngược để xóa an toàn trong ArrayList
                    for (int i = danhSachSach.size() - 1; i >= 0; i--) {
                        if (danhSachSach.get(i).startsWith(maXoa + " -")) {
                            danhSachSach.remove(i);
                            System.out.println("=> Da xoa sach thanh cong!");
                            daXoa = true;
                            break;
                        }
                    }
                    if (!daXoa) System.out.println("Khong tim thay ma sach de xoa!");
                    break;
                    
                case 5: // Sửa sách[cite: 21]
                    System.out.print("\nNhap Ma sach can sua: ");
                    String maSua = scanner.nextLine();
                    boolean daSua = false;
                    
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maSua + " -")) {
                            System.out.println("Thong tin hien tai: " + danhSachSach.get(i));
                            System.out.println("--- Nhap thong tin moi ---");
                            System.out.print("Nhap Ten sach moi: ");
                            String tenMoi = scanner.nextLine();
                            System.out.print("Nhap So luong moi: ");
                            int slMoi = scanner.nextInt();
                            System.out.print("Nhap Don gia moi: ");
                            double giaMoi = scanner.nextDouble();
                            
                            // Tạo chuỗi mới và ghi đè (set) vào vị trí cũ
                            String thongTinMoi = maSua + " - " + tenMoi + " - SL: " + slMoi + " - Gia: " + giaMoi;
                            danhSachSach.set(i, thongTinMoi);
                            System.out.println("=> Da cap nhat thong tin sach!");
                            daSua = true;
                            break;
                        }
                    }
                    if (!daSua) System.out.println("Khong tim thay ma sach de sua!");
                    break;
                    
                case 6: // Tính tổng số lượng[cite: 21]
                case 7: // Tính tổng giá trị[cite: 21]
                    int tongSL = 0;
                    double tongGia = 0;
                    
                    for (String s : danhSachSach) {
                        // Kỹ thuật tách chuỗi (split) để lấy ra số lượng và đơn giá từ chuỗi tổng hợp
                        String[] phanTu = s.split(" - ");
                        // phanTu[2] là "SL: x", ta cắt bỏ chữ "SL: " để lấy số
                        int soLuongThuc = Integer.parseInt(phanTu[2].replace("SL: ", ""));
                        // phanTu[3] là "Gia: y", ta cắt bỏ chữ "Gia: " để lấy số
                        double donGiaThuc = Double.parseDouble(phanTu[3].replace("Gia: ", ""));
                        
                        tongSL += soLuongThuc;
                        tongGia += (soLuongThuc * donGiaThuc);
                    }
                    
                    if (luaChon == 6) {
                        System.out.println("\n=> Tong so luong sach trong kho: " + tongSL);
                    } else {
                        System.out.println("\n=> Tong gia tri kho sach: " + tongGia);
                    }
                    break;
                    
                case 8: // Thoát
                    System.out.println("\nDa thoat chuong trinh. Tam biet!");
                    break;
                    
                default:
                    System.out.println("\n[LOI] Lua chon khong hop le!");
            }
            
        } while (luaChon != 8);
        
        scanner.close();
    }
}
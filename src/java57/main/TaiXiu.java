package java57.main;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) throws IOException {
        double taiKhoanNguoiChoi = 5000;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Locale lc = new Locale("vn", "VN");
        NumberFormat numf = NumberFormat.getInstance(lc);

        int luaChon = 1;
        do {
            // Nguoi choi chon tiep tuc hay dung lai
            System.out.println("\n\n----------MỜI BẠN LỰA CHỌN----------");
            System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
            System.out.println("\n\nChon (1) de tiep tuc choi.");
            System.out.println("Chon phim bat ky de thoat.");
            luaChon = sc.nextInt();

            if (luaChon == 1) {
                System.out.println("----- BAT DAU CHOI -----");
                System.out.print("--- Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi) + ", ban muon cuoc bao nhieu? :");
                double datCuoc = 0;

                // Nguoi choi chon so tien dat cuoc
                do {
                    try {
                        datCuoc = sc.nextDouble();
                        if (datCuoc > taiKhoanNguoiChoi || datCuoc <= 0) {
                            if (datCuoc <= 0) {
                                System.out.println("Ban khong the dat cuoc so tien <= 0!");
                                System.out.print("Vui long nhap lai: ");
                            } else {
                                System.out.println("Ban khonng the dat cuoc qua so von cua ban!");
                                System.out.print("Vui long nhap lai: ");
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("So tien ban nhap khong hop le");
                        System.out.print("Vui long nhap lai: ");
                        sc.next();
                    }
                } while (true);

                System.out.println("--- So tien con lai trong tai khoan: " + numf.format(taiKhoanNguoiChoi - datCuoc));
                System.out.println("--- So tien dat cuoc la: " + numf.format(datCuoc));

                // Người chơi lựa chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.print("Ban chon Tai hay Xiu (1 - Tai | 2 - Xiu): ");
                    luaChonTaiXiu = sc.nextInt();
                    if(!(luaChonTaiXiu ==1 || luaChonTaiXiu ==2)){
                        System.out.println("Vui long chon lai!");
                    }else{
                        break;
                    }
                }while (true);

                // Do xuc sac
                int res = 0;
                for (int i=0;i<3;i++){
                    res += random.nextInt(6) + 1;
                    //System.out.println(res);
                }

                // Ket qua
                System.out.println("Ket qua la: " + res);
                switch (res){
                    case 3:
                    case 18:
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Good luck next time!");
                        System.out.println("Nha cai an het!");
                        taiKhoanNguoiChoi -= datCuoc;
                        break;
                    default:
                        if(res >=4 && res<=10){
                            if (luaChonTaiXiu == 1){
                                System.out.println("Good luck next time!");
                                System.out.println("Nha cai an het!");
                                taiKhoanNguoiChoi -= datCuoc;
                            }else{
                                System.out.println("Chuc mung ban!");
                                System.out.println("Ban da thang!");
                                taiKhoanNguoiChoi += datCuoc;
                            }
                        }else{
                            if (luaChonTaiXiu == 2){
                                System.out.println("Good luck next time!");
                                System.out.println("Nha cai an het!");
                                taiKhoanNguoiChoi -= datCuoc;
                            }else{
                                System.out.println("Chuc mung ban!");
                                System.out.println("Ban da thang!");
                                taiKhoanNguoiChoi += datCuoc;
                            }
                        }
                }
            } else {
                break;
            }
        } while (true);
        System.out.println("Tam biet!");
    }
}

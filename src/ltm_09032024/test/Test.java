package ltm_09032024.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void taoThuMuc(String path){
        // Khai bao ra file moi
        File file = new File(path);

        // Tao thu muc
        //file.mkdir();

        // Tao nhieu thu muc
        if(!file.exists()){
            file.mkdirs();
        }else{
            System.out.println("Thu muc da ton tai");
        }
    }

    public static void taoTapTin(String path){
        File file = new File(path);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {

            }
        }else{
            System.out.println("Tap tin da ton tai");
        }
    }

    public static void xoaThuMuc(String path){
        File file = new File(path);
        if (file.exists()){
            if(file.isDirectory()){
                // Xoa noi dung ben trong
                File[] files = file.listFiles();
                for(File f : files){
                    xoaThuMuc(f.getAbsolutePath());
                }
            }
            file.delete();
        }else{
            System.out.println("Thu muc khong ton tai");
        }
    }

    public static void hienThiThuMuc(String path){
        File file = new File(path);

        if(!file.exists()){
            return;
        }

        hienThiThuMucChiTiet(path, 0);
    }

    public static void hienThiThuMucChiTiet(String path, int level){
        File file = new File(path);

        for (int i=0;i<level;i++){
            System.out.print("\t");
        }
        if(file.isFile()){
            System.out.println("|__" + file.getName());
        }else{
            System.out.println("|__" + file.getName());

            File[] files = file.listFiles();

            for (File f : files){
                hienThiThuMucChiTiet(f.getAbsolutePath(), level+1);
            }
        }
    }

    public static void thongTinChiTiet(String path){
        File file = new File(path);

        if(!file.exists()){
            return;
        }

        System.out.println("Thong tin chi tiet");
        System.out.println("Ten file: " + file.getName());
        System.out.println("Loai: " + (file.isFile() ? "File" : "Directory"));
        System.out.println("Luu tru: " + file.getTotalSpace());
        System.out.println("File an: " + file.isHidden());
    }
    public static void main(String[] args) {
        String path = "src/ltm_09032024/test/dir1/dir2/dir3/hello.java";
        //taoThuMuc(path);
        //taoTapTin(path);
        //xoaThuMuc("src/ltm_09032024/test/dir1/");
        //hienThiThuMuc("src/ltm_09032024/");
        thongTinChiTiet("src");
    }
}

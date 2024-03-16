package ltm_16032024.main;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    // 1. Kiem tra file src va dest co ton tai hay chua
    // 2. Doc du lieu tu file src
    // 3. Ghi du lieu vao dest
    // 4. Doc file src va dest
    public static void Copy(String src, String dest) throws IOException {
        File fileSrc = new File(src);
        File fileDest = new File(dest);
        Scanner sc = new Scanner(System.in);

        // Kiem tra file nguon
        if(!fileSrc.exists()){
            System.err.println("Error: File Source not exists");
            return;
        }

        // Kiem tra file dich
        if(fileDest.exists()){
            System.out.println("File da ton tai, ban co muon gi de khong");
            String c = sc.nextLine();

            if(c.equals("n")) return; // Ngung chuong trinh
        }else{
            try{
                fileDest.createNewFile();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Tao stream de doc du lieu
        FileInputStream fis = new FileInputStream(fileSrc);
        // Tao stream de ghi du lieu
        FileOutputStream fos = new FileOutputStream(fileDest);

        // Copy
        int b = 0;
        while (true){
            b = fis.read(); // Doc len 1 byte
            if(b==-1) break; // Khong co du lieu de doc (==-1)
            fos.write(b);
            fos.flush(); // Ep du lieu tren Ram xuong file ngay lap tuc
        }
        fis.close();
        fos.close();
    }

    public static void Copy1MB(String src, String dest) throws IOException {
        File fileSrc = new File(src);
        File fileDest = new File(dest);
        Scanner sc = new Scanner(System.in);

        // Kiem tra file nguon
        if(!fileSrc.exists()){
            System.err.println("Error: File Source not exists");
            return;
        }

        // Kiem tra file dich
        if(fileDest.exists()){
            System.out.println("File da ton tai, ban co muon gi de khong");
            String c = sc.nextLine();

            if(c.equals("n")) return; // Ngung chuong trinh
        }else{
            try{
                fileDest.createNewFile();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Tao stream de doc du lieu
        FileInputStream fis = new FileInputStream(fileSrc);
        // Tao stream de ghi du lieu
        FileOutputStream fos = new FileOutputStream(fileDest);

        // Copy
        //int b = 0;
        byte[] arr =  new byte[1024*1024];
        while (true){
            int n = fis.read(arr); // Doc 1 MB
            if(n == -1) break;

            fos.write(arr, 0, n);
            fos.flush();
        }
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws IOException {
        Copy("D:\\Desktop\\LAP_TRINH_MANG\\Workspace\\Workspace\\src\\ltm_16032024\\main\\hello.txt", "D:\\Desktop\\LAP_TRINH_MANG\\Workspace\\Workspace\\src\\ltm_16032024\\test\\hello.txt");
    }
}

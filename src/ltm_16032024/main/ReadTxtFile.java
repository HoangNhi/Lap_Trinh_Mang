package ltm_16032024.main;

import java.io.*;

public class ReadTxtFile {
    public static void main(String[] args) {
        try{
            String src = "D:\\Desktop\\LAP_TRINH_MANG\\Workspace\\Workspace\\src\\ltm_16032024\\main\\hello.txt";
            File file = new File(src);
            InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            // Doc file text
            while (true){
                String line = br.readLine();

                if(line == null) break;

                System.out.println(line); // Xuat ra man hinh
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

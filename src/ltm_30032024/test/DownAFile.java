package ltm_30032024.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownAFile {
    public static void main(String[] args) {
        String fileUrl = "https://i.pinimg.com/236x/99/46/5b/99465b46614b062f85763fd8028fc254.jpg";
        String saveDir = "D:\\Desktop\\LAP_TRINH_MANG\\Workspace\\Workspace\\src\\ltm_30032024\\Down";

        try{
            URL url = new URL(fileUrl);
            URLConnection connection = url.openConnection();

            InputStream is = connection.getInputStream();
            String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);

            File dir = new File(saveDir);
            if(dir.exists()){

            }else{
                dir.mkdirs();
            }

            FileOutputStream fos = new FileOutputStream(saveDir+File.separator + fileName);
            int byteRead;
            byte[] buffer = new byte[4096];
            while ((byteRead=is.read(buffer)) != -1){
                fos.write(buffer);
                fos.flush();
            }

            fos.close();
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

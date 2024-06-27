import java.io.*;

public class Q7_FileCopy {
    public static void main(String[] args) {
        String sourceFile = "./File/sourceFile.txt";
        String targetFile = "./File/targetFile.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(targetFile);

            int bytesRead;
            byte[] buffer = new byte[4096]; // adjust the buffer

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
            System.out.println("FILE COPIED FROM " + sourceFile + " TO " + targetFile);

        } catch (Exception e) {
            System.err.println("PRAKHAR'S Exception : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        try {
            OutputStream hyy = new FileOutputStream("filehand.txt");
            OutputStream byy = new BufferedOutputStream(hyy);
            System.out.println("file is created");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error occured");

        }
        try {
            OutputStream hyy = new FileOutputStream("filehand.txt");
            OutputStream byy = new BufferedOutputStream(hyy);
            System.out.println("please write the string");
            Scanner oh = new Scanner(System.in);
            String str = oh.nextLine();
            // String str="hello budddy";
            byte[] hr = str.getBytes();
            byy.write(hr);
            byy.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        try {
            InputStream hyy = new FileInputStream("filehand.txt");
            InputStream byy = new BufferedInputStream(hyy);

            int i = byy.read();
            System.out.println("read the file");
            System.out.println("bytes before read the file "+byy.available());
            while (i != -1) {
                System.out.print((char) i);
                i = byy.read();
            }
            System.out.println("\nbytes after read the file "+ byy.available());
            byy.close();

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File oi = new File("filehand.txt");
            if (oi.exists()) {
                System.out.println(oi.getAbsolutePath());
                System.out.println(oi.getName());
                System.out.println(oi.length());
                System.out.println(oi.canWrite());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }

}
package com.company;
import java.util.zip.*;
import java.io.*;
public class JavaZip {
    public static void zip(File source, File destination) throws IOException {
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);
        GZIPOutputStream gzos = new GZIPOutputStream(fos);
        int read;
        while ((read = fis.read(buffer)) != -1) {
            gzos.write(buffer, 0, read);
        }
        gzos.finish();
        gzos.close();
        fis.close();
        fos.close();
    }

    public static void main(String[] args) {
        File source = new File("d:\\users\\Duke\\workspace");
        File destination = new File("d:\\users\\Duke\\zip");
        try {
            zip(source,destination);
        }
         catch(IOException e){
             System.out.println(e);
    }
}
    }

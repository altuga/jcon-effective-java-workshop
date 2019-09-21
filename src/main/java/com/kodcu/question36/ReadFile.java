package com.kodcu.question36;

import java.io.*;


/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 * <p>
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */


/*
TODO: 
 1 - What are the alternatives for copy() method
*/
public class ReadFile {

    private static final int BUFFER_SIZE = 8 * 1024;


    static void copy(String src, String dst) throws IOException { // 2
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }

            // 4

        } catch (IOException ex) {
            System.err.println(ex);
            throw ex; //1

            //3
        }


    }

    public static void main(String[] args) throws IOException{
        String src = "a.txt"; // always gives error
        String dst = "b.txt"; // always gives error

        // 5
        copy(src, dst);

    }
}

package com.java.training.tests.exceptions.exceptionstest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Hello world!
 *
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            BufferedReader bufferedReader = new BufferedReader(new Reader() {
                
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }
                
                @Override
                public void close() throws IOException {}
            });
        } catch (Exception e) {
        }
    }
}

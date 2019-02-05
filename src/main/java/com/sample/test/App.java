package com.sample.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Issue line is deleted");
        
    }
    
    public void mainDup( String[] args ){
      try {
                        FileInputStream fi = new FileInputStream("");
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
    }
}

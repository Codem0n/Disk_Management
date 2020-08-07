package com.codemon;

import java.io.File;


public class FreeSpaceExample
    {
        public static void main(String args[])
        {
            File file = new File("D:");
            long totalSpace=file.getTotalSpace() /(1024*1024);
            long freeSpace= file.getFreeSpace() /(1024*1024);
            System.out.println("Total Space = "+totalSpace+"Megabyte");
            System.out.println("Free Space = "+freeSpace+"Megabyte");

        }

    }



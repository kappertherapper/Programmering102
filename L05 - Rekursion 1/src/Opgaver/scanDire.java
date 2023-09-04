package Opgaver;

import java.io.File;

public class scanDire {
    public static void main(String[] args) {
        scanDir("/Users/kasperjonassen/PRO2/Programmering102/L01 - Klassehierkier 1");

    }

    public static void scanDir(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println(file.getName());
            for (File fil : file.listFiles()) {
                scanDir(fil.getAbsolutePath());
            }
        }
    }
}



package Opgaver;

import java.io.File;
import java.util.Arrays;

public class scanDire {
    public static void main(String[] args) {
        scanDir("/Users/kasperjonassen/PRO2/Programmering102/L01 - Klassehierkier 1");

    }

    public static void scanDir(String path) {
        File file = new File(path);
        String[] list = file.list();

        for (int i = 0; i < list.length; i++) {
            File newFile = new File(path + "\\" + list[i]);
            for (String fs : list) {
            if (file.isDirectory()) {
                scanDir(Arrays.toString(list));
                }
            }
        }

        if (file.isDirectory()) {
            System.out.println(file.getName());
            for (File fil : file.listFiles()) {
                scanDir(fil.getAbsolutePath());
            }
        }
    }
}



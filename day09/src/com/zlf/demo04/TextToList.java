package com.zlf.demo04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TextToList {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("day09\\src\\name.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        br.close();

//        for (String s : list) {
//            System.out.println(s);
//        }
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));
    }

}

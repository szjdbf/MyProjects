package com.zlf.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Set<Integer> nums = new HashSet<>();
        Random r = new Random();

        while (nums.size() != 3) {
            nums.add(r.nextInt(100) + 1);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\number.txt"));

        int index = 0;
        for (Integer num : nums) {
            bw.write("号码" + (++index) + ":" + num + "号");
            bw.newLine();
        }

        bw.close();
    }
}

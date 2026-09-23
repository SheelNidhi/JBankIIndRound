package org.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reorder {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for(String str : logs) {
            // Split only into 2 parts: [identifier, everything else]
            String[] parts = str.split(" ", 2);

            if(Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(str);
            } else {
                letterLogs.add(str);
            }
        }

        // FIX 1: Custom sort for Letter Logs
        Collections.sort(letterLogs, (a, b) -> {
            String[] splitA = a.split(" ", 2);
            String[] splitB = b.split(" ", 2);

            // Compare the content (index 1)
            int cmp = splitA[1].compareTo(splitB[1]);
            if (cmp != 0) return cmp;

            // If content is same, compare identifiers (index 0)
            return splitA[0].compareTo(splitB[0]);
        });

        // FIX 2: Digit logs are NOT sorted (maintain relative order)

        String ans[] = new String[logs.length];
        int index = 0;

        // FIX 3: Clean up the array filling
        for(String s : letterLogs) {
            ans[index++] = s;
        }
        for(String s : digitLogs) {
            ans[index++] = s;
        }

        return ans;
    }
    public static void main(String[] args) {
        String []logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        Reorder order = new Reorder();
      String [] x=  order.reorderLogFiles(logs);
      for(String str: x)
          System.out.println("str"+str);
    }
}

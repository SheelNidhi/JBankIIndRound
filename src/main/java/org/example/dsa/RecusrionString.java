package org.example.dsa;

public class RecusrionString {
    // given a string
    // 1111 222 333 4
    //4 6 9 4
    //1094
    //194
    //31 222 333 4
    //
    //11112223334
    public String digitSum(String str, int k) {

        if (str.length() <= k) {
            return str;
        }

        StringBuilder nextRound = new StringBuilder();


        for (int i = 0; i < str.length(); i += k) {


            String group = str.substring(i, Math.min(i + k, str.length()));

            // 4. THE DIGIT SUMMER
            int sum = 0;
            for (char c : group.toCharArray()) {
                sum += c - '0'; // Converts the character '1' into the number 1
            }


            nextRound.append(sum);
        }


        return digitSum(nextRound.toString(), k);
    }


    public static void main(String[] args) {
       // String str ="11111222223";
        String str ="00000000";
        RecusrionString s1 = new RecusrionString();
        String answer = s1.digitSum(str,3);
        System.out.println("answer"+answer);


    }
}

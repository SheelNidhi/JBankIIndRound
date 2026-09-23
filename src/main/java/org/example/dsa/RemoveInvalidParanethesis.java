package org.example.dsa;

import java.util.*;

public class RemoveInvalidParanethesis {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
            if(s == null){
                return result;
            }
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);
        visited.add(s);
        boolean found = false;
        while( !queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ;i++){
                String curr = queue.poll();
                if(isValid(curr)){
                    result.add(curr);
                    found =true;

                }

            if(found)
                continue;
            for(int j = 0; j < curr.length(); j++){
                if(curr.charAt(j) != '(' && curr.charAt(j) != ')')
                    continue;
                String child = curr.substring(0,j)+curr.substring(j+1);
                if(!visited.contains(child)){
                    visited.add(child);
                    queue.offer(child);
                }
            }
            if(found)
                break;

            }
        }
        return result;

    }
    public boolean isValid(String curr) {
        int count = 0;
        char array[] = curr.toCharArray();
        for (char ch :array){
            if (ch == '('){
                count++;
            }
            if(ch == ')'){
                count --;
            }
            if(count < 0){
                return false;
            }

        }
        return count == 0;

    }

    public static void main(String[] args) {
        String[] tests = { "()())()", "(a)())()", ")(" , "", "()", "(((" };
        RemoveInvalidParanethesis removeInvalidParanethesis = new RemoveInvalidParanethesis();
        for(String string : tests) {
           List<String> result = removeInvalidParanethesis.removeInvalidParentheses(string);
            System.out.println("Input  : \t");
            System.out.println("Output : " + result);
            System.out.println();
        }

    }
}

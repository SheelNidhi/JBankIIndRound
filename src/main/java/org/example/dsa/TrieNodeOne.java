package org.example.dsa;

public class TrieNodeOne {
    TrieNodeOne [] children;
    boolean isEndofWorld;
    int count;
    public TrieNodeOne(){
        children = new TrieNodeOne[26];
        isEndofWorld =false;
        count = 0;
    }
}

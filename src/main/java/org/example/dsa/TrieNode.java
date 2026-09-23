package org.example.dsa;

import java.util.Arrays;

public class TrieNode {
    TrieNode [] nodes;
    int counnt;
    public TrieNode(TrieNode[] nodes, int count) {
        count =0;
        nodes = new TrieNode[26];
        Arrays.fill(nodes,null);
    }
    public void addNode(TrieNode trieNode, String str){
        char arr[] = str.toCharArray();
        for(int i = 0; i < arr.length ;i++){
            int index = arr[i] -'a';
            nodes[i]= new TrieNode(nodes,counnt++);
        }
    }
    public void traverse(TrieNode trie,String prefix){
        char prefixArr[] = prefix.toCharArray();
        for(int i = 0 ; i < prefixArr.length ;i++){
            int index = prefixArr[i] -'a';
            // so if there
            if(nodes[i] !=null){
                traverse(trie,prefix);
            }
        }
    }
}

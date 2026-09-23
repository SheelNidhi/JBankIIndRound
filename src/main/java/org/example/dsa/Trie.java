package org.example.dsa;

public class Trie {
    TrieNodeOne root;
    public Trie(){
        root = new TrieNodeOne();
    }
    public void insert(String word){
        TrieNodeOne node = root;
        for(char ch : word.toCharArray()){
            int ind = ch - 'a';
            if(node.children[ind] == null){
                node.children[ind] = new TrieNodeOne();
            }
            node = node.children[ind];
        }
        node.isEndofWorld = true;
    }
    public boolean search( String word){
        TrieNodeOne node = root;
        for(char ch : word.toCharArray()){
            int index = ch -'a';
            if(node.children[index] == null){
                return  false;
            }
            node = node.children[index];
        }
        return node.isEndofWorld;
    }
    public boolean startWith(String word){
        TrieNodeOne node = root;
        for(char ch :word.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
    public void printWithPrefix(String prefix){
        TrieNodeOne node = root;
        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null){
                return ;
            }
            node = node.children[index];

        }

    }
    private void traverse(TrieNodeOne node, String prefix) {
        if (node == null) return;

        // If end of word → print
        if (node.isEndofWorld) {
            System.out.println(prefix);
        }

        // Traverse all children
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char ch = (char) (i + 'a');
                traverse(node.children[i], prefix + ch);
            }
        }
    }
}

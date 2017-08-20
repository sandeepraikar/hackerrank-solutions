package ctci.solutions;


import java.util.HashMap;
import java.util.Scanner;

    class TrieNode {
    private HashMap<Character, TrieNode> children = new HashMap<>();
    public int size;

    public void putChildIfAbsent(char ch) {
        children.putIfAbsent(ch, new TrieNode());
    }

    public TrieNode getChild(char ch) {
        return children.get(ch);
    }
}

class Trie{
    
    public final TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    
    public void add(String word){
        TrieNode current = root;
        for(char c : word.toCharArray()){
            current.putChildIfAbsent(c);
            
            current = current.getChild(c);
            current.size++;
        }
    }
    
    public int find(String word){
        TrieNode current = root;
        for(char c : word.toCharArray()){
            current = current.getChild(c);
            if(current==null){
                return 0;
            }
        }
        return current.size;
    }
}
public class TrieContacts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie root = new Trie();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                root.add(contact);
            }else if(op.equals("find")){
                System.out.println(root.find(contact));
            }
        }
    }
}

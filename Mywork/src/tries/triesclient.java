package tries;

public class triesclient {
    public static void main(String[] args) {
        Tries trie = new Tries();
        trie.addWord("art");
        trie.addWord("arts");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("amit");
        trie.addWord("see");
        trie.addWord("sea");
        trie.addWord("seen");
        trie.display();
        System.out.println(trie.getNumOfWord());
        System.out.println(trie.search("art"));
        System.out.println(trie.search("amit"));
        System.out.println(trie.search("ar"));
        System.out.println(trie.search("man"));


    }
}

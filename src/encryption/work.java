package encryption;

public class work {
    public static void main(String[] args) {
        CaesarsCipher caesarsCipher = new CaesarsCipher("car","abcdefghijklmnopqrstuvwxyz ");
        String word = "i eat food";
        System.out.println(caesarsCipher.encode(word));
        word = caesarsCipher.encode(word);
        System.out.println(caesarsCipher.decode(word));
    }
}

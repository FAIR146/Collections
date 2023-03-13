package cipher;


public class Main {
    public static void main(String[] args) {
        CipherS cipherS = CipherS.builder()
                .keyWord("car")
                .originalAlphabet("abcdefghijklmnopqrstuvwxyz")
                .withReverse()
                .withRandomLetters()
                .withCases()
                .build();
        String word = "i eat food";
        System.out.println(cipherS.encode(word));
        word = cipherS.encode(word);
        System.out.println(cipherS.decode(word));

    }
}

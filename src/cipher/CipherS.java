package cipher;

import java.util.HashMap;

public class CipherS {
    private final String keyWord;
    private final String originalAlphabet;
    private String alphabet;
    private final HashMap<Character, Character> encoding = new HashMap<>();
    private final HashMap<Character, Character> decoding = new HashMap<>();
//    private final Random random = new Random(alphabet.length());
    private boolean withReverse;
    private boolean withRandomLetters;
    private boolean withCases;

    public CipherS(String keyWord, String originalAlphabet) {
        checkLettersFromWords(keyWord, originalAlphabet);
        this.keyWord = keyWord;
        this.originalAlphabet = originalAlphabet;
        this.alphabet = makeAlphabet(keyWord, originalAlphabet);
    }

    public String encode(String message) { // 5
        StringBuilder encodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            Character letter = encoding.get(message.charAt(i));
            if (letter == null) {
                throw new IllegalArgumentException("Буква " + message.charAt(i) + " не была найдена");
            } else {
                encodedMessage.append(letter);
            }
        }
        return encodedMessage.toString();
    }

    public String decode(String message) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            decodedMessage.append(decoding.get(message.charAt(i)));
        }
        return decodedMessage.toString();
    }

    private String makeAlphabet(String keyWord, String originalAlphabet) {
        StringBuilder alphabet = new StringBuilder();

        fillStringBuilderInStringBuilder(alphabet, keyWord);


        char lastLetter = alphabet.charAt(alphabet.length() - 1);
        alphabet.deleteCharAt(alphabet.length() - 1);
        alphabet.insert(0, lastLetter);

        return alphabet.toString();
    }

    public void applyAlphabetPlugin() {
        if (withReverse) {
            alphabet = reverse(alphabet);
        }

    }
    private void withCases (StringBuilder alphabet) {
        fillStringBuilderInStringBuilder(alphabet,originalAlphabet.toLowerCase());
        fillStringBuilderInStringBuilder(alphabet,originalAlphabet.toUpperCase());
        fillStringBuilderInString(originalAlphabet, toLowerCase(alphabet));

    }

//    private String randomLetters(String line) {
//        StringBuilder encodedMessage = new StringBuilder();
//        for (int i = 0; i < line.length(); i++) {
//            Character letter = encoding.get(line.charAt(i));
//            encodedMessage.append(letter);
//            encodedMessage.append(alphabet.charAt(random.nextInt()));
//        }
//        return encodedMessage.toString();
//    }

    private String reverse(String line) {
        return null;
    }

    private void checkLettersFromWords (String word1, String word2) {
        for (int i = 0; i < word1.length(); i++) {
            if (word2.indexOf(word1.charAt(i)) == -1) {
                throw new IllegalArgumentException("Не все буквы из " + word1 +  " слова были найдены в " + word2);
            }
        }
    }

    private void fillStringBuilderInStringBuilder (StringBuilder alphabet, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (alphabet.indexOf(String.valueOf((word.charAt(i)))) == -1) {
                alphabet.append(word.charAt(i));
            }
        }
    }
    private void fillStringBuilderInString (String alphabet, StringBuilder word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(String.valueOf((alphabet.charAt(i)))) == -1) {
                word.append(alphabet.charAt(i));
            }
        }
    }

    public void fillMaps () {
        for (int i = 0; i < originalAlphabet.length(); i++) {
            encoding.put(originalAlphabet.charAt(i), alphabet.charAt(i));
            decoding.put(alphabet.charAt(i), originalAlphabet.charAt(i));
        }
    }
    public static StringBuilder toLowerCase (StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isUpperCase(builder.charAt(i))) {
                builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
            }
        }
        return builder;
    }

    public static CipherBuilder builder() {
        return new CipherBuilder();
    }

    public void setWithReverse(boolean withReverse) {
        this.withReverse = withReverse;
    }
    public void setWithCases (boolean withCases) {
        this.withCases = withCases;
    }
    public void setWithRandomLetters (boolean withRandomLetters) {
        this.withRandomLetters = withRandomLetters;
    }

}


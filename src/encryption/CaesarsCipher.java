package encryption;

import java.util.HashMap;

public class CaesarsCipher {
    private final String keyWord;
    private final String originalAlphabet;
    private final String alphabet;
    private final HashMap<Character,Character> encoding = new HashMap<>();
    private final HashMap<Character,Character> decoding = new HashMap<>();

    public CaesarsCipher (String keyWord, String originalAlphabet) {
        this.keyWord = keyWord;
        this.originalAlphabet = originalAlphabet;
        this.alphabet = makeAlphabet(keyWord, originalAlphabet);
        fillMaps();
    }


    public String encode (String message) {
        StringBuilder encodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            encodedMessage.append(encoding.get(message.charAt(i)));
        }
        return encodedMessage.toString();
    }
    public String decode (String message) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            decodedMessage.append(decoding.get(message.charAt(i)));
        }
        return decodedMessage.toString();
    }


    private String makeAlphabet (String keyWord ,String originalAlphabet) {
        StringBuilder alphabet = new StringBuilder();

        for (int i = 0; i < keyWord.length(); i++) {
            if (alphabet.indexOf(String.valueOf(keyWord.charAt(i))) == -1) {
                alphabet.append(keyWord.charAt(i));
            }
        }

        for (int j = 0; j < originalAlphabet.length(); j++) {
            if (alphabet.indexOf(String.valueOf(originalAlphabet.charAt(j))) == -1) {
                alphabet.append(originalAlphabet.charAt(j));
            }
        }
        char lastLetter = alphabet.charAt(alphabet.length() - 1);
        alphabet.deleteCharAt(alphabet.length() - 1);
        alphabet.insert(0,lastLetter);

        return alphabet.toString();
    }

    private void fillMaps () {
        for (int i = 0; i < originalAlphabet.length(); i++) {
            encoding.put(originalAlphabet.charAt(i), alphabet.charAt(i));
            decoding.put(alphabet.charAt(i), originalAlphabet.charAt(i));
        }
    }

}

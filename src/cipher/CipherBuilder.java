package cipher;

public class CipherBuilder {
        private String keyWord;
        private String originalAlphabet;
        private boolean withReverse;
        private boolean withRandomLetters;
        private boolean withCases;

        public CipherBuilder keyWord(String keyWord) {
            this.keyWord = keyWord;
            return this;
        }

        public CipherBuilder originalAlphabet(String originalAlphabet) {
            this.originalAlphabet = originalAlphabet;
            return this;
        }

        public CipherBuilder withReverse() {
            this.withReverse = true;
            return this;
        }
        public CipherBuilder withRandomLetters () {
            this.withRandomLetters = true;
            return this;
        }
        public CipherBuilder withCases () {
            this.withCases = true;
            return this;
        }

        public CipherS build() {
            if (keyWord == null) {
                throw new RuntimeException();
            }

            CipherS cipherS = new CipherS(keyWord, originalAlphabet);
            cipherS.setWithRandomLetters(withRandomLetters);
            cipherS.setWithReverse(withReverse);
            cipherS.setWithCases(withCases);
            cipherS.applyAlphabetPlugin();
            cipherS.fillMaps();

            return cipherS;
        }
}


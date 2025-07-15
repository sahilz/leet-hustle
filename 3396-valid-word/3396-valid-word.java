class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vowel = 0;
        int consonant = 0;
        for(char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if(Character.isLetter(c)) {
                char low = Character.toLowerCase(c);
                if(low == 'a' || low == 'e' || low == 'i' || low == 'o' || low == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        return vowel > 0 && consonant > 0;
    }
}
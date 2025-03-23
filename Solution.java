
public class Solution {

    private static final int NOT_FOUND = -1;
    private static final char SPECIAL_CHAR = '*';

    public boolean hasMatch(String input, String pattern) {
        int indexSpecialChar = pattern.indexOf(SPECIAL_CHAR);
        int indexFirstPart = input.indexOf(pattern.substring(0, indexSpecialChar));
        if (indexFirstPart == NOT_FOUND) {
            return false;
        }
        int indexSecondPart = input.substring(indexFirstPart + indexSpecialChar)
                                   .indexOf(pattern.substring(indexSpecialChar + 1));
        
        return indexSecondPart != NOT_FOUND;
    }
}

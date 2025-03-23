
class Solution {

    private companion object {
        const val NOT_FOUND = -1
        const val SPECIAL_CHAR = '*'
    }

    fun hasMatch(input: String, pattern: String): Boolean {
        val indexSpecialChar = pattern.indexOf(SPECIAL_CHAR)
        val indexFirstPart = input.indexOf(pattern.substring(0, indexSpecialChar))
        if (indexFirstPart == NOT_FOUND) {
            return false
        }
        val indexSecondPart = input.substring(indexFirstPart + indexSpecialChar)
                                   .indexOf(pattern.substring(indexSpecialChar + 1));

        return indexSecondPart != NOT_FOUND
    }
}

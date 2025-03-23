
using System;

public class Solution
{
    private static readonly int NOT_FOUND = -1;
    private static readonly char SPECIAL_CHAR = '*';

    public bool HasMatch(string input, string pattern)
    {
        int indexSpecialChar = pattern.IndexOf(SPECIAL_CHAR);
        int indexFirstPart = input.IndexOf(pattern.Substring(0, indexSpecialChar));
        if (indexFirstPart == NOT_FOUND)
        {
            return false;
        }
        int indexSecondPart = input.Substring(indexFirstPart + indexSpecialChar)
                                   .IndexOf(pattern.Substring(indexSpecialChar + 1));

        return indexSecondPart != NOT_FOUND;
    }
}

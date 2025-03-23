
function hasMatch(input: string, pattern: string): boolean {
    const NOT_FOUND = -1;
    const SPECIAL_CHAR = '*';

    const indexSpecialChar = pattern.indexOf(SPECIAL_CHAR);
    const indexFirstPart = input.indexOf(pattern.substring(0, indexSpecialChar));
    if (indexFirstPart === NOT_FOUND) {
        return false;
    }
    const indexSecondPart = input.substring(indexFirstPart + indexSpecialChar)
                                 .indexOf(pattern.substring(indexSpecialChar + 1));
                                 
    return indexSecondPart !== NOT_FOUND;
};

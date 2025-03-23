
package main
import "strings"

const NOT_FOUND = -1
const SPECIAL_CHAR string = "*"

func hasMatch(input string, pattern string) bool {
    indexSpecialChar := strings.Index(pattern, SPECIAL_CHAR)
    indexFirstPart := strings.Index(input, pattern[0 : indexSpecialChar])
    if indexFirstPart == NOT_FOUND {
        return false
    }
    indexSecondPart := strings.Index(input[indexFirstPart + indexSpecialChar :], 
                               pattern[indexSpecialChar + 1 :])

    return indexSecondPart != NOT_FOUND
}

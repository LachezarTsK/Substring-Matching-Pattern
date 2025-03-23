
#include <string>
using namespace std;

class Solution {

    static const int NOT_FOUND = -1;
    static const int SPECIAL_CHAR = '*';

public:
    bool hasMatch(const string& input, const string& pattern) const {
        int indexSpecialChar = pattern.find(SPECIAL_CHAR);
        int indexFirstPart = input.find(pattern.substr(0, indexSpecialChar));
        if (indexFirstPart == NOT_FOUND) {
            return false;
        }
        int indexSecondPart = input.substr(indexFirstPart + indexSpecialChar)
                                   .find(pattern.substr(indexSpecialChar + 1));

        return indexSecondPart != NOT_FOUND;
    }
};

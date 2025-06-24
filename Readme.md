
#Problem: Remove Character After Special Symbols

You are given a string s consisting of lowercase English letters and special characters: '*', '#' and '$'.

Your task is to remove the immediate lowercase character that appears to the right of each special character (*, #, or $), if such a character exists.

Return the resulting string after all such deletions.

Input:

A string s containing characters from:
Lowercase English letters: a-z
Special characters: '*', '#', '$'
1 <= s.length <= 10^5
Output:

Return a modified string after removing all lowercase letters that are immediately after any of the special characters ('*', '#', '$').
Examples:

Example 1: Input: "a*b#cd$e" Output: "ad"

Example 2: Input: "sa* bd #cd$$ efg" Output: "sa d d g"

Example 3: Input: "abc" Output: "abc"

Example 4: Input :a* b $$$cde# a$ Output :a

Constraints:

space ' ' keep as it is .
Only remove lowercase characters immediately after special symbols.
If the special character is at the end of the string, ignore it.
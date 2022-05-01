Explanation of ++sFreq[ch - 'a'];
​
ch - 'a' : means that suppose if character present in a given string is 'e', here 'e' is the 5th character and to place the count of 'e' in the array, we need it's('e') position. The ASCII value of 'e' is 101 and 'a' is 97, so to acquire it's position in array we do 'e' - 'a' which is nothing but 101 - 97 and we get 4 as it's position(4 because of 0 indexed array).
​
++sFreq[ch - 'a']: means that after getting 'e' - 'a' i.e. 4 as it's position, we increment the value at 4th index i.e. after the very first occurence of 'e' in string, we increment it's value to 1 which was 0 earlier and if there is any other 'e' in the given string, the value will be incremented to 2. And in this way, the same happens for the remaining characters too.
​
https://leetcode.com/problems/valid-anagram/discuss/1440399/JAVA-%3A-Simple-or-Easy-or-Follow-Up-Solution-or-Efficient-or-Brief-Explanation
​
Two easy approaches: Sorting and Frequency array or Hashtable
​
​
​
​
​
​
​
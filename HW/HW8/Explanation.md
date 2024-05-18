1. This question is pretty straight forward where you first create an array with all 128 ASCII characters.
2. The idea is that you count the number of occurences each character has within the string and add it to this array.
3. After this then you want to check for each character, if it has occured an even number of times, then you want to directly add that to the number of total characters. 
4. After finding all of the even values then you want to add one odd number values as the extra 1 characters can be placed in the middle of the string and will still be considered a palindrome.
5. Finally you return this value.
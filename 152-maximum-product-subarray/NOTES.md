- This is very similar to maximum subarray question if it is only for positive numbers as the input
- We have to take care of two conditions:
- Zero
- Negative numbers
​
If it is a negative number, then swap the min and max.
2, -3, ....
for -3, min and max will be swapped. 2 * -3 -> -6 stored in min therefore when another negative number is encountered min and max will be swapped and max value will hold -6 * the other negative number will form a bigger max value.
​
# https://leetcode.com/problems/transpose-file/

awk '
{
    for (i = 1; i <= NF; i++) {
        if(NR == 1) {
            s[i] = $i;
        } else {
            s[i] = s[i] " " $i;
        }
    }
}
END {
    for (i = 1; s[i] != ""; i++) {
        print s[i];
    }
}' file.txt



#Explanation:
#
#NR: This AWK built-in variable represents the current line number being processed.
#NF: This AWK built-in variable represents the number of fields (words or columns) in the current line.
#Now, let's break down how the script processes the input file:
#
#First Line (NR == 1):
#The script initializes the s array with words from the first line.
#NF is 2 (number of fields in the first line).
#s[1] = "name" and s[2] = "age".
#Second Line (NR == 2):
#The script concatenates each word from the second line to the corresponding word in the s array.
#NF is 2 (number of fields in the second line).
#s[1] = "name alice" and s[2] = "age 21".
#Third Line (NR == 3):
#Similarly, the script concatenates each word from the third line to the corresponding word in the s array.
#NF is 2 (number of fields in the third line).
#s[1] = "name alice ryan" and s[2] = "age 21 30".
#End of Processing (END block):
#Finally, the script loops through the s array and prints each element, which represents a line of the transposed content.
#The output will be:
#Copy code
#name alice ryan
#age 21 30
#This output represents the transposed content of the original file.txt, where the rows have been converted into columns. Each line of output corresponds to a transposed row from the input file.
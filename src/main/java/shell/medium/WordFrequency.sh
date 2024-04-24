cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{print $2, $1}'

#cat words.txt: This command outputs the contents of the file words.txt.

#tr -s ' ' '\n': This command uses the tr (translate) command to replace spaces (' ') with newline characters ('\n').
# -s option squeezes multiple occurrences of the specified characters into a single occurrence.

#sort: This command sorts the words alphabetically. By default, sort sorts in ascending order.

#uniq -c: This command removes duplicate adjacent lines and counts the number of occurrences of each unique line.
# The -c option makes uniq prefix each output line with the count of occurrences.

#sort -r: This command sorts the output of uniq -c in reverse order (descending order).
# -r option is used for reverse sorting.

#awk '{print $2, $1}': This command uses awk to rearrange the columns.
# It prints the second column (the word) followed by the first column (the count).
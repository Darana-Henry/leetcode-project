#Solution #1
count=0
while read line; do
  let 'count = count + 1'
  if [ $count -eq 10 ]; then
    echo $line
    exit 0
  fi
done <file.txt

#Solution #2
awk "FNR == 10 {print}" file.txt

#Solution #3
sed -n 10p file.txt

#Solution #3
sed -n '10,10p' file.txt

#Solution #4
cat file.txt | sed -n '10p'
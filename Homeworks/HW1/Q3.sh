# input as "./Q3.sh < test1.txt"
clear

echo "Counting unique words..."
echo
cat $1 | tr " " "\n" | sort | uniq | wc -l

echo "Giving you back the prompt"
echo
~
~
~

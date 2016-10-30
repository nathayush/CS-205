clear

echo "Converting to upper case..."
echo
for f in * ; do mv -- "$f" "$(tr [:lower:] [:upper:] <<< "$f")"
done

echo "Giving you back the prompt"
echo
~
~
~

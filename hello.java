#! /bin/bash

echo 'enter color name'

read COLOR

if [ $COLOR == 'RED' ]
then
 echo "your favorite is red"
elif [ $COLOR == 'BLUE' ]
then
 echo "your favorite is blue"
elif [ $COLOR == 'YELLOW' ]
then
 echo "your favorite is yellow"
else
  echo "No Favorite color"
fi


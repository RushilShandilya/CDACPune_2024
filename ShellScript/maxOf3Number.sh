#!/bin/bash

number1=$1;
number2=$2;
number3=$3;

[ $number1 -eq $number2 ] || [ $number1 -eq $number3 ] || [ $number2 -eq $number3 ] && exit;
[ $number1 -gt $number2 ] && [ $number1 -gt $number3 ] && echo "Number 1 is greatest"
[ $number2 -gt $number3 ] && [ $number2 -gt $number1 ] && echo "Number 2 is greatest"
[ $number3 -gt $number1 ] && [ $number3 -gt $number2 ] && echo "Number 3 is greatest"

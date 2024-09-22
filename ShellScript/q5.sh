#!/bin/bash

echo "Enter weight of the member"
read weight

[ $weight -lt 0 ] && echo "Enter correct value" && exit
[ $weight -ge 30 ] && [ $weight -le 250 ] && echo "Welcome to the health club"
[ $weight -lt 30 ] || [ $weight -gt 250 ] && echo "Not eligible for membership" 

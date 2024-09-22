#!/bin/bash

value=$1
[ [ value%5 | bc ] -eq 0 ] && echo "It is divisible by 5"

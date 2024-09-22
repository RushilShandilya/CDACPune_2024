#!/bin/bash

timeOfDay=$(date +%H);
[ $timeOfDay -ge 0 ] && [ $timeOfDay -lt 12 ] && echo "Good Morning"
[ $timeOfDay -ge 12 ] && [ $timeOfDay -lt 16 ] && echo "Good Afternoon"
[ $timeOfDay -ge 16 ] && [ $timeOfDay -lt 19 ] && echo "Good Evening"
[ $timeOfDay -ge 19 ] && [ $timeOfDay -lt 24 ] && echo "Good Night"


#!/bin/bash

today=$(date +%u);
[ $today -ge 1 ] && [ $today -le 5 ] && echo "Working Day"
[ $today -ge 6 ] && [ $today -le 7 ] && echo "Off Day"

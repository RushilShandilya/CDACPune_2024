#!/bin/bash

[ -z $2 ] && echo $(file $1) || echo "More than one argument"

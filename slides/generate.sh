#!/bin/sh
pandoc -t revealjs -s --slide-level 2 -V theme=league -o talk.html talk.md

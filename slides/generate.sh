#!/bin/sh
pandoc -t revealjs -s --css theme-modifications.css -o talk.html talk.md

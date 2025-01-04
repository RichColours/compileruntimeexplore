#!/bin/bash


rm -f *.class

javac main.java thing.java

rm Thing.class

javac Thing2.java

java Main

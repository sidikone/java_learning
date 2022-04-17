#!/bin/bash

clear
cd src

javac *.java
rm ../bin/*
mv *.class ../bin/.

cd ../bin/
java Main
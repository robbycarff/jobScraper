
################################################################################
# Author: Robby Carff
# Date: September 27, 2019
# Use: builds the zillowAPI directory
################################################################################
JCC = javac

JFLAGS = -g

default: zillowAPI.class

zillowAPI.class: zillowAPI.java
	$(JCC) $(JFLAGS) zillowAPI.java

clean:
	$(RM) *.class

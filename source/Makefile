
################################################################################
# Author: Robby Carff
# Date: September 27, 2019
# Use: builds the zillowAPI directory
################################################################################
JCC = javac

JFLAGS = -g

default: zillowAPI.class glassDoorAPI.class driverProgram.class

zillowAPI.class: zillowAPI.java
	$(JCC) $(JFLAGS) zillowAPI.java

glassDoorAPI.class: glassDoorAPI.java
	$(JCC) $(JFLAGS) glassDoorAPI.java

driverProgram.class: driverProgram.java
	$(JCC) $(JFLAGS) driverProgram.java

clean:
	$(RM) *.class

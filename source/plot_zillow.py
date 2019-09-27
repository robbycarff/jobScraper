'''**************************************************************
Written by Robert Carff
Septemeber 26, 2019

Goal:
	Read in the saved XML file from the zillowAPI java file
	figure out how to parse and plot the data in a meaningfulway
***************************************************************'''
import sys
from xml.dom import minidom


'''**************************************************************
This will be called from the ZillowAPI.java file and have the
search parameters piped in. This is because the file is saved as
state_city_type_.txt
***************************************************************'''
print "This is the name of the script: ", sys.argv[0]
print "Number of arguments: ", len(sys.argv)
print "The arguments are: " , str(sys.argv)

#passing in the file name when this script is executed
#mydoc = minidom.parse(sys.argv[2])

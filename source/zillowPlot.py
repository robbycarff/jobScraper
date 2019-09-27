'''**************************************************************
Written by Robert Carff
Septemeber 26, 2019

Goal:
	Read in the saved XML file from the zillowAPI java file
	figure out how to parse and plot the data in a meaningfulway
***************************************************************'''
import sys
from xml.dom import minidom

import xml.etree.ElementTree as ET



'''**************************************************************
This will be called from the ZillowAPI.java file and have the
search parameters piped in. This is because the file is saved as
state_city_type_.txt
***************************************************************'''
print "This is the name of the script: ", sys.argv[0]
print "Number of arguments: ", len(sys.argv)
print "The arguments are: " , str(sys.argv)
#passing in the file name when this script is executed
#mydoc = minidom.parse(sys.argv[1])
#items = mydoc.getElementsByTagName('region')

testFile = "../data/wa_seattle_neighborhood.txt"
tree = ET.parse(testFile)
root = tree.getroot()

for child in root:
	print(child.tag, child.attrib)

# trying to iterate of all of the returned neighborhood roots and
# retreive the name and long/lat of the neighborhoods
for neighborhood in root.findall('neighborhood'):
	longitude = neighborhood.find('longitude').text
	latitude  = neighborhood.find('latitude').text
	name = neighborhood.get('name')
	print(name, latitude)



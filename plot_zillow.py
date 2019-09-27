'''**************************************************************
Written by Robert Carff
Septemeber 26, 2019

Goal:
	Read in the saved XML file from the zillowAPI java file
	figure out how to parse and plot the data in a meaningfulway
***************************************************************'''


from xml.dom import minidom



#this is going to be used 
mydoc = minidom.parse('items.xml')

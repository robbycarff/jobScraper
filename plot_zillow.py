'''**************************************************************
Written by Robert Carff
Septemeber 26, 2019

Goal:
	Read in the saved XML file from the zillowAPI java file
	figure out how to parse and plot the data in a meaningfulway
***************************************************************'''


from xml.dom import minidom



'''**************************************************************
This will be called from the ZillowAPI.java file and have the
search parameters piped in. This is because the file is saved as
state_city_type_.txt
***************************************************************'''
mydoc = minidom.parse('items.xml')

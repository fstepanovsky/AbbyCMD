# AbbyCMD
Command-line application for communication with AbbyyRest

# Use:
1. set IP address at `RSSoapService.wsdl` [here](https://github.com/jkremlacek/AbbyCMD/blob/master/src/main/resources/RSSoapService.wsdl#L997) and [here](https://github.com/jkremlacek/AbbyCMD/blob/master/src/main/resources/RSSoapService.wsdl#L1000) to IP where your AbbyRest is running
2. copy [RSSoapService.wsdl](https://github.com/jkremlacek/AbbyCMD/blob/master/src/main/resources/RSSoapService.wsdl) to `/usr/abby/` directory 

(for different directory change in [RSSoapService.java](https://github.com/jkremlacek/AbbyCMD/blob/master/src/main/java/com/abbyy/recognitionserver3_xml/recognitionserver3_xml/RSSoapService.java) lines 18, 30, 34 for directory you want to use.

3. run `java -jar abbycmd.jar -i imagepath -oO ocrtxtpath -oA ocraltopath`

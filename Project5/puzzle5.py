#!/usr/local/bin/python
 
# This program takes a text file full of words, and searches for those in a seperate "word search" file

wordList = [] 
notFoundList = [] 
rowList = [] 
columnList = []
foundWordList = []
 
 #Turns RowOrCol in to a string
def findWord(rowOrCol, inRow, number) :
    rowColString = ""
    rowColString = "".join(rowOrCol)
     #For loop traversing through words
    for word in wordList :
        if (word in rowColString) :
            # print(word + " " + rowColString)
            if (inRow == True) :
				#Adds word to foundlist for rows
                foundWordList.append(word + " row " + str(number))
            else : 
				#Adds word to foundlist for columns
				
				#Gets rid of word from notFoundList if a word is found
                foundWordList.append(word + " column " + str(number))
            notFoundList.remove(word)   
     
#print("\n")

 #getting text files
puzzleFile = open('puzzle.txt','r')
wordFile = open('wordList.txt','r')
 
#gets words in word file and adds to list
for line in wordFile :
    wordString = line.split()  
    wordList.append(wordString[0])
    notFoundList.append(wordString[0])         
 
#reads rows in puzzle file
for line in puzzleFile :
    rowList.append(line.split())
 
#reads columns in puzzle file
columnSize = len(rowList[0])
for i in range(columnSize) :
    columnList.append( [ row[i] for row in rowList] )
 
#setting index numbers for the rows for findWord
for index,row in enumerate(rowList) : 
    findWord(row,True,index)
 
#setting index numbers for the columns for findWord
for count, column in enumerate(columnList) :
    findWord(column,False,count)
 
#print found words
print("Words found : ")
for foundWord in foundWordList :
    print(foundWord)
 
#print not found words
print("Not found list : ") 
for notFoundWord in notFoundList :
    print(notFoundWord)

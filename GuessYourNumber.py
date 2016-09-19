import os
import sys
import time
import math


def GetMiddleNum(maxNum, minNum):
    totalNum = minNum + maxNum
    mid = math.floor(totalNum/2)
    
    return mid
def main():
    GuessNum = 0
    minNum = 1
    maxNum = 100000
    print('Guess a number between 1 to 100000')
    time.sleep(3)
    print('Got one, good lets begin!')
    time.sleep(1)
    while GuessNum <20:
        middleNum = GetMiddleNum(maxNum, minNum)
        print("Is your number greater than ",middleNum, "? (Y/N)")
        answer= input()
        if answer == 'y' or answer == 'Y':
            minNum = middleNum +1
        else:
            maxNum = middleNum
        GuessNum =GuessNum +1
        print( maxNum, minNum)
        minnum = maxNum - minNum
        print (minnum)
        if minnum == 1 or minnum == 0:
            answer = input("Is your number even (Y/N)")
            if ((answer =='y' or answer =='Y') and (maxNum%2 ==0)) or ((answer == 'n' or answer == 'N') and (maxNum%2 != 0)):
                print("Your number is ", maxNum)
            else:
                print("Your number is ",minNum)
            print("Number of questions used", GuessNum)
            GuessNum = 21

main()
        

 class GuessNumber
	def GetMiddleNum (max, min)
		totalNum = min + max
		mid = totalNum/2
		return mid
	end
	
	def main()
		guessNum = 0
		minNum = 1
		maxNum = 100000
		puts "Guess a number between 1 to 100000"
		answer = ""
		sleep(3)
		puts "Got one, good lets begin!"
		sleep(1)
		while guessNum < 20 do
			middleNum = GetMiddleNum(maxNum, minNum)
			puts "Is your number greater than #{middleNum}? (Y/N)"
			answer = gets.chomp
			if ("y".casecmp answer) == 0
				minNum = middleNum +1
			end
			if ("n".casecmp answer) == 0
				maxNum =middleNum
			end
			if maxNum - minNum < 2
				puts "Is your number even (Y/N)?"
				answer = gets
				flag = 1
				if ("y".casecmp(answer))== 0
					if maxNum%2 == 0
						puts "Your number is #{maxNum}"
						flag = 2
					end
				end
				if flag == 1
					puts "Your number is #{minNum}"
				end
				guessNum = 21
			end
			guessNum+=1
			
		end
	end
end
run = GuessNumber.new
run.main()
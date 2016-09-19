
import java.util.*;
import java.io.*;
public class GuessYourNumberIn20QuestionsOrLess {
 public static void main(String[] args) {
 int GuessNum = 0;
 int minNum =1;
 int maxNum = 100000;
 Scanner input = new Scanner(System.in);
 String Answer = null;
 System.out.println("Guess a number between 1 to 100000");
 System.out.println();
 try{
   Thread.sleep(3000);
 }
 catch(InterruptedException e){
 }
 System.out.println("Got one, good lets begin!");
 try{
   Thread.sleep(1000);
 }
 catch(InterruptedException e){
 }

 System.out.println();
 while(GuessNum <20){
   int middleNum = GetMiddleNum(minNum, maxNum);
   System.out.println("Is your number greater than " + middleNum + "? (Y/N)");
   System.out.println();
 try{
   Thread.sleep(1000);
 }
 catch(InterruptedException e){
 }
   Answer = input.next();
   if(Answer.equals("Y")||(Answer.equals("y"))){
      minNum = middleNum +1;
   }
   else{
      maxNum=middleNum;
   }
   GuessNum++;
   if(((maxNum-minNum)== 1) || ((maxNum - minNum) == 0)){
      System.out.println("Is your number even (Y/N)?");
      System.out.println();
      Answer = input.next();
      if((((Answer.equals("Y"))||(Answer.equals("y"))) && maxNum%2 == 0)||(((Answer.equals("N"))||(Answer.equals("n"))) && maxNum%2 != 0)){
         System.out.println("Your number is "+ maxNum );
      }
      else{
         System.out.println("Your number is " + minNum);
         System.out.println();
      }
      System.out.println("Number of guess used " +GuessNum);
      GuessNum = 21;
   }
   }

 }
 public static int GetMiddleNum(int minNum, int maxNum){
   int totalNum = minNum + maxNum;
   int mid = totalNum/2;
   return mid;
 }
 }
 
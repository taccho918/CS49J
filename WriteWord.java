import java.io.*;
import java.util.*;

public class WriteWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		Scanner in = new Scanner(file);
		
		int maxStrLen = 0; //the number of maximum of string length
		int middleNum = 0; //the half number of length of string
		String middleChar = ""; //the middle character of longetst string
		String longestStr = ""; //longest string
		String str = "";

		/*
		** load the input.txt
		** count the length of any single lines without counting the spaces
		** store the longest line in a String object 
		*/
		while(in.hasNextLine()){
			str = in.nextLine();
			//test: System.out.println(str);

			str = str.replace(" ", "");
			//test: System.out.println(str); 
			//test: System.out.println(str.length());

			if (str.length() > maxStrLen){
				maxStrLen = str.length();
				System.out.println("Longest string line: " + str);
				//test: System.out.println("Length: " + maxStrLen);
				longestStr = str;
			}
		}

		/*
		** Select the middle character in longest string
		*/
		if (maxStrLen % 2 == 0){  //maxStrLen: even number
			middleNum = maxStrLen / 2;
			middleChar = longestStr.substring(middleNum - 1, middleNum);
			System.out.println("Middle letter: " + middleChar);
		}
		else if (maxStrLen % 2 == 1){ //maxStrLen: odd number
			 middleNum = maxStrLen / 2;
			 middleChar = longestStr.substring(middleNum, middleNum + 1);
			 System.out.println("Middle letter: " + middleChar);
		}
		else {
		}

		/*
		** prompt the user 
		*/
		System.out.println("Write a word that starts for: " + middleChar);
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//test: System.out.println(word);

		char[] wordArray = word.toCharArray();
		
		if (wordArray[0] == middleChar.charAt(0) || wordArray[0] == Character.toUpperCase(middleChar.charAt(0))) {
			System.out.println("You are amazing!");
		}
		else {
			System.out.println("Sorry, this word doesn't stand for " + middleChar.charAt(0));
		}				
	}
}


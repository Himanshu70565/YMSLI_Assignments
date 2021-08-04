package work.practice.q6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 Exercise 3: Write a Java program that displays the number of characters, lines and words in a text?
*/
public class CountCharacterAndLines {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI_Assignments\\04-08-2021\\src\\work\\practice\\q6\\q6.txt";
		File file = new File(filePath);

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(file));) {

			String str = "";
			while ((str = in.readLine()) != null) {
				String words[] = str.split(" ");
				wordCount += words.length;
				for (String word : words) {
					charCount+=word.length();
				}
				lineCount++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("Line count: "+lineCount);
		System.out.println("Word count: "+wordCount);
		System.out.println("Char count: "+charCount);
		
	}
}

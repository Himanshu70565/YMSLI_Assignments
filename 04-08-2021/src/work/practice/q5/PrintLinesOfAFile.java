package work.practice.q5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Exercise 2: Write a Java program that reads a file and displays the file on the screen, 
with a line number before each line?
*/

public class PrintLinesOfAFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI_Assignments\\04-08-2021\\src\\work\\practice\\q5\\q5.txt";
		File file = new File(filePath);

		System.out.println("------------Using Scanner----------");
		int lineNumber = 0;
		try (Scanner sc = new Scanner(file);) {

			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println("[ " + lineNumber + " ]   " + str);
				lineNumber++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lineNumber=0;
		System.out.println("\n--------Using BufferedReader----------");
		try (BufferedReader in = new BufferedReader(new FileReader(file));) {
			String str="";
			while((str=in.readLine())!=null) {
				System.out.println("[ " + lineNumber + " ]   "+str);
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}

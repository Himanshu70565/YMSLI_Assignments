package work.practice.q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Exercise 1: Write a Java program that reads a line of integers and then displays each integer and 
the sum of all integers. (Use StringTokenizer class)?
*/
public class SumOfAllIntegers {
	public static void main(String[] args) {
		
		String filePath="C:\\Users\\ve00ym259\\Desktop\\YMSLI_Assignments\\04-08-2021\\src\\work\\practice\\q4\\q4.txt";
		File file=new File(filePath);
		
		//Writing into the file
		try(BufferedWriter out=new BufferedWriter(new FileWriter(file));){
			String str1="1 2 3 4 5 6 7 8 9 \n";
			String str2="10 11 12 13 14 15";
			out.write(str1);
			out.write(str2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int sum=0;
		try (BufferedReader in=new BufferedReader(new FileReader(file))){
			String str="";
			while((str=in.readLine())!=null) {
				String numbersArray[]=str.split(" ");
				for(String number : numbersArray) {
					sum+=Integer.valueOf(number);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("The total sum of the numbers is :"+sum);
		
	}
}

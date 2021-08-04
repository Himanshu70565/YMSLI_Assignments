package work.practice.q7;

import java.io.File;
import java.util.Scanner;

/*
 *  Exercise 4: Write a Java program that reads on file name from the user,
 *  then displays information about whether the file exists, 
 *  whether the file is readable ,whether the file is writable, 
 *  the type of file and the length of the file in bytes?
 */
public class InfoAboutFile {
	public static void main(String[] args) {
		System.out.println("Enter file/folder name:");
		Scanner sc=new Scanner(System.in);
		String filename=sc.next();
		
		String filePath="C:\\Users\\ve00ym259\\Desktop\\YMSLI_Assignments\\04-08-2021\\src\\work\\practice\\q7\\"+filename;
		File file=new File(filePath);
		
		if(file.exists()) {
			
			if(file.isDirectory()) {
				System.out.println("Folder exists with name : "+filename);
			}else{
				System.out.println("File exists with name : "+filename);				
			}
			
			System.out.println("Readable : "+file.canRead());
			System.out.println("Writable : "+file.canWrite());
			System.out.println("Length : "+file.length());
			
		}else {
			System.out.println("No such file exist");
		}
		
		
	}
}

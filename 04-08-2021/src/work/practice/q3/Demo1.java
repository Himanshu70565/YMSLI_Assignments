package work.practice.q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class DVDInfo implements Comparable<DVDInfo>{
	private String title;
	private String genre;
	private String leadActor;

	DVDInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	public String toString() {
		return title + " " + genre + " " + leadActor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	@Override
	public int compareTo(DVDInfo o) {
		return title.compareTo(o.getTitle());
	}

}

public class Demo1 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI\\Collection Practice\\src\\com\\practice\\ArrayList\\q1\\dvdinfo.txt";
		File f = new File(filePath);

		List<DVDInfo> list = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(f));) {

			String str = "";

			while ((str = in.readLine()) != null) {
				String array[] = str.split(",");
				String bookInfo[] = array[0].split("/");
				list.add(new DVDInfo(bookInfo[0], bookInfo[1], bookInfo[2]));
				if (array.length == 2) {
					String author = array[1];
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("-------------Before Sorting-----------------");
		for(DVDInfo DVD:list) {
			System.out.println(DVD);
		}
		
		Collections.sort(list);
		System.out.println("--------------After Sorting----------------");
		for(DVDInfo DVD:list) {
			System.out.println(DVD);
		}
		
		
	}
}

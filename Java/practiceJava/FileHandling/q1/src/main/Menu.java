package src.main;

import java.util.Scanner;
import java.io.File;

public class Menu{
	private static String path = "/home/rushil/";
	public static void showMenu(){
		System.out.println("Print Directory of the given options below");
		System.out.println("1.Downloads");
		System.out.println("2.Documents");
	}
	public static void exploreDownloads(){
		String downloadPath = path+"Downloads";
		File downloadDirectory = new File(downloadPath);
		if(downloadDirectory.exists()){
			for(File file : downloadDirectory.listFiles()){
				if(file.getName().endsWith(".pdf"))
					System.out.println(file.getName());
			}
		}
	}
	public static void chooseOption(Scanner sc){
		System.out.println("Please pick your choice");
		int enterOption = sc.nextInt();
		switch(enterOption){
			case 1:{
				exploreDownloads();
				break;
			}
			case 2:{
				System.out.println("Coming soon");
				//exploreDocuments()
				break;
			}
		}
	}
}

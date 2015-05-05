import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class SearchingFiles {
	/**
	 * This is the simple program for searching files on computer.
	 * You just need to specify the path of the directory.This 
	 * program will list all the files in that directory. 
	 * 
	 * @Authon Siddiq
	 * @version 1.0
	 */

	public static void main(String[] args) {
		boolean flag=true;
		String fileName;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the path where you want to search the files");
		System.out.print("Path:");
		String path=in.nextLine();//this will store the path of the directory
		File directory=new File(path);
		String[] files=directory.list();//this will list all files and store in the String Array.
		System.out.println("Select an option \n1. List all files\n2. Search a file\n3. Exit");
		System.out.print("Option:");
		int userOption=in.nextInt();
		
		switch(userOption){
			case 1:
			
				System.out.println("______________________________________");
				for(String file:files){
					System.out.println(file);
				}
				System.out.println("_________________________________________");
				break;
			case 2:
				System.out.println("Enter the file name\n");
				System.out.print("File Name:");
				fileName=in.next();
				boolean searchResult=searchFile(files,fileName);
				System.out.println("File Found:"+searchResult+"\nFile Address:"+path);
				break;
			case 3:
				System.out.println("Thank You for using the service.");
			default:
				System.out.println("Wrong Option");
		}
		

	}
/**
 * This method will take the filename and will search through the list of files
 * 
 * @param list of files
 * @param file to be searched(fileName)
 * @return found (true/false)
 */
	private static boolean searchFile(String[] files, String fileName) {
		for(String file:files){
			if(file.equals(fileName)){
				return true;
			}
		}
		return false;
		
	}

}

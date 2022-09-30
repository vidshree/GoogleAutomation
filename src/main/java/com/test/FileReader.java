package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileReader {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
	File f=new File("C:\\Users\\Vidya\\OneDrive\\Desktop\\sample1.txt");
	Scanner scan=new Scanner(f);
	
	String fileContent="";
	while(scan.hasNextLine())
	{
		 fileContent=fileContent.concat(scan.nextLine() + "\n");
	}
	
//System.out.println(scan.nextLine());
	FileWriter writer=new FileWriter("C:\\Users\\Vidya\\OneDrive\\Desktop\\new.txt");
	writer.write(fileContent);
	writer.close();
	}
	}




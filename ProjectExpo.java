package com.project1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ProjectExpo {
	public static void main(String[] args) throws IOException {
		int menu;
		//int menu2;
		int operation;
		 Scanner sc = new Scanner(System.in);
		while(true)
		{
		 System.out.println("enter 1 to view in asc order,enter 2 for operations,enter 3 for exit");//
		menu=sc.nextInt();
		switch(menu)
		{
		case 1:
			 String path="C:\\ProjectExp\\";
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
					}
				break;
		case 2:
		 Scanner sc1 = new Scanner(System.in);
		 boolean b=true;
		while(b){
			System.out.println("enter 1 to add file,enter 2  to delete,enter 3 to search,enter 4 to go to menu");
			operation=sc1.nextInt();
			switch(operation)
		   {
		   case 1:
			   String path1="C:\\ProjectExp\\";
				Scanner sc2=new Scanner(System.in);

				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("enter the file name to create");
				String filename1=sc2.next();
				String finalname1=path1+filename1;
				System.out.println(finalname1);

				//create a file 

				File f1=new File(finalname1);
				boolean b1=f1.createNewFile();
				if(b!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename1);
					System.out.println("file created");
					break;
				}

				System.out.println("the collection of files is "+ al);
				}
		 			break;
		 		case 2:
		 			String path2="C:\\ProjectExp\\";
		 			Scanner s2=new Scanner(System.in);
		 			System.out.println("enter the file name to be deleted");
		 			String filname2=s2.next();
		 			String finalfile=path2+filname2;
		 			File file=new File(finalfile);
		 			file.delete();
		 			System.out.println("file deleted");
		 			break;
           case 3:
			   String path3="C:\\ProjectExp\\";
				File f2=new File(path3);
				Scanner s3=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname=s3.next();
				File filename3[]=f2.listFiles();
				int flag=0;
				for(File ff:filename3) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
					}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
			break;
		   
			case 4:
				b=false;//
				
		   }}break;
	      case 3:
			   System.exit(0);
			   break;
		}
		}
	}
}
	
		   
		
		

	

	


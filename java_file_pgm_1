/*Write  a java program to build a file with your class students details: Reg. No, Name, and email id*/

import java.util.*;
import java.io.*;
class StudentInfo{
	String name;
	int reg;
	String email;
	/** Constructs a Student object with the given values */
	StudentInfo(String name, int reg,String email)
	{
		this.name = name;
		this.reg = reg;
		this.email = email;
	}
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of Student : ");
		int n = s.nextInt(); 	//Input total number of student
		StudentInfo[] std = new StudentInfo[n]; 
		FileWriter outfile = null;   //Create files stream out
		try
		{
			outfile = new FileWriter("text.txt"); //Connect the outfile stream to the "text.txt"
			for(int i=0; i<n; i++)
			{	s.nextLine();
				System.out.println("Enter Student "+(i+1)+" Information : ");
				System.out.print("Name: ");
				String name = s.nextLine();
				System.out.print("Regg no. : ");
				int reg = s.nextInt();
				System.out.print("Email id : ");
				String email = s.next();
				std[i] = new StudentInfo(name,reg,email);
				//Write data to the stream
				outfile.write(std[i].reg+"\t");  
				outfile.write(std[i].name+"\t");
				outfile.write(std[i].email+"\r\n");
				System.out.println("File created successfuly !!");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred in this program !");
			e.printStackTrace();
		}
		finally
		{
			outfile.close();  //close the file
		}
	} //main
}  //class

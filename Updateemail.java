/* Write a java program to update students email id created with Previous pgm1 */
// this program is working but it is not appropiate program for the following quesction 
//because(actualy this program replace any string present in this program .

import java.io.*;
import java.util.*;
class Updateemail{
	void modifyFile(String path) throws IOException {
        File file = new File(path);         
        BufferedReader br = null; 
        FileWriter fw = null;
		String str = "";
        try{
            br = new BufferedReader(new FileReader(file));    
            String line = br.readLine();
             
            while (line != null) {
                str = str + line;
                line = br.readLine();
            }
            // Replacing old Email Id with new Email Id 
			//(actualy this program replace any string present in this program )
				Scanner s = new Scanner(System.in);
				//System.out.print("Enter the Reg no of the Student: ");
				System.out.println("Enter the Email Id. which you want to update : ");
				System.out.print("old Email Id. : ");
				String oldemail = s.next();  
				System.out.print("new Email Id. : ");
				String newemail = s.next();
				str = str.replaceAll(oldemail, newemail);
				fw = new FileWriter(file);
				fw.write(str);
        }
        catch (IOException e){
            e.printStackTrace();
        }
		finally{
                br.close(); 
                fw.close();
        }
    }
	public static void main(String[] args) throws IOException {
		Updateemail u = new Updateemail();
        u.modifyFile("text.txt");
        System.out.println("Email.Id Update Successfully !! ");
	}
}

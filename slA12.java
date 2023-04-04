import java.io.*;	
//Stephen LaFrankie
//1-25-18
/*
	Shows use of the .replace function	

	Program:
	FileWriter f creates "slA12" as a new object
	which is made appendable by the following
	boolean 'true'. PrintWriter will write the
	contents as text. String s' work "text" is
	then replaced by program, is printed, and
	the file is closed.
*/
public class slA12
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f = new FileWriter("slA12", true);
		PrintWriter n = new PrintWriter(f); //makes readable text of contents of 'f'
		String s = "dummy text output";//original string
		n.println(s);
		System.out.println(s);
		String s2 = s.replace("text","program"); //word text is swapped with program using 'string.replace'
		n.println(s2);
		System.out.println(s2); //new string file is printed
		f.close();	//file terminates

	}
}

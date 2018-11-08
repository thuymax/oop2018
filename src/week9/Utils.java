package week9;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Utils {
  public static String readContentFromFile(String path) {
		BufferedReader br= null;
		try {
			br= new BufferedReader(new FileReader(new File(path)));
			System.out.println("doc file");
			String textInAline;
			while((textInAline=br.readLine())!=null) {
				System.out.println(textInAline);
				textInAline=br.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static  String writeContentToFile(String path) {
		try {
			FileWriter pw = new FileWriter(new File(path));

            System.out.println("may muon ghi cai gi vao file:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            pw.write(data);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
		return null;
}
	public static String writeContentToTheEnd(String path) {
		try {
			FileWriter pE=new FileWriter(new File(path), true);
			System.out.println("ghi noi dung vao cuoi file");
			Scanner sc= new Scanner(System.in);
			String data= sc.nextLine();
			pE.write(data);
			pE.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static File findFileByName(String folderPath,String FileName) {
		String path= folderPath+"\\"+ FileName;
		File f1= new File(path);
		if(f1.exists()) return f1;
		else System.out.println("Not Found the File");
		return null;
	}
	public static void main(String[] args) {
		//writeContentToFile("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\MYdictionary2\\\\Anh-Viet.txt");
		//System.out.println(readContentFromFile("C:\\Users\\ADMIN\\eclipse-workspace\\MYdictionary2\\Anh-Viet.txt"));
		//writeContentToTheEnd("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\MYdictionary2\\\\Anh-Viet.txt");
		System.out.println(findFileByName("C:\\Users\\ADMIN\\eclipse-workspace\\Mydictionary2", "Anh-Viet.txt"));
	}

}

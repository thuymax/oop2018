package week10;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class task1 {
    public static List<String> getAllFunctions(File path){
        List<String> l = new ArrayList<String>();
        try {
          
        	BufferedReader b = new BufferedReader(new FileReader(path));
            String line;
            while ((line = b.readLine()) != null) {//duyet cac dong trong file
                line = line.trim();
                if(line.contains("static") ==  true)//tim nhung dong c static
                    l.add(line);//them
            }
            b.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }
    public static String findFunctionByName(String name){
        int dem = 0;
        try {
            FileInputStream f = new FileInputStream(new File("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\week9\\\\src\\\\week9\\\\Utils.java"));
            BufferedReader b = new BufferedReader(new InputStreamReader(f));
            String line;
            while ((line = b.readLine())!= null){
                line = line.trim();
                if(line.contains(name) ==  true) dem++;               
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(dem == 0) return null;
        else return name;
    }
    public static void main(String [] args) {
        List<String> ob = new ArrayList<String>();
        ob = task1.getAllFunctions(new File("C:\\Users\\ADMIN\\eclipse-workspace\\week9\\src\\week9\\Utils.java"));
        for (String s : ob){
            System.out.println(s);
        }
        String str = task1.findFunctionByName(" writeContentToFile");
        if(str == null) System.out.println("\nkhong tim thay ham "+ str + " trong file, xin loi chu nhan");
        else System.out.println("\ntoi da tim thay ham " + str + " trong file thua chu nhan");
    }
}

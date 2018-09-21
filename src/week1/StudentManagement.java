package week1;
import week1.Student;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
        static Student student[];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO
        if(s1.getGroup().equals(s2.getGroup())
            return true;
        else return false;
        //return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
        int n = student.length; 
    	String str = "";
    	int a[] = new int [100];
    	
    	for(int i = 0; i < a.length; i++) a[i] = 0;
    	for(int i = 0; i < n; i++) {
    		if(a[i] == 0) {
    			str = student[i].getGroup();
    			System.out.println("the class of student " + str + " is :");
    			for(int j = 0; j < n ; j++) {
                            if(a[j] == 0 && student[j].getGroup().equals(str)) {
    				a[j] = 1;
    				System.out.println( student[j].getName() + " ");
    				}
    			}
    		}
    	}
    }

    void removeStudent(String id) {
        // TODO:
        int location = 0;
    	  int n = student.length;
   	      while(location < n) {
   	    	  if(student[location].getId().equals(id)) {
   	    		  for(int i = location; i < n ; i++) {
   	    			  student[i] = student[i + 1];
   	    			  location = n;
   	    			  n--;
   	    		  }
   	    	  }
   	    	  else {
   	    		  location++;
   	    	  }
   	      }
    }

    public static void main(String[] args) {
  		Student thuy = new Student();
  		thuy.setName("Thuy");
  		thuy.setId("17021051");
  		thuy.setGroup("INT22041");
  		thuy.setEmail("trungthuy99x@gmail.com");
  		thuy.getInfo();
    	
  		// cehck constructor 1
  		Student thuy = new Student();
  		thuy.getInfo();
  		
    	/*check constructor 2 */
    	Student thuy = new Student("Thuy", "17021051", "phamtrungthuy99xx");
    	thuy.getInfo();
    	
    	/* check constructor 3 */
    	Student thuy = new Student();
    	Student copy = new Student(thuy);
    	copy.getInfo();
    	Student thuy = new Student("Thuy", "17021051", "phamtrungthuy", "INT22041");
    	Student thinh = new Student("Thinh", "17021045","nguyendinhthinh", "INT22041");
    	Student manh = new Student("Manh", "17029712", "nguyenducmanh", "INT22042");
    	boolean kiemTra = sameGroup(thuy,manh );
    	if(kiemTra == true) {
    		System.out.println("same group");
    	}
    	else {
    		System.out.println("not same group");}
    	
        student = new Student[100];
    	for(int i = 0; i < 3; i++) {
    		student[0] = thuy;
    		student[1] = thinh;
    		student[2] = manh;
    	}
    	for(int i = 0; i < 3; i++) {
    		student[i].getInfo();
        }
    	removeStudent("17029712");
    	for(int i = 0; i < student.length; i++) {
    		student[i].getInfo();
        }
    	studentsByGroup();
  	}
    
}

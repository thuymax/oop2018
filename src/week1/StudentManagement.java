package week1;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int size_of_students = 0;
    private int classSize = 0;
    private String[] classList = new String[100];
    
    
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        
        return s1.getGroup().equals(s2.getGroup()) ;
    }
    public void addStudent(Student a){
        if(size_of_students <= 100){
            students[size_of_students] = a;
            size_of_students ++;
        }
        else{
            System.out.println("FULL");
        }
        
    }
    
    

    void studentsByGroup() {
        for(int i= 0; i< size_of_students; i++){
            boolean check = true;
            for(int j=0; j < classSize; j++){
                if(students[i].getGroup().equals(classList[j])){
                    check = false;
                }
            }
            if(check){
                classList[classSize] = students[i].getGroup();
                classSize++ ;
            }
        }
        for(int i=0; i<classSize; i++){
            System.out.println("LỚP: " + classList[i]);
            for(int j=0; j < size_of_students ; j++){
                if(students[j].getGroup().equals(classList[i])){
                    System.out.println(students[j].getInfo());
                    System.out.println("----------");
                }
            }
            System.out.println("*********************************");
        }
        
        
    }

    void removeStudent(String id) {
        for(int i=0; i < size_of_students; i++){
            if(students[i].getId().equals(id)){
                for(int j = i; j < size_of_students ; j++){
                    students[j] = students[j+1];
                }
                size_of_students--;
                break;
            }
        }
    }
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO:
        Student a = new Student("NGuyen Dinh Thinh", "17021045", "thinhnguyenxc@gmail.com");
        Student b = new Student("Nguyen Van A", "17021046", "A@gmail.com");
        Student c = new Student("Nguyen Van B", "17021046", "B@gmail.com");
        c.setGroup("INT22042");
        StudentManagement test = new StudentManagement();
        if(test.sameGroup(a, b)) System.out.println("a va b cung lop");
        else System.out.println("a va b khac lop");
        StudentManagement temp = new StudentManagement();
        temp.addStudent(a);
        temp.addStudent(b);
        temp.addStudent(c);
        temp.studentsByGroup();
        
    }
    
}

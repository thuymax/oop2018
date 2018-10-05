
package week1;

public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các thuộc tính cho Student
    // TODO: khai báo các phương thức getter, setter cho Student
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT22045";
        this.email = "uet@vnu.edu.vn";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor 2
     *
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.group = "INT22045";
        this.email = em;
    }

   

    /**
     * Constructor 3
     *
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }

    String getInfo() {
        // TODO:
        return  this.name+" "+this.id+" "+this.group+" "+this.email;
    }
    public static void main( String arg[]) {
        Student Student = new Student("manh","00","nguyenducmanh2581912");
        System.out.println(Student .getInfo());
    }
}




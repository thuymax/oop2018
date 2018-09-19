package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
            private String name;
            private String id;
            private String group;
            private string email;
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name ="Student";
        this.id   ="000";
        this.group="INT22041";
        this.email="uet@vnu.edu.vn";
            
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

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }
    
    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name=name;
        this.id=id;
        this.email=email;
        this.group="INT22041";
        
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }
    Student(string name,String id,String group,String email){
        this.name=name;
        this.id=id;
        this.group=group;
        this.email=email;
    }
    String getInfo() {
        // TODO:
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
       // return null; // xóa dòng này sau khi cài đặt
    }
}

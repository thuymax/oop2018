package week2.task3;

public class Task3 {

    public static void main(String[] args){
        My a=new My();
        a.prinMy();
        System.out.println("=================");
        Mygirlfriend b=new Mygirlfriend(19,"xinh lắm luôn ý",true);
        b.pringirl();
        System.out.println("=================");
        hosocuoivo c=new hosocuoivo();
        c.prinlayvo();
    }
}
class My{
    private String name;
    private String group;
    private int age;
    //TODO: khai báo phương thức setter và getter cho lập trình viên
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public My(){
        // TODO: khởi tạo cho thuộc tính
        this.name="Phạm Trung Thủy";
        this.group="UET K62 CF";
        this.age=19;
    }
    public My(String name,String group, int age){
        this.name=name;
        this.group=group;
        this.age=age;
    }
    public void prinMy(){
        //TODO: In ra thông tin lập trình viên
        System.out.println("Tên: "+this.name+"\nNhóm: "+this.group+"\nTuổi: "+this.age);
    }
            
}
class Mygirlfriend{
    private int age;
    private boolean fa;
    private String mucdoxinh;
    //TODO: khai báo phương thức getter và setter cho cô gái

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFa() {
        return fa;
    }

    public void setFa(boolean fa) {
        this.fa = fa;
    }

    public String getMucdoxinh() {
        return mucdoxinh;
    }

    public void setMucdoxinh(String mucdoxinh) {
        this.mucdoxinh = mucdoxinh;
    }
    

    public Mygirlfriend(){
        //TODO: khởi tạo thông tin cho cô gái
        this.age=19;
        this.mucdoxinh="rat xinh";
        this.fa=false;
    }
    public Mygirlfriend(int age,String mucdoxinh,boolean fa){
        this.age=age;
        this.mucdoxinh=mucdoxinh;
        this.fa=fa;
    }
    public void pringirl(){
        //TODO: In ra màn hình thông tin cô gái
        System.out.println("my age girlfriend: "+this.age
                +" tuổi\nCô ấy xinh không: "+this.mucdoxinh+"\nCô gái này thuộc về tôi đúng không: "+this.fa);
    }
    
}
class hosocuoivo{
    private String name;
    private String phone;
    private String xe;
    private String nha;
    //TODO: khai báo phương thức getter và setter cho thí sinh

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public String getNha() {
        return nha;
    }

    public void setNha(String nha) {
        this.nha = nha;
    }
    
  
    public hosocuoivo(){
        //TODE: khởi tạo thông tin cho thí sinh
        this.name="Nguyễn Đức Mạnh";
        this.phone="iphone xsmax ban 512gb";
        this.xe="Ferrari ";
        this.nha="biet thu cao cap";
    }
    public hosocuoivo(String name,String phone , String xe,String cnha){
        this.name=name;
        this.phone=phone;
        this.xe=xe;
        this.nha=nha;
    }
    public void prinlayvo(){
        //TODO: In ra màn hình thông tin của thí sinh
        System.out.println("tên thí sinh: "+this.name+"\nĐiện thoại đang dùng: "+this.phone+
                "\nXe đang dùng:"+this.xe+"\nNhà: "+this.nha);
    }

}
 

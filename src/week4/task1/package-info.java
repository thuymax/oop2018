/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;

public class task1 {
    public static void main(String[] args) {
        
        Tao tao=new Tao("120k/kg","Viet Nam","10/10/1010",500);
        tao.print();
        Cam cam = new Cam("100k/kg", "singapore", "17/08/2018", 100);
        cam.print();
        CamThanhPhong cAm=new CamThanhPhong("120", "hanoi", "19/9/2018", 299);
        cAm.print();
        CamSanh caM= new CamSanh("1trieu/kg", "HCM", "10/11/2018", 200);
        caM.print();
    }
}
public class HoaQua {
    private String Gia;
    private String Nguongoc;
    private String Ngaynhap;
    private int Soluong;
    public HoaQua(){
        this.Gia="150k/kg";
        this.Nguongoc="CHina";
        this.Ngaynhap="10/10/2010";
        this.Soluong= 250;
    }
    public HoaQua(String Gia,String Nguongoc,String Ngaynhap,int Soluong){
        this.Gia=Gia;
        this.Nguongoc=Nguongoc;
        this.Ngaynhap=Ngaynhap;
        this.Soluong=Soluong;
    }
    public void print(){
        System.out.println("Gia/kg: " + Gia +"\nNguon goc: "+Nguongoc+"\nNgay: "+Ngaynhap+"\nSo luong: "+ Soluong);
        System.out.println("\n-----------------------");
    }
    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getNguongoc() {
        return Nguongoc;
    }

    public void setNguongoc(String Nguongoc) {
        this.Nguongoc = Nguongoc;
    }

    public String getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(String Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

}
public class Tao extends HoaQua{
    public Tao(){
        super();
    }
    public Tao(String Gia,String Nguongoc,String Ngaynhap,int Soluong){
        super(Gia, Nguongoc, Ngaynhap, Soluong);
    }
    @Override
    public void print(){
        System.out.println("    Táo    \n");
        super.print();
    }
    
}
public class Cam extends HoaQua{
    public Cam(){
        super();
    }
    public Cam(String Gia,String Nguongoc,String Ngaynhap,int Soluong){
        super(Gia, Nguongoc, Ngaynhap, Soluong);
    }
    @Override
    public void print(){
        System.out.println("    Cam    \n");
        super.print();
    }
    
}public class CamThanhPhong extends HoaQua {
    public CamThanhPhong(){
        super();
    }
    public CamThanhPhong(String Gia,String Nguongoc,String Ngaynhap,int Soluong){
        super(Gia, Nguongoc, Ngaynhap, Soluong);
    }
    @Override
    public void print(){
        System.out.println("    CamThanhPhong      \n");
        super.print();
    }
}public class CamSanh extends HoaQua{
    public CamSanh(){
        super();
    }
    public CamSanh(String Gia,String Nguongoc,String Ngaynhap,int Soluong){
        super(Gia, Nguongoc, Ngaynhap, Soluong);
    }
    @Override
    public void print(){
        System.out.println("    Camsanh      \n");
        super.print();
    }
}

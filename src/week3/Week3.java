package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(n>m) return n;
       else return m;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min) min=array[i];
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
       if(weight <= 0 || height <= 0) return null;
    	
    	double BMI;
    	BMI = weight/(height*height);
    	String ketqua = new String(); 
    	
    	if(BMI < 18.5) ketqua = "Thieu can";
    	else if(18.5 <= BMI && BMI < 23) ketqua = "Binh thuong";
    	else if(23 <= BMI && BMI < 25) ketqua = "Thua can";
    	else ketqua = "Beo phi";

    		
    	System.out.println(ketqua);
    	
    	return ketqua;
    }
}

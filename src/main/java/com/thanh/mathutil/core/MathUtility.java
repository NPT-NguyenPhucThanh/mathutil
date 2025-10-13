package com.thanh.mathutil.core;

public class MathUtility {
    //class này chứa các hàm tiện tích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó ko lưu lại kết quả xử lí của nó bên trong, vậy nó sẽ được thiết kế là static method!!!

    // hàm tính n!=1.2.3...n trong đó n phải > 0
    //quy ước 0!=1, 1!=1,...
    //20! vừa đủ kiểu long, 18 con số 0; 21! long chứa ko nổi
    // ko có âm giai thừa
    // giai thừa chỉ tính từ 0 đến 20, ngoài vùng này thì ko hợp lệ n!!!
    //0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    //0,20 -> boundary - biên giới của tập giá trị
    // ngoài vùng này gọi là invalid boundary!!!
    public static long getFactorial(int n) {
        if(n<0 || n>20){
            //ném ngoại lệ , kèm câu chửi, và dừng hàm ngay, ko có value nào đc trả về
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        // biến trung gian để tính phép nhân
        long result =1;
        for(int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }
}

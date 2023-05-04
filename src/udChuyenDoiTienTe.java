import java.util.Scanner;

public class udChuyenDoiTienTe {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn chuyển đổi:");
        USD = scanner.nextDouble();
        double quyDoi = USD * VND;
        System.out.println("Giá trị VND : " + quyDoi);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam ;
        System.out.println("Nhập vào số năm");
        nam = scanner.nextInt();
        boolean laNamNhuan = false;
        if (nam % 4 == 0){
            if (nam % 100 == 0){
                if (nam % 400 == 0){
                    laNamNhuan = true;
                }
            }else {
                laNamNhuan = true;
            }
        }
        if (laNamNhuan){
            System.out.println(nam + "Là năm nhuận" );
        }else {
            System.out.println(nam + "Không phải năm nhuận" );
        }
    }

}

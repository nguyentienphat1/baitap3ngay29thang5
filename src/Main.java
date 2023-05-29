import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int tong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong  phan tu");
        n= scanner.nextInt();
        int phantu[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap gia tri phan tu"+i);
            phantu[i]= scanner.nextInt();
            tong=tong+phantu[i];
        }
        System.out.println("tong cac phan tu :"+tong);
    }
}
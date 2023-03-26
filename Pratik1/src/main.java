import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //(Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
        //kuvvetlerini ekrana yazdıran programı yazıyoruz.)
        int n;
        Scanner deger =new Scanner(System.in);
        System.out.print("Sınır Sayıyı Giriniz: ");
        n=deger.nextInt();

        for (int i=1,j=1;i<=n && j<=n ;i*=4, j=5){
            System.out.println(i+"," + j);
        }
    }
}
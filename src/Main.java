import java.util.Scanner;

public class Main {
    static int asalSayi(int a,int b){
        if(b==1)
            return 1;
        else
            if(a%b==0)
                return 0;
            else
                return asalSayi(a,b-1);

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int sayi=inp.nextInt();
         if(asalSayi(sayi,(sayi/2))==1)
        System.out.print("Asal sayıdır.");
         else
        System.out.print("Asal sayı değil.");



    }
}
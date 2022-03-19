package java101;
import java.util.Arrays;
import java.util.Scanner;

public class Siralama {

    static void sirala(int [] arr, int indis){
        if(indis>0 && arr[indis]<arr[indis-1]){
            int temp=arr[indis-1];
            arr[indis-1]=arr[indis];
            arr[indis]=temp;
            sirala(arr, indis-1);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Eleman Sayısını giriniz : ");
        int diziboyutu=input.nextInt();

        int [] dizi=new int[diziboyutu];
        for (int i=0;i<diziboyutu;i++){
            System.out.printf("Dizinin %d. elemanını giriniz : ",i+1);
            dizi[i]=input.nextInt();
            sirala(dizi, i);
        }
        System.out.println("Sıralı Dizi : "+ Arrays.toString(dizi));
    }
}
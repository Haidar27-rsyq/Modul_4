package Tugas_4;
import java.util.Scanner;
public class No_7 {
public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i-1;
            while ((j >= 0)&&(A[j] > key)){
                A[j + 1] = A[j];
                j--;
            }
            A[j+1]=key;
        }
    }
    
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        No_1.tampil(A);
        No_1.insertionSort(A);
        No_1.tampil(A);
        Binarry(A);
    }
    public static void Binarry(int [] A) {
        int B[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("Manjingna data sing digoleti : ");
        int cari = input.nextInt();
        int ketemu = 0;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length-1;
        int point = 0;
        
        System.out.println("njerone Data B Adalah : ");
            for (int i = 0; i<B.length; i++){
                System.out.print(B[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir)/ 2;
            System.out.println("Indeks pointer : "+point);
                 if (cari == B [point]){
                     ketemu = 1;
                     System.out.println("Data "+
                     cari + " Telah ditemukan pada indeks ke "+ point);
                 }
                 else if (cari < B[point]){
                     System.out.println("Cari di kiri ");
                     IndeksAkhir = point-1;
                 }
                 else {
                     IndeksAwal = point+1;
                     System.out.println("Cari di kanan ");
                 }
        }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
        System.out.print("Muhammad Haidar Rasyiq");
    }
}
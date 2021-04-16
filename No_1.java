//Muhammad Haidar Rasyiq
package Tugas_4;
public class No_1 {
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
    System.out.print("Muhammad Haidar Rasyiq");
    }
}

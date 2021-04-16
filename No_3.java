package Tugas_4;
public class No_3 {
    public static void selectionSort(int[] A){
        int smallindex;
        int pass, j , n=A.length;
        int temp;
        
        for (pass = 0; pass<n-1; pass++){
            smallindex = pass;
            for (j = pass + 1; j<n; j++){
                if (A[j]<A[smallindex]){
                    smallindex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;           
        }
    }
    
    public static void tampil(int data[]){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        No_3.tampil(A);
        No_3.selectionSort(A);
        No_3.tampil(A);
    System.out.print("Muhammad Haidar Rasyiq");
    }
}
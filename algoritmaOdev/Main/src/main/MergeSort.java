package main;

public class MergeSort {

    void merge(int arr[], int l, int m, int r) {
        // Birleştirilecek iki alt dizinin boyutunu bulun
        int n1 = m - l + 1;
        int n2 = r - m;

       //Geçici diziler oluşturuyoruz
        int L[] = new int[n1];
        int R[] = new int[n2];

        //sağ(n1) ve sol(n2) olarak iki tane geçici arraye verileri atıyoruz
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

     //Geçici dizileri birleştirme işlemi
        
        int i = 0;//ilk subarrayin indexi
        int j = 0;// ikinci subarrayin indexi

        // Birleştirilmiş alt dizi dizisinin ilk dizini
        int k = l;//merge edilmiş subarrayın indexi
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // L[] öğesinin  öğelerini kopyalama
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //R[]'nin öğelerini kopyalama
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
           // orta noktayı bul
            int m = l + (r - l) / 2;

            // Birinci ve ikinci yarıyı sırala
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Sıralanan yarımları birleştir
            merge(arr, l, m, r);
        }
    }

    // n boyutunda bir diziyi yazdırma işlemi
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
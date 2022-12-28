package main;

import java.util.Scanner;
import static main.MergeSort.printArray;

public class Main {

    public static void main(String[] args) {
        //Bu bölümde kullanıcıdan dizimizin boyutunu ve bu boyuttaki diziyi oluşturacak dizi elamanlarımızı alıyoruz.
        Scanner sn = new Scanner(System.in);
        System.out.print("sıralamak istediğiniz dizinin boyutunu giriniz:");
        int arraySize = sn.nextInt(); 
         //Bu elamanları arr dizimizin içine atıyoruz
        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sn.nextInt();
        }
        //ve bu diziyi yazdırma işlemi yapıyoruz.
        System.out.println("kullanıcıdan aldığımız dizimiz:");
        printArray(arr);
        
        //merge sort ile sıralama işlemi
        System.out.println("merge sort ile sıralanmış hali");
        MergeSort ms = new MergeSort();//mergesort clasımızdan obje oluşturduk
        ms.sort(arr, 0, arr.length - 1);
        printArray(arr);//dizimizin merge sort ile sıralanmış halini bastırıyoruz

        //insertion sort ile sıralama işlemi
        System.out.println("************************");
        System.out.println("insertion sort ile sıralanmış hali:");
        InsertionSort ist = new InsertionSort();//ınsertionsort clasımızdan obje oluşturduk
        ist.sort(arr);//dizimizin insertion sort ile sıralanmış halini bastırıyoruz
        printArray(arr);
        
        //hazır olarak verilen 10 elemanlı dizi üzerinde yapılacak işlemler
        System.out.println("verilen 10 elemanlı dizinin insertion sort ve merge sort ile sıralanmış halleri");
        System.out.println("***********************");
        int arr1[] = {15, 20, 3, 56, 76, 34, 2, 13, 65, 89, 12, 126};
        int arr2[] = {15, 20, 3, 56, 76, 34, 2, 13, 65, 89, 12, 126};
        System.out.println("merge sort ile sıralanmış hali");
        MergeSort ms1 = new MergeSort();
        ms1.sort(arr1, 0, arr1.length - 1);
        printArray(arr1);

        System.out.println("insertion sort ile sıralanmış hali:");

        InsertionSort ist1 = new InsertionSort();
        ist1.sort(arr2);

        printArray(arr2);
    }
}

package sort;

import java.util.Scanner;

interface sortoperations{
    public void sortm1(int arr[]);
    public void sortm2(int arr[]);
    public void sortm3(int arr[]);
}
class mysort implements sortoperations{

    @Override
    public void sortm1(int[] arr) {
        int m;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    m = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = m;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public void sortm2(int[] arr) {
        int m;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    m=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=m;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

    }

    @Override
    public void sortm3(int[] arr) {
        int m;
        int flag;
        for (int i=0;i<arr.length-1;i++){
            flag=0;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    m=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=m;
                    flag=1;
                }
                if (flag ==0){
                    break;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

    }
}

public class Test {
    public static void main(String[] args) {
        int arr[]={34,56,7,45,3};
        System.out.println("by which method u want to sort the element");
        System.out.println("enter 1 for method 1");
        System.out.println("enter 2 for method 2");
        System.out.println("enter 3 for method 3");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        mysort obj =new mysort();
        if (a==1){
            obj.sortm1(arr);
        }
        else if(a==2){
            obj.sortm2(arr);
        }
        else if(a==3){
            obj.sortm3(arr);
        }

    }
}

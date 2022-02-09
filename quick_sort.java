//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 21
//==========================
import java.util.*;
public class quick_sort {
    static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high){
        if (low < high){
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Type in Array Length.");
        int Input = input.nextInt();
        int[] Given = new int[Input];
        for (int i = 0; i < Given.length; i++) {
            System.out.println("Please Type in Index["+i+"].");
            Given[i]=input.nextInt();
        }

        quickSort(Given, 0, n - 1);
        


        }
    }
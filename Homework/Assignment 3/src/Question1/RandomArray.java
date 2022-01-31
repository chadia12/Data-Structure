package Question1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
private int arr1[];
private static final int INITIAL_CAPACITY = 50;
private int size = 0;
private int capacity;
public  RandomArray(){
    capacity = INITIAL_CAPACITY;
    arr1 = new int[capacity];
}
public void insert(){
    Random rd = new Random();
    size = 50;
    for (int i = 0; i <size ; i++) {
        int number =rd.nextInt(100);
        arr1[i] = number;
    }

    System.out.println(Arrays.toString(arr1));
}
public void removeDuplicates(){
    int dup = arr1.length;
    for (int i = 0; i < dup; i++) {
        for (int j = i+1; j <dup ; j++) {
        if(arr1[i]== arr1[j]){
            arr1[j] =arr1[dup-1];
           dup--;
    }
        }
    }
    int [] temp= new int[dup];
    for (int i = 0; i < dup; i++) {
      temp[i] = arr1[i];
    }
    System.out.println(Arrays.toString(temp));
}
public void clear(){
    for (int i = 0; i <arr1.length ; i++) {
        arr1[i] = 0;

    }
    System.out.println(Arrays.toString(arr1));
}
public int size(){
return size;
}
public int get(int index){
    if(index < 0 || index >= size)
        throw new ArrayIndexOutOfBoundsException();
    return arr1[index];
}
public int[] subList(int start, int end){
    if(start < 0 || end >= size)
        throw new ArrayIndexOutOfBoundsException();
    int a=0;
    int [] arr2 = new int[end-1];
    for (int i = start; i <= end; i++) {
        arr2[a] = arr1[i];
        a++;
    }
    return arr2;
}
public int set(int index, int newValue){
    if(index < 0 || index >= size)
        throw new ArrayIndexOutOfBoundsException();
arr1[index] = newValue;
    return arr1[index];
}
}

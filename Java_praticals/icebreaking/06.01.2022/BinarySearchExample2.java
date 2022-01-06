import java.util.Arrays;  
class BinarySearchExample2{  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\06.01.2022>javac BinarySearchExample2.java

C:\java programs\Java_Praticals\icebreaking\06.01.2022>java BinarySearchExample2
Element is found at index: 2
*/
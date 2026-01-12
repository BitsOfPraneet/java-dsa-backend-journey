**Day 1 Tasks:-**



**Task A**



**Problem: Reverse an array in-place**

**---------------------------------------**

import java.util.Scanner;

class ReverseArray{

&nbsp;   static void reverse(int\[] array){

&nbsp;       int l=0,r=array.length-1,temp;

&nbsp;       while(l<r){

&nbsp;           temp=array\[l];

&nbsp;           array\[l]=array\[r];

&nbsp;           array\[r]=temp;

&nbsp;           l++;

&nbsp;           r--;

&nbsp;       }

&nbsp;   }

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner entry= new Scanner(System.in);

&nbsp;       System.out.print("Enter number of elements: ");

&nbsp;       int n=entry.nextInt();

&nbsp;       int\[] arr= new int\[n];

&nbsp;       System.out.println("Enter the elements ");

&nbsp;       for(int i=0;i<arr.length;i++){

&nbsp;           arr\[i]=entry.nextInt();

&nbsp;       }

&nbsp;       reverse(arr);

&nbsp;       System.out.println("The reversed array is:");

&nbsp;        for(int j=0;j<arr.length;j++){

&nbsp;          System.out.print(arr\[j]+" ");

&nbsp;       }

&nbsp;       entry.close();

&nbsp;       

&nbsp;   }

}

**-------------------------------------------**



**Task B**



1. **Array is stored in the heap.**
2. **Reference (address) to the memory location where array is stored in heap.**
3. **Because reference is passed.**



**---------------------------------------------**



**Task C**

**Problem chosen- Find the maximum element in an array**



1. **Approach- First i will create a method which takes the reference to the array. The method will have a local variable called Max which is equal to the 1st element of the array. Now, i will run a loop which compares 2nd element to the last element of the array. If any element is greater that element replaces value of Max. After the loop ends, the value of Max will be the maximum element in the array.**



**2. class MaxArray{**

    **static int MaxFinder(int\[] array){**

        **int max=array\[0];**

        **for(int i=1;i<array.length;i++){**

            **if(max<array\[i]) max=array\[i];**

        **}**

        **return max;**

    **}**

    **public static void main(String\[] args) {**

        **int\[] arr={1,2,3,4,5};**

        **System.out.println("The maximum element in the array is "+MaxFinder(arr)+".");**

    **}**

**}**



**3. Time Complexity = O(n)**

**Space complexity = O(1)**

**------------------------------------------------**



**Task D**



1. **My approach**
2. **coding....cause i remembered doing this a week ago.**
3. **Hmm.....how Java reference works.**

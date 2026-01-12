**Task A - Coding**



class SortedArray{

&nbsp;   static boolean isSorted(int\[] arr){

&nbsp;       for(int i=1;i<arr.length;i++){

&nbsp;           if(arr\[i-1]>arr\[i]) return false; //fixed my index bug here after checking when using i-1 , start from i=1

&nbsp;       }

&nbsp;       return true;

&nbsp;   }

&nbsp;   public static void main(String\[] args) {

&nbsp;       int\[] arr={2,9,67,456};

&nbsp;       System.out.println("Is the array sorted? "+isSorted(arr));

&nbsp;   }

}



**Task B - Reasoning**



1\. The loop invariant is that the condition - element at certain position is lesser than the element in next position.

Corrected Answer- The index of the elements are in non-decreasing order.

**2nd correction - At the start of iteration i, the subarray from index 0 to i-1 is already sorted in non-decreasing order.**





2\. I return false when element is greater than its successor. As it would break the ascending order. 





**Task C- Pattern Recognition**



In all three scenarios, we are linearly scanning the array, which means going through the elements one by one. // Addition: and updating state based on previous elements.

**Task D- Reflection**



1\. Honestly nothing , i felt in groove i remember this stuff.

2\. Yes i did feel.

3\. Not sure what to say , everything seems fine.



After checking- Today i was very hasty trying do things fast. Normally the bug which i should have caught while coding, i didn't even bother to run the program. I need to be careful more.


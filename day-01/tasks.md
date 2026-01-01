#### **Task A- Coding**



**Write a Java program that:**



1. **Takes an integer array**



**2. Reverses it in-place**



**3. Prints the reversed array**





###### **Solution**



**class TaskA{**

    **static int\[] reverse(int\[] arr){**

        **int l=0,r=arr.length-1,temp;**

        **while(l<r){**

            **temp=arr\[l];**

            **arr\[l]=arr\[r];**

            **arr\[r]=temp;**

            **l++;**

            **r--;**

        **}**

        **return arr;**

    **}**

    **public static void main(String\[] args) {**

        **int\[] arr={1,2,3,4,5,6,7};**

        **reverse(arr);**

        **for(int i=0;i<arr.length;i++){**

            **System.out.print(arr\[i]+" ");**

        **}**

    **}**

**}**



#### Task B- Reasoning



1. **Where is the array stored — stack or heap?**

2. **What exactly is passed to the reverse() method?**

3. **Why does changing the array inside the method change it outside?**



**Answers**



1. **The array is stored in heap.**
2. **An integer array.**
3. **Because in Java, the variables used for objects and structure have the reference to that particular thing. So, for example above when array object was passed into the reverse method its reference was passed referring to the stored structure in heap. Thats why it is changed, and no new structure is formed.**





#### **Task C - Problem Solving**



**Problem Selected : Find the maximum element**



1. **My Approach -  So, first declare an array and initialize the elements. Then create a integer variable called max and initialize it to the first element of the array i.e. arr\[0]. Then, loop through from second element of the array to the last element. In each loop, check that the element is greater than max or not, if yes update max to the value of the element, else continue. After the loop ends, value in max is the maximum element from the array.**



**2. Code**

**class TaskC {**

    **static int findMax(int\[] arr){**

        **int max=arr\[0];**

        **for(int i=1;i<arr.length;i++){**

            **if(arr\[i]>max) max=arr\[i];**

        **}**

        **return max;**

    **}**

    **public static void main(String\[] args) {**

        **int\[] arr={1,2,3,4,5};**

        **System.out.print("Maximum element of the array is: "+findMax(arr));**

    **}**    

**}**



**3. Time Complexity = O(n) and Space Complexity = O(1) \[CONFUSED HERE COZ I CREATED A LOCAL VARIABLE CALLED MAX]**



#### **Task D- Reflection**



1. **What confused me? - Honestly, nothing much.. i felt i was missing some core logic which i figured out myself then wrote the code. It's a process in thinking. I need to visualize my approach in a better.**
2. **What felt easy? I guess past week i have been writing code in Java plus earlier semester I had Java in curriculum , still i tend to forgot some basics when compiler show the error i debug it without external help.**
3. **One thing i understood better than before- Iteration of arrays in Java and how its passed as a reference because of that the original array changes if any modification done using method.**

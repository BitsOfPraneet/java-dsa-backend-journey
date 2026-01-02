Task A:-
Write a Java method: static boolean isSorted(int[] arr)
Return:
-true if array is sorted in non-decreasing order
-false otherwise

Code:
class SortArray{
    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,5,6,90};
        System.out.print(isSorted(numbers));
    }
}

Task B:-
1. What is the loop invariant in your solution?
I think the loop invariant is the if condition here, or is it the method itself isSorted.

2. At what exact condition do you return false early? :- If an array element is greater than its next element.

Task C:-
What is common between:
reversing an array
finding maximum
checking if sorted?

The common thing between all these is array traversal.

Task D:-
1. What required more thinking than Day 1? :- Identifying the loop invariant.
2. Did you feel tempted to code before planning? :- Yeah, it was pretty under control today though.
3. One thing you’ll improve tomorrow. - planning in more depth, still figuring out the edge cases or certain condition while typing the code.
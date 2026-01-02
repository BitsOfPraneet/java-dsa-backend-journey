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
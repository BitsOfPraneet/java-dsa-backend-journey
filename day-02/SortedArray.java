class SortedArray{
    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={2,9,67,456};
        System.out.println("Is the array sorted? "+isSorted(arr));
    }
}
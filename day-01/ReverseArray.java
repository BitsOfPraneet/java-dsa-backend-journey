class TaskA{
    static int[] reverse(int[] arr){
        int l=0,r=arr.length-1,temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
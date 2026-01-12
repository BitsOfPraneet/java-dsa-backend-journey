class MaxArray{
    static int MaxFinder(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]) max=array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("The maximum element in the array is "+MaxFinder(arr)+".");
    }
}
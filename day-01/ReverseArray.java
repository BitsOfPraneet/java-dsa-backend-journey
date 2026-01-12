import java.util.Scanner;
class ReverseArray{
    static void reverse(int[] array){
        int l=0,r=array.length-1,temp;
        while(l<r){
            temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=entry.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=entry.nextInt();
        }
        reverse(arr);
        System.out.println("The reversed array is:");
         for(int j=0;j<arr.length;j++){
           System.out.print(arr[j]+" ");
        }
        entry.close();
        
    }
}
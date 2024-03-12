import java.util.Scanner;
public class arrayW16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,44,5,666,70};

        System.out.println("the position of the element::");
        int pos=sc.nextInt();
         int   temp=arr[pos];
        for(int i=pos;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=arr[pos];
        System.out.println("array   ater deleitng are::");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}

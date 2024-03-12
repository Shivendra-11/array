import java.util.Scanner;
public class arrayW33 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println("enter the index::");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
    // firstr loop 
    for(int i=0;i<=n;i++){
        int temp=arr[0];
        for(int j=0;j<arr.length-1;j++){
             arr[j]=arr[j+1];
        }
        arr[arr.length-1]=temp;
    }
    System.out.println("array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }


    }
    
}

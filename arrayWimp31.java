import java.util.Scanner;
public class arrayWimp31 {
    public static void main(String[] args) {
        //impquestion

     int arr1[]={20,30,40,50,60,5};
     System.out.println("enter the key::");
     Scanner sc=new Scanner(System.in);
     int key=sc.nextInt();

      
       int low=1;
       int high=arr1.length-1;
       while(low<=high){
        int mid=(low+ high)/2;
        if(arr1[mid]==key)
            System.out.println(low);
        
        if(arr1[low]<=arr1[mid]){
            if( arr1[low]<=key && key<arr1[mid] ){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        else{
            if(arr1[mid]<=key&&key<=arr1[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }


       }


        
    }
    
}

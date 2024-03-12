import java.util.Scanner;
public class arrayW32 {
    public static void main(String[] args) {
  //rotated binary search pivot element

  Scanner sc=new Scanner(System.in);
  int key =sc.nextInt();
int a[]={20,30,40,50,10,5,7,9};
  int low=0;
  int high =a.length-1;

  while(low<=high){
    int mid=(low+high)/2;
    if(mid==key){
        System.out.println(a[mid]);
    }
    if(a[low]<=a[mid]){
        if(a[low]<key&& a[mid]>key){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    else{
        if(key>a[mid]&& a[high]>key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
  }
  




        
 
        
    }
    
}
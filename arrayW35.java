import java.util.Scanner;
public class arrayW35 {
    public static void main(String[] args) {
        int arr[]={5,3,10,9,6,13};
        Scanner sc=new Scanner(System.in);
        System.out.println("index no. of the element");
        
        int id=sc.nextInt();

        System.out.println("element is "+arr[id]);
        int temp=arr[id];
        int flag=0;
        System.out.println();
        for(int i=id;i<arr.length-1;i++){
            
            if(arr[i]>temp){
                System.out.println(arr[i]);
               
               flag++;
                break;

            }
            
        }
        if(flag==0){
            System.out.println("no element found::");
        }

    }
    
}

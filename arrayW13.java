import java.util.Scanner;
public class arrayW13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr2[]=new int[3];
         System.out.println("Elemnts of array without adition:: ");

        for(int i=0;i<arr2.length-1;i++){
            arr2[i]=sc.nextInt();
        }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the index no.:");
        // int id=sc.nextInt();
        System.out.println("enter the element::");
        int n=sc.nextInt();
       
        
        for(int i=0;i<1;i++){
            arr2[arr2.length-1-i]=arr2[arr2.length-2-i];
        }
        arr2[1]=n;
        System.out.println("After adding element:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }


    }
    
}

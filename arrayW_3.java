public class arrayW_3 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,55,66,55,55,66,2 };
        System.out.println("The duplicate element in the array is ::");
       
        
         
            for(int j=0;j<arr.length;j++){

                if(arr[j]==-1)
        continue;
            if(arr[j]==arr[j+1]){
                System.out.println(arr[j]);
                arr[j]=-1;
            }

        
        
    }
}
}

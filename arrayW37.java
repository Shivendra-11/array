public class arrayW37 {
    public static void main(String[] args) {
        int arr1[]={2,7,4,7,8,3,4,9,9};
        System.out.println("two repeating number is:");
        int p=0;
        int arr[]=new int[2];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==-1)
            continue;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr[p]=arr1[i];
                    arr1[j]=-1;
                    p++;
                    
                  
                    }
                    
                    

                }

            }
          
        }
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

    }
}
    


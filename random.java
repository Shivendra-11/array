public class random {
    public static void main(String[] args) {
        int arr1[]={0,1,3,4,5,6,7,9};

        int brr[]=new int[9];
        for(int i=0;i<arr1.length;i++)
        {  
            if(brr[arr1[i]]!=0){
                
            }
             brr[arr1[i]]=0;
            


        }

        for(int i=1;i<brr.length;i++){
            if(brr[i]==0){
                System.out.println(i);
            }
        }
        



    }
    
}

public class arrayW_8 {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,4,5,55,5};
        for(int i=0;i<arr.length;++i){
            int c=0;
            int x=arr[i];    
            if(x==-1) 
            continue;
            
            for(int j=0;j<arr.length;++j){
                if(arr[j]==x){
                    ++c;
                    arr[j]=-1;
                   
                }
            }
            
                System.out.println("The"+x+"is repeated "+c+"times");
            
        }
    }
    
}

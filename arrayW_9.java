public class arrayW_9 {
    public static void main(String[] args) {
        int arr[]={1,2,5,66,77,8};
        int max=arr[0];
        int min=arr[arr.length-1];
        
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                
            }
            System.out.println("the max element is::"+max);
            for(int j=0;j<arr.length;j++){
                if(arr[j]<max){
                    min=arr[j];
                }
            }
            System.out.println("the min element is::"+min);
        
    }
    
}

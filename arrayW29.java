public class arrayW29 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7,8};
        int c=0;
        int maj=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                   maj=arr[i];
                }
            }
        }
        if(c++>n/2){
            System.out.println(maj);
        }
        else{
            System.out.println("no maj element");
        }
    }
    
}

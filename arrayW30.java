public class arrayW30 {
    public static  int   occ(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;


    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,3,4,3,4};
        System.out.println("element occuring odd no. of times");
        System.out.println(occ());
        
    }
    
}

public class arraW34 {
    // for ceil
    public static  int ceil(int a[],int key){
        int low=0,high=a.length-1,mid=0;
        while(low<=high){  

             mid=(low+high)/2;
            if(key==a[mid]){
                return a[mid];
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
               low=mid+1;
            }

        }
        return a[low];

    }
    // for floor
    public static  int floor(int a[],int key){
        int low=0,high=a.length-1,mid=0;
        while(low<=high){  

             mid=(low+high)/2;
            if(key==a[mid]){
                return a[mid];
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
               low=mid+1;
            }

        }
        return a[high];

    }
    public static void main(String[] args) {
      int a[]={1,2,3,4,7,8};
      int key=5;
        System.out.println(  "ceil of the key is \n"+ ceil(a, key));
        System.out.println("floor of the key is \n"+floor(a, key));
        
       
    }
    
}

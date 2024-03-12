public class arrayW28 {
    public static void main(String[] args) {
    int arr1[]={1,2,3,4,6,7,8,9};
    int sum=500;
int p=0;
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr1[i]+arr1[j]==sum){
                System.out.println("sum of the elements ::");
                System.out.println(arr1[i]+" "+arr1[j]+" ");
                System.out.println("position is::"+i+" "+j+" ");
                p++;

            }
           
        }
    }
    if(p==0){
        System.out.println("no such pair is found ");
    }





    }
    
}

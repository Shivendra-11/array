public class arrayW36 {
 public static void main(String[] args) {
    int arr[]={2 , 7, 4, 7, 8, 3, 4};
    if(arr[i]==-1)
    continue;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                arr[j]=-1;
            }
        }
    }
 }   
}


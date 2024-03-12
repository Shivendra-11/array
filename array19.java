public class array19 {
    public static void main(String[] args) {
        int arr1[]={1,2,33,45,66,7};
        int arr2[]={2,33,4,66,7,8};
        int n =arr1.length;
        int arr3[]=new int[arr1.length];

        System.out.println("array after addition of element are::");
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        for(int j=0;j<n;j++){
            System.out.println(arr3[j]);
        }

    }
    
}

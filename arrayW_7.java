public class arrayW_7 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,3,55,66};
        int c=0;
        int n=arr1.length+arr2.length;
        int arr3[]=new int[arr1.length+arr2.length];
        System.out.println("merged array in sorted form:");
        for(int i=0;i<arr1.length;i++){
            arr3[c]=arr1[i];
            c++;

        }
        for(int j=0;j<arr2.length;j++){
            arr3[c]=arr2[j];
            c++;


        }
        for(int i=0;i<n;i++){
            System.out.println(arr3[i]);
        }
        System.out.println("array in sorted form");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp;
                    temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
         
    }
    for(int i=0;i<n;i++){
        System.out.println(arr3[i]);
    }
}
}

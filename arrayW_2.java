public class arrayW_2 {
    public static void main(String[] args) {
        int arr1[]={1,2,4,6,7};
        int arr2[]=new int[arr1.length];
        System.out.println("first array::");
        for(int i=0;i<arr1.length-1;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("reverse array::");
        for(int i=0;i<arr1.length-1;i++){
            arr2[i]=arr1[i];
        }
        for(int i=0;i<arr1.length-1;i++){
            System.out.println(arr2[i]);
        }

    }
    
}

public class arrayW_1 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        System.out.println("print original array");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);

        }
        System.out.println("print array in reverse");

        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);

        }
    }
    
}

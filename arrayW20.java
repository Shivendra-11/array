public class arrayW20 {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{2,4,5},{4,7,6}};
        int arr2[][]={{2,4,7},{5,6,6},{7,8,3}};
        int arr3[][]=new int[3][3];
        System.out.println("sum of the two matrices is ::");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr3[i][j]);
                System.out.print("");
            }
        }
    }
    
}

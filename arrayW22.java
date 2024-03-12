public class arrayW22 {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{2,4,5},{4,7,6}};
        int arr2[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=arr1[j][i];
            }
        }
        System.out.println("transpose matrix::");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr2[i][j]);
               
            }
             System.out.println();
        }

    }
    
}

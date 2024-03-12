public class arrayW23 {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{2,4,5},{4,7,6}};
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i+j==4 ){
                    sum+=arr1[i][j];
                }
            }
        }
       System.out.println("the sum of the diagonal element of the matrix is ::"+sum);

    }
    
}

public class arrayW26 {
    public static void main(String[] args) {
        // sparse matrix

  int c=0,p=0;
        int arr1[][]={  {0,0,4},{0,0,0},{0,7,6} };
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                if(arr1[i][j]==0){
                    c++;
                }
                else{
                    p++;
                }
            
        }
        if(c>p){
            System.out.println("sparse matrix:: "+"there are"+ " " +c+" "+"no. of zero in the given matrix:: ");

        }
        else{
            System.out.println("not a sparse matrix:");
        }
    }
    
}

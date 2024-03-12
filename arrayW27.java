public class arrayW27 {
    public static void main(String[] args) {
        int arr1[][]={ {1,5,0},{0,1,0},{0,0,1} };
         int c=0,p=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr1[i][j]==1&& i==j){
                    
                    c++;
                }
                else if(arr1[i][j]==0&&i!=j){
                    p++;
                }
            }
        }
          if(p++==6 && c++==3 ){
            System.out.println("identity matrix::");
          }
          else{
            System.out.println("not a identity matrix::");
          }

      


       




    }
    
}

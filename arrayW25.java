public class arrayW25 {
    public static void main(String[] args) {
    int arr1[][]={ {1,2,4} ,{2,3,7} ,{6,7,8}  ,{7,6,10}   };


    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i<j){
                arr1[i][j]=0;
            }
        }
    }
    System.out.println("zero in place of traingular matrix::");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.println(arr1[i][j]);
        }
    }
 }
    
}

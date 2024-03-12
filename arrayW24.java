import java.util.Scanner;
public class arrayW24 {
    public static void main(String[] args) {
        


        Scanner sc=new Scanner(System.in);
        int arrc[]=new int[3];
        int arrr[]=new int[3];
        int arr1[][]=new int[3][3];

        System.out.println("the 3-d matrix is:");
        // creating a 3d matrix::
   for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr1[i][j]=sc.nextInt();

        }
      }

    //   sum of row
    for(int i=0;i<3;i++){
        arrr[i]=0;
        for(int j=0;j<3;j++){
            arrr[i]+=arr1[i][j];
        }
    }
    // sump of coloumn
    for(int i=0;i<3;i++){
        arrc[i]=0;
        for(int j=0;j<3;j++){
            arrc[i]+=arr1[j][i];
        }
    }
// System.out.println("sum of the row of the 3d array is ::");
    for(int i=0;i<3;i++){
        System.out.println(arrr[i]);
        System.out.print(" ");
    }
    // System.out.println("sum of the coloumn of the 3d array is ::");
  for(int j=0;j<3;j++){
    System.out.println(arrc[j]);
    System.out.print(" ");
  }





    }
}

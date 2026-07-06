import java.util.Scanner;
public class arraysAnd2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int marks[]=new int[5];
//        marks[0]=56;
//        marks[1]=98;
//        marks[2]=56;
//        marks[3]=90;
//        marks[4]=90;
//        for(int i:marks){
//            System.out.println(i);
//        }

//        sum of the numbers of array
//        int sum=0;
//        int mark[]={45,78,23,45,67};
//        for(int i=0;i<mark.length;i++) {
//            System.out.println(mark[i]);
//            sum=sum+mark[i];
//        }
//        System.out.println("sum of the array is "+sum);

//        largest element of the array
//        int mark[]={15,25,6,99,70};
//        int large=mark[0];
//        for(int i=1;i<mark.length;i++){
//            if(mark[i]>large){
//                large=mark[i];
//
//        }
//            }
//        System.out.println("largest element of the array is "+large);

//        to print the number of odd no and even no
//        int countEven=0;
//        int countodd=0;
//        int a[]={1,2,3,4,5,6,7};
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                countEven++;
//            }
//            else
//                countodd++;
//        }
//        System.out.println("count of even numbers "+countEven);
//        System.out.println("count of odd numbers "+countodd);

//       reverse order
//        int array[]={1,2,3,4,5};
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

//        to take the size and values of the array from the user
//        System.out.println("enter the size of the array;");
//        int size=sc.nextInt();
//        int d[]=new int[size];
//        System.out.println("enter the "+size+" values");
//        for(int i=0;i<size;i++){
//            d[i]=sc.nextInt();
//        }
//        for(int i:d){
//            System.out.println(i);
//        }

//        2D Array
//        int[][] s = new int[2][3];
//
//        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {5, 8, 9}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//               System.out.print(arr[i][j]+" ");
//           }
//            System.out.println();
//        }

//      sum of elements in 2d array
//        int sum=0;
//        int arr[][] = {{1, 2, 3}, {2, 3, 4}, {5, 8, 9}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//                sum+=arr[i][j];
//            }
//            System.out.println();
//        }
//        System.out.println(sum);

//        reverse of a matrix
//        int rev[][] = {{1, 2, 3}, {2, 3, 4}, {5, 8, 9}};
//        for(int i = rev.length-1; i>=0; i--){
//            for(int j = rev.length-1; j>=0; j--){
//                System.out.print(rev[i][j]+" ");
//            }
//            System.out.println();
//        }

//        transpose of a matrix
//        int t[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int transpose[][]=new int[3][3];
//        for(int i=0;i<=t.length-1;i++){
//            for(int j=0;j<=t.length-1;j++){
//               transpose[j][i]=t[i][j];
//            }
//        }
//        for(int i=0;i<transpose.length;i++){
//            for(int j=0;j< transpose.length;j++){
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }

//        take the input from the user
        int[][] matrix =new int[2][3];
        System.out.println("enter the values for matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

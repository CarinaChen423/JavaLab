//TWO-DIMENSIONAL ARRAY 10X10
// On the diagonal of this table,please put the numbers from 0 to 9, and out of the diagonal number 0
//Calculate the sum of the diagonal numbers
//Fix
public class Lab5Task3_Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum=0;

        for (int i = 0; i < matrix.length; i++) {
            for(int x = 0;x<matrix.length; x++){
                if(i==x){
                    matrix[i][x]=i;
                    sum+=matrix[i][x];
                    System.out.println(matrix[i][x]+" ");
                }

            }

        }

        System.out.println("The sum of diagonal number is: "+sum);
    }
}

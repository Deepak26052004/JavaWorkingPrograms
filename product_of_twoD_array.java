public class product_of_twoD_array {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int b[][] = {
            {9, 8, 7},
            {6, 5, 4},
            {1, 2, 3}
        };
        int rowS=a.length;
        int colAs=a[0].length;
        int colBs=b[0].length;
        int res[][] = new int[rowS][colBs];
        for(int i=0;i<rowS;i++){
            for(int j=0;j<colBs;j++){
                res[i][j]=0;
                for(int k=0;k<colAs;k++){
                    res[i][j]+=a[i][k]*a[k][j];
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();

            }
        }
    }
}

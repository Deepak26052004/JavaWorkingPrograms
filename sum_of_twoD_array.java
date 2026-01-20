public class sum_of_twoD_array {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int b[][]={{9,8,7},
                   {6,5,4},
                   {1,2,3}};
        int res[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                res[i][j]=a[i][j]+b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

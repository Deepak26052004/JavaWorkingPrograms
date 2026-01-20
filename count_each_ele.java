public class count_each_ele {
    public static void main(String[] args) {
        int a[] ={2,3,1,3,2,4,6,7,9,2,19};
        for(int i=0;i<a.length;i++){
            int count=1;
            if(a[i]==-1) continue;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println(a[i]+":"+count);

        }
    }
}

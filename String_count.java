public class String_count {
    public static void main(String[] args) {
        String s="deepakrachin";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            int count=1;
            if(a[i]==' ') continue;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=' ';
                }
            }
            System.out.println(a[i]+":"+count);
        }

    }
}

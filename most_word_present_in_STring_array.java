public class most_word_present_in_STring_array {
    public static void main(String[] args) {
        String sentences[] = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };
        int max_count=0;
        for(int i=0;i<sentences.length;i++){
            int count=countElements(sentences[i]);
            max_count=Math.max(max_count, count);
        }
        System.out.println(max_count);
    }
    public static int countElements(String s){
        String []a=s.split(" ");
        return a.length;
    }
}

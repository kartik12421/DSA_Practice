public class replaceString {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        for (int i = 0; i < str.length()/2; i++) {
        int first = i;
        int last = str.length()-1-i;

        char firstChar = str.charAt(first);
        char lastChar = str.charAt(last);

        str.setCharAt(first, lastChar);
        str.setCharAt(last, firstChar);
            
        }

        System.out.println(str);
        
    }
}

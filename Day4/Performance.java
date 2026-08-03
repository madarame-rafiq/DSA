package Day4;

public class Performance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 26; ++i) {
            char ch = (char)('a' + i);
            str = str + ch;
        }
        System.out.println(str);

        //This is not effcient at all becuase with each iterations a new string object is created.
        //So that's why java provied us StringBuilder class it updates the value without creating a new object in heap.

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; ++i) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}

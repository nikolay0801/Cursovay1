public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        String[] words = str.split(" "); // оператор  Split разделили строку символами
        for (String word : words) {
            System.out.println(word);
        }
    }
}
package String;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // Add text
        sb.append(" Java");
        System.out.println(sb);

        // Insert text
        sb.insert(6, "World ");
        System.out.println(sb);

        // Change a character
        sb.setCharAt(0, 'h');
        System.out.println(sb);

        // Delete characters
        sb.delete(6, 12);
        System.out.println(sb);

        // Reverse
        sb.reverse();
        System.out.println(sb);
    }
}

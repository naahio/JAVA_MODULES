public class Program {
    public static void main(String[] args) {
        String n = "479598";
        int result = 0;
        for (int i = 0; i < n.length(); i++)
            result += .parseInt(n.charAt(i));
    System.out.println(result);
    }
}
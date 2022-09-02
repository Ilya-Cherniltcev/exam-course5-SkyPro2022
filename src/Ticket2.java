public class Ticket2 {
    public void isPalindrom() {
        String simple = "топот";
        int reverse = simple.length() - 1;
        boolean isPalindrom = true;
        for (int i = 0; i < simple.length(); i++){
            if (simple.charAt(i) != simple.charAt(reverse)) {
                isPalindrom = false;
                break;
            }
            reverse--;
        }
        System.out.println("The string is palindrom - " + isPalindrom);
    }
}

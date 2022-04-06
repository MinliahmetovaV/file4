public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int translation = 11560;
        int bonus;
        if (translation >= 1000) {
            bonus = translation / 100;
        } else {
            bonus = 0;
        }
        int balance = currentAccount + translation + bonus;
        System.out.println(balance);
    }

}

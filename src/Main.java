public class Main {
    public static void main(String[] args) {

        int x = 10, y = 15;
        String a = "";

        if (++x < 10  |++y > 15) {
            x++;
        }
        else {
            y++;

        }

        System.out.println(x);
        System.out.println(y);

    }
}
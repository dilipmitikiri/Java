package programs;

public class ArmsStrongNumber {
    public static void main(String[] args) {
        //ArmStrong numbers 0, 1, 153, 370, 371, 407.....
        int num = 371;
        int temp = num;
        int rev, sum = 0;               //Refactor code: ctrl+alt+L
        while (num > 0) {
            rev = num % 10;
            sum += rev * rev * rev;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(sum + " is an ArmsStrong number");
        } else {
            System.out.println("Not an ArmsStrong number ");
        }
    }
}

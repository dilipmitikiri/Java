package programs;

public class ReverseNum2 {
    public static void main(String[] args) {

        int num = 3456;
        //Using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        //Using StringBuilder class
        /*StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();*/
        System.out.println("Reverse number is: " + rev);


    }
}

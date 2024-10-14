package programs;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberAndString {
    public static void main(String[] args) {

        //Using commons apache lang3 jar file
        String rand_Num = RandomStringUtils.randomNumeric(6);
        System.out.println("Random number " + rand_Num);

        String rand_String = RandomStringUtils.randomAlphabetic(5);
        System.out.println("Random String " + rand_String);

    }
}

package au.edu.jcu.sp3406.guessinggame;

import java.util.Random;
class Game {
    static boolean check(int userNnm, int secretNum) {
        return secretNum == userNnm;
    }

    static int setSecretNum() {
        Random randomNum = new Random();
        return randomNum.nextInt(10);
    }
}

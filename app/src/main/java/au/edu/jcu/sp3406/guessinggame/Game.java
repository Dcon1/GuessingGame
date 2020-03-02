package au.edu.jcu.sp3406.guessinggame;
import android.widget.EditText;

import java.util.Random;
public class Game {
    public static boolean check(int num){
        Random random = new Random();
        int randNum = random.nextInt(10);
        if(randNum == num){
            return true;
        }
        else
            return false;
    }
}

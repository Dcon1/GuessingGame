package au.edu.jcu.sp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }
    public void checkGuess(View view){
        EditText userInput = findViewById(R.id.editText);
        String num = userInput.getText().toString();
        final Button button = findViewById(R.id.button);
        final int userNum = Integer.parseInt(num);
        final int ranNum = Game.setSecretNum();
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean result = Game.check(userNum, ranNum);
                        displayResult(result);
                    }
                }
        );
    }
    public void displayResult(boolean result){
        Context context = getApplicationContext();
        if(result){
            Toast toast = Toast.makeText(context, "WINNER!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(context, "LOOSER!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

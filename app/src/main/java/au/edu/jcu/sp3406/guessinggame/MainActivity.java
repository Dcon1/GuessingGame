package au.edu.jcu.sp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkGuess(View view){
        EditText userInput = (EditText)findViewById(R.id.editText);
        String num = userInput.getText().toString();
        final int USERNUM = Integer.parseInt(num);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(Game.check(USERNUM))
                            displayResult(true);
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

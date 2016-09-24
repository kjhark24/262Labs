package kjh46calvin.lab3;

import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnKeyListener;

/** This is a password app used to display an image
 * For CS 262 Lab 3
 *
 * @author Kyle Harkema
 */
public class MainActivity extends AppCompatActivity implements OnKeyListener{

    //widget variables
    private EditText password;
    private TextView wrongPassword;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        password = (EditText)findViewById(R.id.password);  //assign widget variables to actual widgets
        wrongPassword = (TextView)findViewById(R.id.wrongPassword);
        picture = (ImageView)findViewById(R.id.picture);
        picture.setVisibility(View.INVISIBLE);             //set widgets to be invisible
        wrongPassword.setVisibility(View.INVISIBLE);

        password.setOnKeyListener(this);                  //set Listener to key strokes on the password edit text
    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent event) {
        String answer = "taco";                           //This is the correct password
        switch (keyCode){
            case KeyEvent.KEYCODE_ENTER:                  //Event only happens when enter is hit
               String input = password.getText().toString();
                if (input.equals(answer)){
                    picture.setVisibility(View.VISIBLE);
                    wrongPassword.setVisibility(View.INVISIBLE);
                }
                else {
                    wrongPassword.setVisibility(View.VISIBLE);
                    picture.setVisibility(View.INVISIBLE);
                }
        }
    return false; }
}

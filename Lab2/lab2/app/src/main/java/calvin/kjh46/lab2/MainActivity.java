package calvin.kjh46.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

/** This is a calculator app used to double a number
 * For CS 262 Lab 2
 *
 * @author Kyle Harkema
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // widget variables
    private EditText input;
    private TextView result;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        calculate = (Button)findViewById(R.id.calculate);
        input = (EditText)findViewById(R.id.input);
        result = (TextView)findViewById(R.id.result);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num = input.getText().toString();
        int answer = Integer.parseInt(num) * 2;
        result.setText(String.valueOf(answer));

    }
}

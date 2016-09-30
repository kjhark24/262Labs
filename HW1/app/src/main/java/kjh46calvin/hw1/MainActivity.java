package kjh46calvin.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import static kjh46calvin.hw1.R.id.add;
import static kjh46calvin.hw1.R.id.divide;
import static kjh46calvin.hw1.R.id.multiply;
import static kjh46calvin.hw1.R.id.subtract;

/** This is a calculator app
 * For CS 262 HW1
 *
 * @author Kyle Harkema
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //widget variables
    private EditText value1;
    private EditText value2;
    private TextView Answer;
    private Button calculate;
    private RadioGroup radioGroup;
    //other variables
    private int operation;
    private int val1;
    private int val2;
    private int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        //assign widget variables
        Answer = (TextView)findViewById(R.id.Answer);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        value1 = (EditText)findViewById(R.id.value1);
        value2 = (EditText)findViewById(R.id.value2);
        calculate = (Button)findViewById(R.id.calculate);

        //set listener for button press
        calculate.setOnClickListener(this);
        //set listener for radio buttons
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //checks id of button and assigns operation a int that will correspond to the operation
                switch (checkedId) {
                    case add:
                        operation = 0;
                        break;
                    case subtract:
                        operation = 1;
                        break;
                    case multiply:
                        operation = 2;
                        break;
                    case divide:
                        operation = 3;
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        onPause();
        onResume();
        //use integer assigned with radio buttons to know what operation to use
        switch (operation) {
            case 0:
                answer = val1 + val2;
                break;
            case 1:
                answer = val1 - val2;
                break;
            case 2:
                answer = val1 * val2;
                break;
            case 3:
                answer = val1 / val2;
                break;
        }
        Answer.setText(String.valueOf(answer));

    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first
        val1 = Integer.parseInt(value1.getText().toString());
        val2 = Integer.parseInt(value2.getText().toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        //honestly im not sure what you want here
    }
}

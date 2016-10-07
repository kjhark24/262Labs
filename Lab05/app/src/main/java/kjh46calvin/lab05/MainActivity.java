package kjh46calvin.lab05;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;


/** This is a app used for testing fragments and preferences
 * For CS 262 Lab 5
 *
 * @author Kyle Harkema
 */

public class MainActivity extends AppCompatActivity {

    //variables
    private TextView pref;
    private SharedPreferences prefs;
    private boolean testPreference = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //checks status of preference and changes text accordingly
    private void init(){
        pref = (TextView)findViewById(R.id.pref);
        testPreference = prefs.getBoolean("testPreference", true);
        if (testPreference) {
            pref.setText("True");
        } else {
            pref.setText("False");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent myIntent = new Intent(this, activity2.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    //Checks preferences on resume
    @Override
    public  void onResume(){
        super.onResume();
        testPreference = prefs.getBoolean("testPreference", true);
        if (testPreference) {
            pref.setText("True");
        } else {
            pref.setText("False");
        }
    }


}

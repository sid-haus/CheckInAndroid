package io.github.saish1396.checkinandroid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class welcomeOne extends Activity {
    public final static String FIRST_NAME = "first name";
    public final static String LAST_NAME= "last name";
    public final static String STUDENT_ID= "student id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_one);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome_one, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/** Following is called when user clicks continue button.*/
    public void continueOne(View view){
        EditText firstName= (EditText) findViewById(R.id.firstName);
        String firstNameString = firstName.getText().toString();
        EditText lastName= (EditText) findViewById(R.id.lastName);
        String lastNameString= lastName.getText().toString();
        EditText studentID= (EditText) findViewById(R.id.studentId);
        String studentIDString= studentID.getText().toString();

    /**Toasts are the things that are like mini notifications that you'll see at the bottom of the screen.*/
        Context context = getApplicationContext();
        CharSequence text = "Let's do this, " + firstNameString + "!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    /**The following is an intent to start the next activity (mainCodeOne), and carry the key user data with it.*/
        Intent intentOne = new Intent(this, MainActivityOne.class);
        intentOne.putExtra(FIRST_NAME, firstNameString);
        intentOne.putExtra(LAST_NAME, lastNameString);
        intentOne.putExtra(STUDENT_ID, studentIDString);
        startActivity(intentOne);


    }

}
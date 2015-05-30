package io.github.saish1396.checkinandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class mainScanOne extends Activity {
    public String firstName = "counter";
    public String lastName = "counter";
    public String studentID = "counter";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentOne = getIntent();
        firstName = intentOne.getStringExtra(welcomeOne.FIRST_NAME);
        lastName = intentOne.getStringExtra(welcomeOne.LAST_NAME);
        studentID = intentOne.getStringExtra(welcomeOne.STUDENT_ID);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_scan_one, menu);
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

    public void continueTwo(View view){
        Intent intentOne = new Intent(this, MainActivityOne.class);
        intentOne.putExtra(firstName,firstName);
        intentOne.putExtra(lastName, lastName);
        intentOne.putExtra(studentID, studentID);
        startActivity(intentOne);




    }

}

package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper db = new DBHelper(this);

        // The commented lines were used to initialize the database since sqlite dbs in android are persistent
        //Log.i(TAG, "Inserting status into database for the first time");
        //db.addStatus(1,"Airbrush System Model# 722-E05", "READY", 0);
        //db.addStatus(2, "Mini 3D Printer Model# 102", "CHECKED OUT", 1);
        //db.addStatus(3, "Laser Engraver Model# 7221-B", "MAINTENANCE", 0);

        //Log.i(TAG, "Inserting users into database for the first time");
        //db.addUser(1, "Tori Riggs", "vlriggs@mavs.coloradomesa.edu");
        //db.addUser(2, "Demo Guy", "demo56email@gmail.com");

        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Insert database info here");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogStyle);
                alertDialog.setCancelable(true);
                alertDialog.setTitle("@string/airbrush");
                alertDialog.setMessage(stringBuilder.toString());
                alertDialog.setPositiveButton("Change", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // where we will be able to change who the item is checked out to
                    }
                });
                alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {dialog.cancel();}
                });
                alertDialog.setNegativeButton("Email", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // where we will be able to email the person the item is checked out to
                    }
                });
                alertDialog.show();
            }
        });

        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogStyle);
                final EditText input = new EditText(MainActivity.this);
                input.setHint("Name");
                final EditText input2 = new EditText(MainActivity.this);
                input2.setHint("Email");
                LinearLayout l = new LinearLayout(MainActivity.this);
                l.setOrientation(LinearLayout.VERTICAL);
                alertDialog.setCancelable(true);
                alertDialog.setTitle("Add a new User");
                l.addView(input);
                l.addView(input2);
                alertDialog.setView(l);
                alertDialog.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String value = input.getText().toString().trim();
                        String value2 = input2.getText().toString().trim();
                        db.addUser();
                        Toast.makeText(getApplicationContext(), "Added new user " + value + " with email " + value2, Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialog.show();
            }
        });
    }

    public void checkoutSystem() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

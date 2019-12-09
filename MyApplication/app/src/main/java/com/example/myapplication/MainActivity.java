package com.example.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import static java.lang.Integer.parseInt;

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
                checkoutSystem(db, 1);
            }
        });

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutSystem(db, 2);
            }
        });

        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutSystem(db, 3);
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
                        db.addUser(value, value2);
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

    public void checkoutSystem(DBHelper db, int itemid) {
        StringBuilder stringBuilder = new StringBuilder();
        final String e;
        String item[] = db.getItem(itemid);
        stringBuilder.append("Status: ");
        stringBuilder.append(item[2] + "\n");
        Log.i(TAG, "'" + item[2] + "'" );
        if (item[2].equals("CHECKED OUT")) {
            stringBuilder.append("Checked out to: ");
            String user[] = db.getUser(parseInt(item[3]));
            stringBuilder.append(user[1] + "\n");
            e = user[2];
        } else {
            stringBuilder.append(("Not checked out."));
            e = "";
        }

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogStyle);
        alertDialog.setCancelable(true);
        alertDialog.setTitle(getResources().getString(R.string.airbrush));
        alertDialog.setMessage(stringBuilder.toString());
        alertDialog.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) { String[][] users = db.getUsers();
                StringBuilder sb = new StringBuilder();


                for (String[] user:users){
                    if (user[0] == null) break;
                    else {
                        sb.append("User " + user[0] + ": ");
                        sb.append(user[1] + "\n");
                        sb.append("Email: " + user[2] + "\n\n");
                    }
                }
                sb.append("Enter the number 1001 to set the item to READY or 2002 to set the item to MAINTENANCE\n");
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogStyle);
                final TextView txt = new TextView(MainActivity.this);
                txt.append(sb);
                final EditText input = new EditText(MainActivity.this);
                input.setHint("User ID");
                LinearLayout l = new LinearLayout(MainActivity.this);
                l.setOrientation(LinearLayout.VERTICAL);
                alert.setCancelable(true);
                alert.setTitle("Set status");
                l.addView(txt);
                l.addView(input);
                final ScrollView scrollView = new ScrollView(MainActivity.this);
                scrollView.addView(l);
                alert.setView(scrollView);
                alert.setPositiveButton("Change", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String value = input.getText().toString().trim();
                        int val = parseInt(value);
                        String status;
                        if (val == 1001) status = "READY";
                        else if (val == 2002) status = "MAINTENANCE";
                        else status = "CHECKED OUT";
                        db.updateStatus(itemid, status, val);
                        Toast.makeText(getApplicationContext(), "Changed status to " + status + " with user id " + val, Toast.LENGTH_LONG).show();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
            }
        });
        alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {dialog.cancel();}
        });
        alertDialog.setNegativeButton("Email", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent email_intent = new Intent(Intent.ACTION_SEND);
                email_intent.putExtra(Intent.EXTRA_EMAIL, new String[]{e});
                Log.i(TAG, e);
                email_intent.putExtra(Intent.EXTRA_SUBJECT, "Your checked out item");
                email_intent.putExtra(Intent.EXTRA_TEXT, "Please return the item you checked out within 3 days.");

                email_intent.setType("message/rfc822");

                startActivity(Intent.createChooser(email_intent, "Choose an email client: "));
            }
        });
        alertDialog.show();
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

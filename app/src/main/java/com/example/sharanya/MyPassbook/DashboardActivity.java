package com.example.sharanya.MyPassbook;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


import com.google.firebase.auth.FirebaseAuth;



/**
 * Created by Sharanya on 8/04/2018.
 */

public class DashboardActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    ImageView Logout;
    ImageView notes;
    ImageView tips;
    ImageView forum;
    


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        firebaseAuth = FirebaseAuth.getInstance();

        Logout = (ImageView) findViewById(R.id.Logout);
        notes = (ImageView) findViewById(R.id.Lnotes);
        tips = (ImageView) findViewById(R.id.Ltips);
        forum = (ImageView) findViewById(R.id.forum);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });

        notes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,MyNotes.class));
            }
        });

        tips.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,TipsActivity.class));
            }
        });

       forum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,MainActivity.class));
            }
        });
    }
    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
    }


}

package com.example.mywebe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String Username = "Username";
    public CardView card1, card2, card3, card4, card5, card6;
    private TextView uname;
    private String e_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        uname = (TextView) findViewById(R.id.amazonName);
        Intent finalwibu = getIntent();
        String receiv = finalwibu.getStringExtra("Hamba");
        uname.setText(receiv);

        card1 = (CardView) findViewById(R.id.clothingCard);
        card2 = (CardView) findViewById(R.id.ochaco);
        card3 = (CardView) findViewById(R.id.almijh);
        card4 = (CardView) findViewById(R.id.kiana);
        card5 = (CardView) findViewById(R.id.usaginie);
        card6 = (CardView) findViewById(R.id.momoke);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.clothingCard:
                i = new Intent(this, deku.class);
                startActivity(i);
                break;

            case R.id.ochaco:
                i = new Intent(this, uraraka.class);
                startActivity(i);
                break;

            case R.id.almijh:
                i = new Intent(this, allmight.class);
                startActivity(i);
                break;

            case R.id.kiana:
                i = new Intent(this, kaina.class);
                startActivity(i);
                break;

            case R.id.usaginie:
                i = new Intent(this, rumi.class);
                startActivity(i);
                break;

            case R.id.momoke:
                i = new Intent(this, momo.class);
                startActivity(i);
                break;


        }

    }
}
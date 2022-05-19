package sg.edu.rp.c346.id21010650.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView TextViewCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextViewCharacter = findViewById(R.id.TextViewCharacter);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("Character", 'a');
        TextViewCharacter.setText("Character value received is: " + value);

    }
}
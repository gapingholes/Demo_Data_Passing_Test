package sg.edu.rp.c346.id21010650.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {

    TextView TextViewDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextViewDouble = findViewById(R.id.TextViewDouble);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 99.99);
        TextViewDouble.setText("Double value received is: " + value);
    }
}
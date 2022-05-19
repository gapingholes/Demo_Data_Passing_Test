package sg.edu.rp.c346.id21010650.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView TextViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextViewAnswer =findViewById(R.id.TextViewAnswer);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        TextViewAnswer.setText("Integer value received is: " + value);

    }
}
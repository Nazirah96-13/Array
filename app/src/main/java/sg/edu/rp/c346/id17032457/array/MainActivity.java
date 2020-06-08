package sg.edu.rp.c346.id17032457.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String[] fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Array");

        fruits = new String[3];
        fruits[0]="apple";
        fruits[1]="banana";
        fruits[2]="cherry";

        tv = findViewById(R.id.textView);

        String text = "Fruits\n";
        text += "=====\n";

        //Using For loop
        for (int i =0; i<fruits.length;i++){
            text += fruits[i] + "\n";

        }
        tv.setText(text);


    }
}

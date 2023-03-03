package ru.mirea.kuznetsov.andrew.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView trout;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkbox21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trout = findViewById(R.id.trout);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkbox21 = findViewById(R.id.checkbox21);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trout.setText("Мой номер по списку No 13");
                checkbox21.setChecked(true);
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void onMyButtonClick (View view)
    {
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();
    }
    public void onMyButtonClick2 (View view)
    {
        Toast.makeText(this, "Это не я", Toast.LENGTH_SHORT).show();
    }
}
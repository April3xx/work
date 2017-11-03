package com.example.priva.myapplication;


        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

/**
 * Created by priva on 02-Nov-17.
 */
public class Show extends AppCompatActivity implements View.OnClickListener {
    TextView text2;
    Button btn;
    public String showanswer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        text2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        showanswer = getIntent().getStringExtra("movies");
       // Toast.makeText(this, showanswer, Toast.LENGTH_SHORT).show();
        text2.setText(showanswer);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent j = new Intent(this,MainActivity.class);
        startActivity(j);
    }
}

package my.edu.utem.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView, emailTextView, cellTextView, phoneTextView, messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameTextView = findViewById(R.id.second_nameTextView);
        emailTextView = findViewById(R.id.second_emailTextView);
        cellTextView = findViewById(R.id.second_cellTextView);
        phoneTextView = findViewById(R.id.second_phoneTextView);
        messageTextView = findViewById(R.id.second_messageTextView);
        Intent intent = getIntent();
        String nameValue = intent.getStringExtra("name");
        String emailValue = intent.getStringExtra("email");
        String phoneValue = intent.getStringExtra("phone");
        String cellValue = intent.getStringExtra("cell");
        String messageValue = intent.getStringExtra("message");
        nameTextView.setText(nameValue);
        emailTextView.setText(emailValue);
        phoneTextView.setText(phoneValue);
        cellTextView.setText(cellValue);
        messageTextView.setText(messageValue);
    }
}

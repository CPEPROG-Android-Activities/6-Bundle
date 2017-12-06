package wit.ie.android6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buclick(View view){
        EditText userText = (EditText) findViewById(R.id.usernameEditText);
        EditText passText = (EditText) findViewById(R.id.passwordEditText);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString("username",userText.getText().toString());
        b.putString("password",passText.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}

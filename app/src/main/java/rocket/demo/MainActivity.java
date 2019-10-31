package rocket.demo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private TextView signup;
    private EditText username;
    private EditText password;
    public int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.loginbtn);
        username = (EditText)findViewById((R.id.username));
        password = (EditText)findViewById((R.id.password));
        signup = (TextView)findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                validate(username.getText().toString(), password.getText().toString());
            }
        });

        toSignup();
    }

    private void toSignup()
    {
        signup = (TextView)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent j = new Intent(MainActivity.this, Signup.class);
                startActivity(j);
            }
        });
    }


    private void validate(String username, String password)
    {
        if((username.equals("Admin")) && (password.equals("123")))
        {
            Intent i = new Intent(MainActivity.this, Main_Menu.class);
            startActivity(i);
        }

        else
        {
            counter--;
            if(counter == 0)
            {
                login.setEnabled(false);
                toSignup();
            }
        }
    }
}

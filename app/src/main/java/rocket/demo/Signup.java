package rocket.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Signup extends Activity
{
    private EditText id;
    private EditText email;
    private EditText password;
    private EditText cPassword;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
    }

}

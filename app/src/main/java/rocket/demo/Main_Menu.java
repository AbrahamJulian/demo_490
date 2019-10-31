package rocket.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Menu extends Activity
{
    private Button start;
    private Button inventory;
    private Button quit;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu_activity);

        start = (Button)findViewById(R.id.Main_Menu_Start);
        inventory = (Button)findViewById(R.id.Main_Menu_Inventory);
        quit = (Button)findViewById(R.id.Main_Menu_Quit);

        toZip();
    }

    private void toZip()
    {
        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent j = new Intent(Main_Menu.this, Zip_Activity.class);
                startActivity(j);
            }
        });
    }


}

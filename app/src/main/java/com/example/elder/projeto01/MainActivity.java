import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView minhaTextView = findViewById(R.id.textview);

        Button meuButton = (Button) findViewById(R.id.meubutton);
        meuButton.setOnClickListener(this);

//         meuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//            }
//        });
//
//     }
//
//
//      public void clicket (View v){
//         Toast.makeText( this, "Tijolinho!!!", Toast.LENGTH_LONG).show();
//         TextView minhaTextView = (TextView) findViewById(R.id.textview);
//         minhaTextView.setText("Tijolinho");
//     }


    }
package calculadora.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    EditText btSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText)findViewById(R.id.etNum1);

        etNum2 = (EditText)findViewById(R.id.etNum2);

        btSoma = (Button)findViewById(R.id.btSoma);

    }
}

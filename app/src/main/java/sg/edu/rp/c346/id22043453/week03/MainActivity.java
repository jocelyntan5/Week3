package sg.edu.rp.c346.id22043453.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Step 1 - declare variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgButton = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                // get the state of the toggle button
                boolean isChecked = tgButton.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });


    }
}
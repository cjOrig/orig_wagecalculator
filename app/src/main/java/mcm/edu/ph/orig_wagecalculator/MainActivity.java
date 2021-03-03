package mcm.edu.ph.orig_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnCompute;
        btnCompute = findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);
    }

    public void onClick(View v) {
        EditText inputvalue;
        TextView txtanswer;

        inputvalue = findViewById(R.id.inputvalue);
        txtanswer = findViewById(R.id.txtanswer);

        int workHours = 8;
        int hourlyWage = 100;
        double overTimeWage = 0.30;

        Double value = 0.0;
        Double answer = 0.0;



        switch (v.getId()) {


            case R.id.btnCompute:
                value = Double.parseDouble(inputvalue.getText().toString());

                if (value > workHours){
                    answer = (hourlyWage * workHours) + (value - 8 )*(hourlyWage * overTimeWage);
                }
                else {
                    answer = (value * hourlyWage);
                }
                txtanswer.setText(Double.toString(answer));

                break;

        }
    }

}














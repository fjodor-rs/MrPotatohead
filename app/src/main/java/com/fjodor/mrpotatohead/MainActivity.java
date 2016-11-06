package com.fjodor.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.check_arms:
                if (checked)
                {
                    findViewById(R.id.arms).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.arms).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_ears:
                if (checked)
                {
                    findViewById(R.id.ears).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.ears).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_eyebrows:
                if (checked)
                {
                    findViewById(R.id.eyebrows).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eyebrows).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_eyes:
                if (checked)
                {
                    findViewById(R.id.eyes).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eyes).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_glasses:
                if (checked)
                {
                    findViewById(R.id.glasses).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.glasses).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_hat:
                if (checked)
                {
                    findViewById(R.id.hat).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.hat).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_mouth:
                if (checked)
                {
                    findViewById(R.id.mouth).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.mouth).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_mustache:
                if (checked)
                {
                    findViewById(R.id.mustache).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.mustache).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_nose:
                if (checked)
                {
                    findViewById(R.id.nose).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.nose).setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_shoes:
                if (checked)
                {
                    findViewById(R.id.shoes).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.shoes).setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
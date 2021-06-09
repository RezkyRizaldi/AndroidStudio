package com.example.punyaku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
private Button button;
CheckBox cb;
    EditText et;
    EditText et2;
    EditText et4;
    EditText et5;
    EditText et3;
    RadioGroup rg;
    RadioButton rb , rb2 , rb3 , rb4 , rb5 , rb6;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        cb = (CheckBox) findViewById(R.id.checkBox);


        et = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText5);
        et4 = (EditText) findViewById(R.id.editText3);
        et5 = (EditText) findViewById(R.id.editText4);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
        rb6 = (RadioButton) findViewById(R.id.radioButton6);





        et.setEnabled(false);
        et2.setEnabled(false);
        et3.setEnabled(false);
        et4.setEnabled(false);
        et5.setEnabled(false);





        button.setEnabled(false);
        cb.setEnabled(false);








rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        if(checkedId==R.id.radioButton)
        {
            et.setEnabled(true);

        }
        if(checkedId==R.id.radioButton2)
        {
            et.setEnabled(true);

        }if(checkedId==R.id.radioButton3)
        {
            et.setEnabled(true);

        }if(checkedId==R.id.radioButton4)
        {
            et.setEnabled(true);

        }if(checkedId==R.id.radioButton5)
        {
            et.setEnabled(true);

        }
        if(checkedId==R.id.radioButton6)
        {
            et.setEnabled(true);

        }




        if(checkedId==R.id.radioButton)
        {
            et2.setEnabled(true);

        }
        if(checkedId==R.id.radioButton2)
        {
            et2.setEnabled(true);

        }if(checkedId==R.id.radioButton3)
        {
            et2.setEnabled(true);

        }if(checkedId==R.id.radioButton4)
        {
            et2.setEnabled(true);

        }if(checkedId==R.id.radioButton5)
        {
            et2.setEnabled(true);

        }
        if(checkedId==R.id.radioButton6)
        {
            et2.setEnabled(true);

        }


        if(checkedId==R.id.radioButton)
        {
            et3.setEnabled(true);

        }
        if(checkedId==R.id.radioButton2)
        {
            et3.setEnabled(true);

        }if(checkedId==R.id.radioButton3)
        {
            et3.setEnabled(true);

        }if(checkedId==R.id.radioButton4)
        {
            et3.setEnabled(true);

        }if(checkedId==R.id.radioButton5)
        {
            et3.setEnabled(true);

        }
        if(checkedId==R.id.radioButton6)
        {
            et3.setEnabled(true);

        }
        if(checkedId==R.id.radioButton)
        {
            et4.setEnabled(true);

        }
        if(checkedId==R.id.radioButton2)
        {
            et4.setEnabled(true);

        }if(checkedId==R.id.radioButton3)
        {
            et4.setEnabled(true);

        }if(checkedId==R.id.radioButton4)
        {
            et4.setEnabled(true);

        }if(checkedId==R.id.radioButton5)
        {
            et4.setEnabled(true);

        }
        if(checkedId==R.id.radioButton6)
        {
            et4.setEnabled(true);

        }
        if(checkedId==R.id.radioButton)
        {
            et5.setEnabled(true);

        }
        if(checkedId==R.id.radioButton2)
        {
            et5.setEnabled(true);

        }if(checkedId==R.id.radioButton3)
        {
            et5.setEnabled(true);

        }if(checkedId==R.id.radioButton4)
        {
            et5.setEnabled(true);

        }if(checkedId==R.id.radioButton5)
        {
            et5.setEnabled(true);

        }
        if(checkedId==R.id.radioButton6)
        {
            et5.setEnabled(true);

        }

    }
});




        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });







        et3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                et3.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });




        cb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (cb.isChecked()){
                    button.setEnabled(true);
                }else {button.setEnabled(false);}
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaktivitas2();
            }
        });




    }



    private void checkRequiredFields() {
        if (!et.getText().toString().isEmpty() && !et2.getText().toString().isEmpty() && !et3.getText().toString().isEmpty()&& !et4.getText().toString().isEmpty() && !et5.getText().toString().isEmpty()) {
            cb.setEnabled(true);
        } else {
            cb.setEnabled(false);
        }
    }




    public void openaktivitas2(){
Intent intent = new Intent(this, tes2.class);
startActivity(intent);
    }

    public boolean isEmailValid(String et4)
    {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = et4;

        Pattern pattern = Pattern.compile(regExpn,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }
}

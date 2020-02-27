package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String string_one,string_two,string_three,string_six,string_eight,string_nine,string_ten,string_eleven,string_twelve;
    String string_four[]= new String[7];
    String string_five[]= new String[7];
    String string_seven[]= new String[5];
    int i4=0,i5=0,i7=0;
    int j4=0,j5=0,j7=0;
    String  sI4,sI5,sI7;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        final Button btnw= (Button) findViewById(R.id.button_wel);
        btnw.setEnabled(false);
        final CheckBox cBw=(CheckBox)findViewById(R.id.checkBoxw);
        cBw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked) {
                    btnw.setEnabled(true);
                    Toast.makeText(MainActivity.this,  "Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    btnw.setEnabled(false);
                }
            }
        });

    }

    public void onclick_buttonw(View view)
    {
        setContentView(R.layout.question_one);
        final Button btnone= (Button) findViewById(R.id.button_one);
        btnone.setEnabled(false);
        RadioGroup mRadioG1 = (RadioGroup) findViewById(R.id.radioGroup_one);
        final RadioButton mRadio1_1 = (RadioButton) findViewById(R.id.radioButton_one_1);
        final RadioButton mRadio1_2 = (RadioButton) findViewById(R.id.radioButton_one_2);
        final RadioButton mRadio1_3 = (RadioButton) findViewById(R.id.radioButton_one_3);
        final RadioButton mRadio1_4 = (RadioButton) findViewById(R.id.radioButton_one_4);
        final RadioButton mRadio1_5 = (RadioButton) findViewById(R.id.radioButton_one_5);
        final RadioButton mRadio1_6 = (RadioButton) findViewById(R.id.radioButton_one_6);
        final RadioButton mRadio1_7 = (RadioButton) findViewById(R.id.radioButton_one_7);
        RadioGroup.OnCheckedChangeListener radiogpchange1 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio1_1.getId())
                {
                    btnone.setEnabled(true);
                    String text1_1 = mRadio1_1.getText().toString();
                    string_one= text1_1;
                }
                else if (checkedId == mRadio1_2.getId())
                {
                    btnone.setEnabled(true);
                    String text1_2 = mRadio1_2.getText().toString();
                    string_one= text1_2;
                }
                else if (checkedId == mRadio1_3.getId())
                {
                    btnone.setEnabled(true);
                    String text1_3 = mRadio1_3.getText().toString();
                    string_one= text1_3;
                }
                else if (checkedId == mRadio1_4.getId())
                {
                    btnone.setEnabled(true);
                    String text1_4 = mRadio1_4.getText().toString();
                    string_one= text1_4;
                }
                else if (checkedId == mRadio1_5.getId())
                {
                    btnone.setEnabled(true);
                    String text1_5 = mRadio1_5.getText().toString();
                    string_one= text1_5;
                }
                else if (checkedId == mRadio1_6.getId())
                {
                    btnone.setEnabled(true);
                    String text1_6 = mRadio1_6.getText().toString();
                    string_one= text1_6;
                }
                else if (checkedId == mRadio1_7.getId())
                {
                    btnone.setEnabled(true);
                    String text1_7 = mRadio1_7.getText().toString();
                    string_one= text1_7;
                }
                else
                {
                    btnone.setEnabled(false);
                }
            }
        };
        mRadioG1.setOnCheckedChangeListener(radiogpchange1);
    }

    public void onclick_buttonone(View view)
    {
        setContentView(R.layout.question_two);
        final Button btntwo= (Button) findViewById(R.id.button_two);
        btntwo.setEnabled(false);
        RadioGroup mRadioG2 = (RadioGroup) findViewById(R.id.radioGroup_two);
        final RadioButton mRadio2_1 = (RadioButton) findViewById(R.id.radioButton_two_1);
        final RadioButton mRadio2_2 = (RadioButton) findViewById(R.id.radioButton_two_2);
        final RadioButton mRadio2_3 = (RadioButton) findViewById(R.id.radioButton_two_3);
        final RadioButton mRadio2_4 = (RadioButton) findViewById(R.id.radioButton_two_4);
        final RadioGroup.OnCheckedChangeListener radiogpchange2 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio2_1.getId())
                {
                    btntwo.setEnabled(true);
                    String text2_1 = mRadio2_1.getText().toString();
                    string_two= text2_1;
                }
                else if (checkedId == mRadio2_2.getId())
                {
                    btntwo.setEnabled(true);
                    String text2_2 = mRadio2_2.getText().toString();
                    string_two= text2_2;
                }
                else if (checkedId == mRadio2_3.getId())
                {
                    btntwo.setEnabled(true);
                    String text2_3 = mRadio2_3.getText().toString();
                    string_two= text2_3;
                }
                else if (checkedId == mRadio2_4.getId())
                {
                    btntwo.setEnabled(true);
                    String text2_4 = mRadio2_4.getText().toString();
                    string_two= text2_4;
                }
                else
                {
                    btntwo.setEnabled(false);
                }
            }
        };
        mRadioG2.setOnCheckedChangeListener(radiogpchange2);
    }

    public void onclick_buttontwo(View view)
    {
        setContentView(R.layout.question_three);
        final Button btnthree= (Button) findViewById(R.id.button_three);
        btnthree.setEnabled(false);
        RadioGroup mRadioG3 = (RadioGroup) findViewById(R.id.radioGroup_three);
        final RadioButton mRadio3_1 = (RadioButton) findViewById(R.id.radioButton_three_1);
        final RadioButton mRadio3_2 = (RadioButton) findViewById(R.id.radioButton_three_2);
        final RadioButton mRadio3_3 = (RadioButton) findViewById(R.id.radioButton_three_3);
        final RadioButton mRadio3_4 = (RadioButton) findViewById(R.id.radioButton_three_4);
        final RadioGroup.OnCheckedChangeListener radiogpchange3 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio3_1.getId())
                {
                    btnthree.setEnabled(true);
                    String text3_1 = mRadio3_1.getText().toString();
                    string_three= text3_1;
                }
                else if (checkedId == mRadio3_2.getId())
                {
                    btnthree.setEnabled(true);
                    String text3_2 = mRadio3_2.getText().toString();
                    string_three= text3_2;
                }
                else if (checkedId == mRadio3_3.getId())
                {
                    btnthree.setEnabled(true);
                    String text3_3 = mRadio3_3.getText().toString();
                    string_three= text3_3;
                }
                else if (checkedId == mRadio3_4.getId())
                {
                    btnthree.setEnabled(true);
                    String text3_4 = mRadio3_4.getText().toString();
                    string_three= text3_4;
                }
                else
                {
                    btnthree.setEnabled(false);
                }
            }
        };
        mRadioG3.setOnCheckedChangeListener(radiogpchange3);
    }

    public void onclick_buttonthree(View view)
    {
        setContentView(R.layout.question_four);
        final Button btnfour= (Button) findViewById(R.id.button_four);
        btnfour.setEnabled(false);
        final CheckBox checkBox4_1=(CheckBox)findViewById(R.id.checkBox_four_1);
        final CheckBox checkBox4_2=(CheckBox)findViewById(R.id.checkBox_four_2);
        final CheckBox checkBox4_3=(CheckBox)findViewById(R.id.checkBox_four_3);
        final CheckBox checkBox4_4=(CheckBox)findViewById(R.id.checkBox_four_4);
        final CheckBox checkBox4_5=(CheckBox)findViewById(R.id.checkBox_four_5);
        final CheckBox checkBox4_6=(CheckBox)findViewById(R.id.checkBox_four_6);
        final CheckBox checkBox4_7=(CheckBox)findViewById(R.id.checkBox_four_7);

        //editText1=(EditText)findViewById(R.id.editText1);
        checkBox4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked) {
                    String text4_1 = checkBox4_1.getText().toString();
                    string_four[i4]=text4_1;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_1 + " Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_2 = checkBox4_2.getText().toString();
                    string_four[i4]=text4_2;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_2 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_3 = checkBox4_3.getText().toString();
                    string_four[i4]=text4_3;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_3 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_4 = checkBox4_4.getText().toString();
                    string_four[i4]=text4_4;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_4 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_5 = checkBox4_5.getText().toString();
                    string_four[i4]=text4_5;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_5 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_6 = checkBox4_6.getText().toString();
                    string_four[i4]=text4_6;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_6 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
        checkBox4_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text4_7 = checkBox4_7.getText().toString();
                    string_four[i4]=text4_7;
                    i4++;
                    btnfour.setEnabled(true);
                    Toast.makeText(MainActivity.this, text4_7 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfour.setEnabled(false);
                }
            }
        });
    }

    public void onclick_buttonfour(View view)
    {
        setContentView(R.layout.question_five);
        final Button btnfive= (Button) findViewById(R.id.button_five);
        btnfive.setEnabled(false);
        final CheckBox checkBox5_1=(CheckBox)findViewById(R.id.checkBox_five_1);
        final CheckBox checkBox5_2=(CheckBox)findViewById(R.id.checkBox_five_2);
        final CheckBox checkBox5_3=(CheckBox)findViewById(R.id.checkBox_five_3);
        final CheckBox checkBox5_4=(CheckBox)findViewById(R.id.checkBox_five_4);
        final CheckBox checkBox5_5=(CheckBox)findViewById(R.id.checkBox_five_5);
        final CheckBox checkBox5_6=(CheckBox)findViewById(R.id.checkBox_five_6);
        final CheckBox checkBox5_7=(CheckBox)findViewById(R.id.checkBox_five_7);

        //editText1=(EditText)findViewById(R.id.editText1);
        checkBox5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked) {
                    String text5_1 = checkBox5_1.getText().toString();
                    string_five[i5]=text5_1;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_1 + " Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_2 = checkBox5_2.getText().toString();
                    string_five[i5]=text5_2;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_2 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_3 = checkBox5_3.getText().toString();
                    string_five[i5]=text5_3;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_3 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_4 = checkBox5_4.getText().toString();
                    string_five[i5]=text5_4;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_4 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_5 = checkBox5_5.getText().toString();
                    string_five[i5]=text5_5;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_5 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_6 = checkBox5_6.getText().toString();
                    string_five[i5]=text5_6;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_6 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
        checkBox5_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    String text5_7 = checkBox5_7.getText().toString();
                    string_five[i5]=text5_7;
                    i5++;
                    btnfive.setEnabled(true);
                    Toast.makeText(MainActivity.this, text5_7 + " Clicked", Toast.LENGTH_SHORT).show();
                }else{
                    btnfive.setEnabled(false);
                }
            }
        });
    }

    public void onclick_buttonfive(View view)
    {
        setContentView(R.layout.question_six);
        final Button btnsix= (Button) findViewById(R.id.button_six);
        EditText eT6 =(EditText)findViewById(R.id.editText6);
        temp=eT6.getText().toString();
        string_six=temp;
    }

    public void onclick_buttonsix(View view)
    {
        EditText eT6 =(EditText)findViewById(R.id.editText6);
        temp=eT6.getText().toString();
        string_six=temp;
            setContentView(R.layout.question_seven);
            final Button btnseven = (Button) findViewById(R.id.button_seven);
            btnseven.setEnabled(false);
            final CheckBox checkBox7_1 = (CheckBox) findViewById(R.id.checkBox_seven_1);
            final CheckBox checkBox7_2 = (CheckBox) findViewById(R.id.checkBox_seven_2);
            final CheckBox checkBox7_3 = (CheckBox) findViewById(R.id.checkBox_seven_3);
            final CheckBox checkBox7_4 = (CheckBox) findViewById(R.id.checkBox_seven_4);
            final CheckBox checkBox7_5 = (CheckBox) findViewById(R.id.checkBox_seven_5);
            checkBox7_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    // TODO Auto-generated method stub
                    if (isChecked) {
                        String text7_1 = checkBox7_1.getText().toString();
                        string_seven[i7] = text7_1;
                        i7++;
                        btnseven.setEnabled(true);
                        Toast.makeText(MainActivity.this, text7_1 + " Clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        btnseven.setEnabled(false);
                    }
                }
            });
            checkBox7_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    // TODO Auto-generated method stub
                    if (isChecked) {
                        String text7_2 = checkBox7_2.getText().toString();
                        string_seven[i7] = text7_2;
                        i7++;
                        btnseven.setEnabled(true);
                        Toast.makeText(MainActivity.this, text7_2 + " Clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        btnseven.setEnabled(false);
                    }
                }
            });
            checkBox7_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    // TODO Auto-generated method stub
                    if (isChecked) {
                        String text7_3 = checkBox7_3.getText().toString();
                        string_seven[i7] = text7_3;
                        i7++;
                        btnseven.setEnabled(true);
                        Toast.makeText(MainActivity.this, text7_3 + " Clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        btnseven.setEnabled(false);
                    }
                }
            });
            checkBox7_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    // TODO Auto-generated method stub
                    if (isChecked) {
                        String text7_4 = checkBox7_4.getText().toString();
                        string_seven[i7] = text7_4;
                        i7++;
                        btnseven.setEnabled(true);
                        Toast.makeText(MainActivity.this, text7_4 + " Clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        btnseven.setEnabled(false);
                    }
                }
            });
            checkBox7_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    // TODO Auto-generated method stub
                    if (isChecked) {
                        String text7_5 = checkBox7_5.getText().toString();
                        string_five[i7] = text7_5;
                        i7++;
                        btnseven.setEnabled(true);
                        Toast.makeText(MainActivity.this, text7_5 + " Clicked", Toast.LENGTH_SHORT).show();
                    } else {
                        btnseven.setEnabled(false);
                    }
                }
            });
    }

    public void onclick_buttonseven(View view)
    {
        setContentView(R.layout.question_eight);
        final Button btneight= (Button) findViewById(R.id.button_eight);
        btneight.setEnabled(false);
        RadioGroup mRadioG8 = (RadioGroup) findViewById(R.id.radioGroup_eight);
        final RadioButton mRadio8_1 = (RadioButton) findViewById(R.id.radioButton_eight_1);
        final RadioButton mRadio8_2 = (RadioButton) findViewById(R.id.radioButton_eight_2);
        final RadioButton mRadio8_3 = (RadioButton) findViewById(R.id.radioButton_eight_3);
        final RadioButton mRadio8_4 = (RadioButton) findViewById(R.id.radioButton_eight_4);
        final RadioButton mRadio8_5 = (RadioButton) findViewById(R.id.radioButton_eight_5);
        final RadioButton mRadio8_6 = (RadioButton) findViewById(R.id.radioButton_eight_6);
        final RadioButton mRadio8_7 = (RadioButton) findViewById(R.id.radioButton_eight_7);
        RadioGroup.OnCheckedChangeListener radiogpchange8 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio8_1.getId())
                {
                    btneight.setEnabled(true);
                    String text8_1 = mRadio8_1.getText().toString();
                    string_eight= text8_1;
                }
                else if (checkedId == mRadio8_2.getId())
                {
                    btneight.setEnabled(true);
                    String text8_2 = mRadio8_2.getText().toString();
                    string_eight= text8_2;
                }
                else if (checkedId == mRadio8_3.getId())
                {
                    btneight.setEnabled(true);
                    String text8_3 = mRadio8_3.getText().toString();
                    string_eight= text8_3;
                }
                else if (checkedId == mRadio8_4.getId())
                {
                    btneight.setEnabled(true);
                    String text8_4 = mRadio8_4.getText().toString();
                    string_eight= text8_4;
                }
                else if (checkedId == mRadio8_5.getId())
                {
                    btneight.setEnabled(true);
                    String text8_5 = mRadio8_5.getText().toString();
                    string_eight= text8_5;
                }
                else if (checkedId == mRadio8_6.getId())
                {
                    btneight.setEnabled(true);
                    String text8_6 = mRadio8_6.getText().toString();
                    string_eight= text8_6;
                }
                else if (checkedId == mRadio8_7.getId())
                {
                    btneight.setEnabled(true);
                    String text8_7 = mRadio8_7.getText().toString();
                    string_eight= text8_7;
                }
                else
                {
                    btneight.setEnabled(false);
                }
            }
        };
        mRadioG8.setOnCheckedChangeListener(radiogpchange8);
    }

    public void onclick_buttoneight(View view)
    {
        setContentView(R.layout.question_nine);
        final Button btnnine= (Button) findViewById(R.id.button_nine);
        btnnine.setEnabled(false);
        RadioGroup mRadioG9 = (RadioGroup) findViewById(R.id.radioGroup_nine);
        final RadioButton mRadio9_1 = (RadioButton) findViewById(R.id.radioButton_nine_1);
        final RadioButton mRadio9_2 = (RadioButton) findViewById(R.id.radioButton_nine_2);
        final RadioButton mRadio9_3 = (RadioButton) findViewById(R.id.radioButton_nine_3);
        final RadioButton mRadio9_4 = (RadioButton) findViewById(R.id.radioButton_nine_4);
        final RadioGroup.OnCheckedChangeListener radiogpchange9 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio9_1.getId())
                {
                    btnnine.setEnabled(true);
                    String text9_1 = mRadio9_1.getText().toString();
                    string_nine= text9_1;
                }
                else if (checkedId == mRadio9_2.getId())
                {
                    btnnine.setEnabled(true);
                    String text9_2 = mRadio9_2.getText().toString();
                    string_nine= text9_2;
                }
                else if (checkedId == mRadio9_3.getId())
                {
                    btnnine.setEnabled(true);
                    String text9_3 = mRadio9_3.getText().toString();
                    string_nine= text9_3;
                }
                else if (checkedId == mRadio9_4.getId())
                {
                    btnnine.setEnabled(true);
                    String text9_4 = mRadio9_4.getText().toString();
                    string_nine= text9_4;
                }
                else
                {
                    btnnine.setEnabled(false);
                }
            }
        };
        mRadioG9.setOnCheckedChangeListener(radiogpchange9);
    }

    public void onclick_buttonnine(View view)
    {
        setContentView(R.layout.question_ten);
        final Button btnten= (Button) findViewById(R.id.button_ten);
        btnten.setEnabled(false);
        RadioGroup mRadioG10 = (RadioGroup) findViewById(R.id.radioGroup_ten);
        final RadioButton mRadio10_1 = (RadioButton) findViewById(R.id.radioButton_ten_1);
        final RadioButton mRadio10_2 = (RadioButton) findViewById(R.id.radioButton_ten_2);
        final RadioButton mRadio10_3 = (RadioButton) findViewById(R.id.radioButton_ten_3);
        final RadioButton mRadio10_4 = (RadioButton) findViewById(R.id.radioButton_ten_4);
        final RadioGroup.OnCheckedChangeListener radiogpchange10 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio10_1.getId())
                {
                    btnten.setEnabled(true);
                    String text10_1 = mRadio10_1.getText().toString();
                    string_ten= text10_1;
                }
                else if (checkedId == mRadio10_2.getId())
                {
                    btnten.setEnabled(true);
                    String text10_2 = mRadio10_2.getText().toString();
                    string_ten= text10_2;
                }
                else if (checkedId == mRadio10_3.getId())
                {
                    btnten.setEnabled(true);
                    String text10_3 = mRadio10_3.getText().toString();
                    string_ten= text10_3;
                }
                else if (checkedId == mRadio10_4.getId())
                {
                    btnten.setEnabled(true);
                    String text10_4 = mRadio10_4.getText().toString();
                    string_ten= text10_4;
                }
                else
                {
                    btnten.setEnabled(false);
                }
            }
        };
        mRadioG10.setOnCheckedChangeListener(radiogpchange10);
    }

    public void onclick_buttonten(View view)
    {
        setContentView(R.layout.question_eleven);
        final Button btneleven= (Button) findViewById(R.id.button_eleven);
        btneleven.setEnabled(false);
        RadioGroup mRadioG11 = (RadioGroup) findViewById(R.id.radioGroup_eleven);
        final RadioButton mRadio11_1 = (RadioButton) findViewById(R.id.radioButton_eleven_1);
        final RadioButton mRadio11_2 = (RadioButton) findViewById(R.id.radioButton_eleven_2);
        final RadioGroup.OnCheckedChangeListener radiogpchange11 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio11_1.getId())
                {
                    btneleven.setEnabled(true);
                    String text11_1 = mRadio11_1.getText().toString();
                    string_eleven= text11_1;
                }
                else if (checkedId == mRadio11_2.getId())
                {
                    btneleven.setEnabled(true);
                    String text11_2 = mRadio11_2.getText().toString();
                    string_eleven= text11_2;
                }
                else
                {
                    btneleven.setEnabled(false);
                }
            }
        };
        mRadioG11.setOnCheckedChangeListener(radiogpchange11);
    }

    public void onclick_buttoneleven(View view)
    {
        setContentView(R.layout.question_twelve);
        final Button btntwelve= (Button) findViewById(R.id.button_twelve);
        btntwelve.setEnabled(false);
        RadioGroup mRadioG12 = (RadioGroup) findViewById(R.id.radioGroup_twelve);
        final RadioButton mRadio12_1 = (RadioButton) findViewById(R.id.radioButton_twelve_1);
        final RadioButton mRadio12_2 = (RadioButton) findViewById(R.id.radioButton_twelve_2);
        final RadioButton mRadio12_3 = (RadioButton) findViewById(R.id.radioButton_twelve_3);
        final RadioButton mRadio12_4 = (RadioButton) findViewById(R.id.radioButton_twelve_4);
        final RadioButton mRadio12_5 = (RadioButton) findViewById(R.id.radioButton_twelve_5);
        RadioGroup.OnCheckedChangeListener radiogpchange12 = new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == mRadio12_1.getId())
                {
                    btntwelve.setEnabled(true);
                    String text12_1 = mRadio12_1.getText().toString();
                    string_twelve= text12_1;
                }
                else if (checkedId == mRadio12_2.getId())
                {
                    btntwelve.setEnabled(true);
                    String text12_2 = mRadio12_2.getText().toString();
                    string_twelve= text12_2;
                }
                else if (checkedId == mRadio12_3.getId())
                {
                    btntwelve.setEnabled(true);
                    String text12_3 = mRadio12_3.getText().toString();
                    string_twelve= text12_3;
                }
                else if (checkedId == mRadio12_4.getId())
                {
                    btntwelve.setEnabled(true);
                    String text12_4 = mRadio12_4.getText().toString();
                    string_twelve= text12_4;
                }
                else if (checkedId == mRadio12_5.getId())
                {
                    btntwelve.setEnabled(true);
                    String text12_5 = mRadio12_5.getText().toString();
                    string_twelve= text12_5;
                }
                else
                {
                    btntwelve.setEnabled(false);
                }
            }
        };
        mRadioG12.setOnCheckedChangeListener(radiogpchange12);
    }

    public void onclick_buttontwelve(View view)
    {
        setContentView(R.layout.finish_survey);
    }

    public void onclick_buttonf(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("S1", string_one);
        intent.putExtra("S2", string_two);
        intent.putExtra("S3", string_three);
        for(j4=0;j4<i4;j4++)
        {
            intent.putExtra("S4"+j4, string_four[j4]);
        }
        for(j5=0;j5<i5;j5++)
        {
            intent.putExtra("S5"+j5, string_five[j5]);
        }
        intent.putExtra("S6", string_six);
        for(j7=0;j7<i7;j7++)
        {
            intent.putExtra("S7"+j7, string_seven[j7]);
        }
        sI4 = String.valueOf(i4);
        sI5 = String.valueOf(i5);
        sI7 = String.valueOf(i7);
        intent.putExtra("J4", sI4);
        intent.putExtra("J5", sI5);
        intent.putExtra("J7", sI7);
        intent.putExtra("S8", string_eight);
        intent.putExtra("S9", string_nine);
        intent.putExtra("S10", string_ten);
        intent.putExtra("S11", string_eleven);
        intent.putExtra("S12", string_twelve);
        startActivity(intent);
        //System.exit(0);
    }
}

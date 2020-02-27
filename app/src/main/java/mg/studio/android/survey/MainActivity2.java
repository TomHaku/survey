package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity2 extends AppCompatActivity {
    int i4=0,i5=0,i7=0;
    int t4=0,t5=0,t7=0;
    String final4="4. ",final5="5. ",final7="7. ";
    String final1="1. ",final2="2. ",final3="3. ",final6="6. ",final8="8. ",final9="9. ",final10="10. ",final11="11. ",final12="12. ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String s1 = intent.getStringExtra("S1");
        String s2 = intent.getStringExtra("S2");
        String s3 = intent.getStringExtra("S3");
        String s6 = intent.getStringExtra("S6");
        String s8 = intent.getStringExtra("S8");
        String s9 = intent.getStringExtra("S9");
        String s10 = intent.getStringExtra("S10");
        String s11 = intent.getStringExtra("S11");
        String s12 = intent.getStringExtra("S12");
        String j4 = intent.getStringExtra("J4");
        String j5 = intent.getStringExtra("J5");
        String j7 = intent.getStringExtra("J7");
        i4 = Integer.parseInt(j4);
        i5 = Integer.parseInt(j5);
        i7 = Integer.parseInt(j7);
        String s4[] = new String[i4];
        String s5[] = new String[i5];
        String s7[] = new String[i7];
        for(t4=0;t4<i4;t4++)
        {
            s4[t4]=intent.getStringExtra("S4"+t4);
            if(t4!=0) {final4+=(" and "+ s4[t4]);}
            else{final4+=(s4[t4]);}
        }
        for(t5=0;t5<i5;t5++)
        {
            s5[t5]=intent.getStringExtra("S5"+t5);
            if(t5!=0) {final5+=(" and "+ s4[t5]);}
            else{final5+=(s4[t5]);}
        }
        for(t7=0;t7<i7;t7++)
        {
            s7[t7]=intent.getStringExtra("S7"+t7);
            if(t7!=0) {final7+=(" and "+ s4[t7]);}
            else{final7+=(s4[t7]);}
        }
        final1+=s1;
        final2+=s2;
        final3+=s3;
        final6+=s6;
        final8+=s8;
        final9+=s9;
        final10+=s10;
        final11+=s11;
        final12+=s12;
        MultiAutoCompleteTextView multiAutoCompleteTextView= (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextViewR);
        multiAutoCompleteTextView.setText(final1+"\n"+final2+"\n"+final3+"\n"+final4+"\n"+final5+"\n"+final6+"\n"+final7+"\n"+final8+"\n"+final9+"\n"+final10+"\n"+final11+"\n"+final12+"\n");
    }
}

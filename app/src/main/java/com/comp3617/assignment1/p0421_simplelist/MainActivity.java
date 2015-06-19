package com.comp3617.assignment1.p0421_simplelist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity  {

    final String LOG_TAG = "myLogs";

    ListView lvMain;
    String[] names;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        lvMain = (ListView) findViewById(R.id.lvMain);
        // ????????????? ????? ?????? ??????? ??????
        lvMain.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        // ??????? ???????, ????????? ?????? ?? ????? ????????
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.names,
                android.R.layout.simple_list_item_single_choice);
        lvMain.setAdapter(adapter);

        Button btnChecked = (Button) findViewById(R.id.btnChecked);
        //btnChecked.setOnClickListener(this);

        // ???????? ?????? ?? ????? ????????
        names = getResources().getStringArray(R.array.names);
    }

    public void onClickItem(View arg0) {
        // ????? ? ??? ?????????? ???????
        Toast.makeText(this, "checked: " + names[lvMain.getCheckedItemPosition()],
                Toast.LENGTH_SHORT).show();

    }

    public void onClickNew(View arg0) {
        /* ????? ? ??? ?????????? ??????? */
        Toast.makeText(this, "Length : " + names.length,
                Toast.LENGTH_SHORT).show();
        //names[names.length]="TestTest";

    }

}
package com.sus.kumar.autocompletetextview;



import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

       listView =  findViewById( R.id.listItemId );

        Customized_List_View adapter = new Customized_List_View( MainActivity.this );

        listView.setAdapter(adapter);


    }

    }


package com.example.cesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT="REQUEST_RESULT";
    static final String KEY_COUNTER = "COUNTER";
    private int mCounter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> list = new ArrayList<>();
        list.add("Chine");
        list.add("France");
        list.add("Allemagne");
        list.add("Inde");
        list.add("Russie");
        list.add("Royaume uni");
        list.add("Etats-Uni");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(list);
        recyclerView.setAdapter(myAdapter);

        /*SharedPreferences settings = getPreferences(MODE_PRIVATE);
        int defaultCounter = 0;
        mCounter = settings.getInt(KEY_COUNTER, defaultCounter);
        ((TextView)findViewById(R.id.textViewState)).setText("onCreate()\n") ;*/
    }

    /*public void launchIntent(View v) {
        EditText editText = findViewById(R.id.editTextData);
        String text = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,text);
        startActivityForResult(intent,1);
    }*/

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK) {
            Toast toast = new Toast(getApplicationContext());
            toast.makeText(this, Integer.toString(data.getIntExtra(REQUEST_RESULT,
                    0)), Toast.LENGTH_LONG).show();
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 5, 5);
        }
    }
*/
    public void addCounter(View v) {
        /*mCounter++;
        TextView textView = findViewById(R.id.textViewCounter);
        textView.setText("Compteur: " + mCounter);*/
    }

   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER,mCounter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCounter=savedInstanceState.getInt(KEY_COUNTER);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ((TextView)findViewById(R.id.textViewState)).append("onStart()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((TextView)findViewById(R.id.textViewState)).append("onResume()\n") ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        ((TextView)findViewById(R.id.textViewState)).append("onPause()\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        ((TextView)findViewById(R.id.textViewState)).append("onStop()\n");
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        ((TextView)findViewById(R.id.textViewState)).append("onRestart()\n" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ((TextView)findViewById(R.id.textViewState)).append("onDestroy()\n" );
    }*/

}




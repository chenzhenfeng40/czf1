package com.example.administrator.helloworldtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.util.List;

import static com.example.administrator.helloworldtest.GsonTools.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)this.findViewById(R.id.button);
        button2 = (Button)this.findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    private Button button1,button2;
    private static final String TAG = "MainActivity";

    @Override
    public void onClick(final View v){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                switch (v.getId()){
                    case R.id.button:
                        String path = "http://v.juhe.cn/joke/content/list.php?key=c037fdc5bbb9e640d6b5a701dcb11441%20&page=1&pageSize=10&sort=asc&time=1418745237";
                        String jsonString = HttpUtils.getJsonContent(path);
                        Person person = getPerson(jsonString,Person.class);
                        Log.i(TAG,person.toString());
                        break;
                    case R.id.button2:
                        String path2 = "http://v.juhe.cn/joke/content/list.php?key=c037fdc5bbb9e640d6b5a701dcb11441%20&page=1&pageSize=10&sort=asc&time=1418745237";
                        String jsonString2 = HttpUtils.getJsonContent(path2);
                        List<Person> list = GsonTools.getPersons(jsonString2,Person.class);
                        Log.i(TAG,list.toString());
                        break;
                }
            }
        });
       thread.start();

    }
}

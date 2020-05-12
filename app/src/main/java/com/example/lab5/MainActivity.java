package com.example.lab5;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openWebSite(View V){

        EditText ed = (EditText) findViewById(R.id.httpLinkInp);
        String url = "http://" + ed.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    public void sendSMS(View V){

        EditText ed = (EditText) findViewById(R.id.phoneNumInp);
        String url = "smsto:" + ed.getText().toString();
        Uri uri = Uri.parse(url);
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(it);
    }




    public void call(View V){

        //left as Homework: Use the example given in the lecture

    }



    public void showContactList(View V){

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://contacts/people"));
        startActivity(intent);

    }

    public void srchTxt(View V){

        //left as Homework: Use the example given in the lecture

    }

    public void showLoc(View V){

        //left as Homework: Use the example given in the lecture about the direction between two location.


    }
}

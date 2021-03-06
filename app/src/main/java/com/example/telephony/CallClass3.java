package com.example.telephony;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class CallClass3 extends AppCompatActivity {

    EditText editPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call3);



        editPhone = (EditText) findViewById(R.id.editPhone);

    }


    public void btnCall(View view) {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {

            String phoneNum = editPhone.getText().toString().trim();

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + phoneNum));
            startActivity(callIntent);
        } else {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);


        }

    }





}

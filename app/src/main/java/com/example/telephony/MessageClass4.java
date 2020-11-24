package com.example.telephony;

import android.Manifest;
import android.app.Notification;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.telephony.SmsManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MessageClass4 extends AppCompatActivity {
    EditText editMessage ,editPhone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message4);
        editMessage=(EditText) findViewById(R.id.editMessage);
        editPhone=(EditText) findViewById(R.id.editPhone);


    }

    public void btnSend (View view){
        int permissionCheck=ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }
        else {

            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},0);
        }
    }

    public void sendMessage() {
        String phone;
        String message;

        phone=editPhone.getText().toString().trim();
        message=editMessage.getText().toString().trim();


        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phone,null,message,null,null);
        Toast.makeText(this,"Message Sent",Toast.LENGTH_SHORT).show();
    }




}

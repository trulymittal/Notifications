package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationHelper notificationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationHelper = new NotificationHelper(this);

    }

    public void sendNotification(View view) {

        notificationHelper.sendHighPriorityNotification("this is title", "this is some awesome notificaiton. wow i learnt it the easy way.", MainActivity.class);

    }
}

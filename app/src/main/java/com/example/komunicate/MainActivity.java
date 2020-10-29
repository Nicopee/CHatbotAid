package com.example.komunicate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.kommunicate.KmConversationBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kommunicate.init(this, "2e9d020da2bb3b9a05a29c3198efa0405");
        List<String> botList = new ArrayList(); botList.add("bot1"); //enter your integrated bot Ids
        new KmConversationBuilder(MainActivity.this)
                .setBotIds(botList)
                .launchConversation(new KmCallback() {
                    @Override
                    public void onSuccess(Object message) {
                        Log.d("Conversation", "Success : " + message);
                    }

                    @Override
                    public void onFailure(Object error) {
                        Log.d("Conversation", "Failure : " + error);
                    }
                });
//        new KmConversationBuilder(MainActivity.this)
//                //.setKmUser(user)
//                .launchConversation(new KmCallback() {
//                    @Override
//                    public void onSuccess(Object message) {
//                        Log.d("Conversation", "Success : " + message);
//                    }
//
//                    @Override
//                    public void onFailure(Object error) {
//                        Log.d("Conversation", "Failure : " + error);
//                    }
//                });

//        new KmConversationBuilder(MainActivity.this)
//                .launchConversation(new KmCallback() {
//                    @Override
//                    public void onSuccess(Object message) {
//                        Log.d("Conversation", "Success : " + message);
//                    }
//
//                    @Override
//                    public void onFailure(Object error) {
//                        Log.d("Conversation", "Failure : " + error);
//                    }
//                });
    }
}

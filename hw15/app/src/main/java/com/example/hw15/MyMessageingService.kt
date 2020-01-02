package com.example.hw15

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyMessageingService: FirebaseMessagingService() {
    override fun onNewToken(token:String?){
        super.onNewToken(token)
        Log.e("Firebase","onNewToken $token")
    }

    override fun onMessageReceived(msg: RemoteMessage?) {
        super.onMessageReceived(msg)
        Log.e("Firebase","onMessageReceived")
        msg?.let {
            Log.e("Firebase",it.from)
            for(entry in it.data.entries)
                Log.e("Message","${entry.key}/${entry.value}")
        }
    }
}
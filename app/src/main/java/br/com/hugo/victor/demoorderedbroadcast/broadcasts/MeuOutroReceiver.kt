package br.com.hugo.victor.demoorderedbroadcast.broadcasts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MeuOutroReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("DEMOORDERED", "Meu outro receiver")
    }
}
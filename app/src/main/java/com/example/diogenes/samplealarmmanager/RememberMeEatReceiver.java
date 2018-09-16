package com.example.diogenes.samplealarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Date;

public class RememberMeEatReceiver extends BroadcastReceiver {

    private static final String TAG = "fafica";
    public static final String ACTION = "br.com.livroandroid.helloalarme.LEMBREME_DE_COMER";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"Você precisa comer: " + new Date());

        Intent notifIntent = new Intent(context,MainActivity.class);

        NotificationUtil.criarNotificacaoSimples(context,  notifIntent, "Hora de comer algo...","Que tal uma fruta?",1);
    }
}

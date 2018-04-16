package com.clientapp.frei.clientapp.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.clientapp.frei.clientapp.R;
import com.clientapp.frei.clientapp.utils.ConstantManager;

/**
 *
 *  Client Application Android v1.0
 *  The client application for working with Rest requests/data to the server. this application is made on the basis api15 SDK
 *
 *  Die client-Anwendung für die Arbeit mit Rest-Anfragen/Daten an den server. diese Anwendung ist auf der Grundlage api15 SDK
 *
 *
 *  by Andreichenko 2018
 */

public class MainActivity extends AppCompatActivity {

    public static final String TAG = ConstantManager.TAG_PREFIX + "MainActivity";

    /**
     *  This method is called when creating activity (after a configuration change/return to the current
     *  activity after its destruction.
     *
     * <p/>
     *    this method initializes/produced:
     *    - UI user interface (statics)
     *    - initialization of static data aktivity
     *    - data connection with lists (initialize adapter)
     *
     * <p/>
     *      Not to start a lengthy operation for working with data in onCreate() !!!
     *      Nicht zu beginnen, eine langwierige operation, für arbeiten mit Daten in der onCreate() !!!
     *
     * @param savedInstanceState the objects with the values stored in the Bundle /das Objekt mit den gespeicherten Werten im Bundle
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        if (savedInstanceState == null){
            // todo Activity start first
        }else{
            // todo Activity has started
        }

    }

    /**
     * method is called when you start activity before the time that the UI will become available to the user.
     * usually in this method registers event subscriptions that stop was made in onStop()
     *
     * Methode wird aufgerufen, wenn Sie beginnen, Aktivität vor der Zeit, dass die Benutzeroberfläche dem Benutzer zur Verfügung gestellt.
     * In der Regel, die in dieser Methode registriert-Ereignis-Abonnements, dass halt gemacht wurde, in onStop()
     */

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
    }

    /**
     * method is invoked when the activity becomes available for user interaction.
     * in this method, usually run animations/audio/video/run BroadcastReceiver needed to implement UI logic/start execution of threads, etc.
     * the method should be as lightweight, for maximum responsiveness of the UI
     *
     * Methode wird aufgerufen, wenn die Aktivität verfügbar für Benutzer-Interaktion.
     * In dieser Methode, in der Regel laufen Animationen/audio/video/run BroadcastReceiver benötigt um UI-Logik/starten Sie die Ausführung von threads, etc.
     * die Methode sollte so leicht, für eine maximale Reaktionsfähigkeit der Benutzeroberfläche
     *
     */

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();

         Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart");
    }
}

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

public class MainActivity extends BaseActivity {

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
     * method is called when you start activity before the time that the UI will become available to
     * the user.
     * usually in this method registers event subscriptions that stop was made in onStop()
     *
     * Methode wird aufgerufen, wenn Sie beginnen, Aktivität vor der Zeit, dass die Benutzeroberfläche
     * dem Benutzer zur Verfügung gestellt.
     * In der Regel, die in dieser Methode registriert-Ereignis-Abonnements, dass halt gemacht wurde,
     * in onStop()
     */

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
    }

    /**
     * method is invoked when the activity becomes available for user interaction.
     * in this method, usually run animations/audio/video/run BroadcastReceiver needed to implement UI
     * logic/start execution of threads, etc.
     * the method should be as lightweight, for maximum responsiveness of the UI
     *
     * Methode wird aufgerufen, wenn die Aktivität verfügbar für Benutzer-Interaktion.
     * In dieser Methode, in der Regel laufen Animationen/audio/video/run BroadcastReceiver benötigt
     * um UI-Logik/starten Sie die Ausführung von threads, etc.
     * die Methode sollte so leicht, für eine maximale Reaktionsfähigkeit der Benutzeroberfläche
     *
     */

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
    }

    /**
     *
     * method is called when the current activity loses focus but remains visible (the ascent of
     * the dialog box/partial overlap other activity, etc.)
     * this method is implemented by maintaining a lightweight UI data/animations/audio/video etc.)
     *
     * Methode wird aufgerufen, wenn die aktuelle Aktivität verliert den Fokus, bleibt aber sichtbar
     * (der Aufstieg der dialog-box/teilweise überlappung mit anderen Aktivitäten, usw.)
     * diese Methode wird implementiert, indem die Aufrechterhaltung einer leichten UI-Daten/Animation/audio/video usw.)
     *
     */


    @Override
    protected void onPause() {
        super.onPause();

         Log.d(TAG, "onPause");
    }

    /**
     *
     * method is invoked when the activity becomes invisible to the user. in this method occurs unsubscribing
     * from events, stop, complex animations, complex operations for saving data/interruption of threads running, etc.
     *
     *Methode wird aufgerufen, wenn die activity wird unsichtbar für den Benutzer.
     * in dieser Methode erfolgt Abmeldung von Veranstaltungen, stoppen, komplexe Animationen,
     * komplexe Vorgänge für das speichern von Daten/Unterbrechung von threads, und so weiter.
     *
     *
     */

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"onStop");
    }

    /**
     *
     *
     * method is called when the end of the work activity (when it occurs systemically, or after
     * call finish()
     *
     * Methode wird aufgerufen, wenn das Ende der Tätigkeit (wenn es Auftritt, systemisch,
     * oder nach Aufruf finish()
     *
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy");
    }

    /**
     *
     * method is called when the restart activiti/resume after call onStop()method
     * this method implements the specific business logic that should be realized when you restart
     * the activity - for example, the query to the server, which must be called when returning
     * from another activity (data updates, subscription to a particular event initialized on another
     * screen/specific business logic tied it to restart activity
     *
     *
     * Methode wird aufgerufen, wenn der Neustart activiti/resume nach Aufruf onStop () - Methode
     * diese Methode implementiert die spezifische business-Logik, die realisiert werden sollte,
     * wenn sie neu startet, die Aktivität - zum Beispiel, die Abfrage an den server, die angerufen werden muss,
     * bei der Rückkehr von einer anderen Aktivität (Daten-updates, das Abonnement eines bestimmten
     * Ereignisses initialisiert, auf einem anderen Bildschirm/spezifische business-Logik gebunden,
     * die es neu zu starten, activity
     *
     */

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart");
    }
}

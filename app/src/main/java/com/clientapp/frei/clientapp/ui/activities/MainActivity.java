package com.clientapp.frei.clientapp.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.clientapp.frei.clientapp.R;

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

    }
}

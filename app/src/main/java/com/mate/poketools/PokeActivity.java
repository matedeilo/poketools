package com.mate.poketools;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by mtejeda on 23/08/2016.
 */
public class PokeActivity extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            FlowManager.init(new FlowConfig.Builder(this)
                    .openDatabasesOnInit(true).build());

        }

}

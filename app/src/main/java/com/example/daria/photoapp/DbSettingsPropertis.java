package com.example.daria.photoapp;

import android.provider.BaseColumns;

final class DbSettingsPropertis {

    private DbSettingsPropertis() {}


    static class DbEntry implements BaseColumns {

        private DbEntry() {
        }

        static final String TABLE_NAME = "images";
        static final String ID = "id";
        static final String COLUMN_NAME = "image";


    }
}

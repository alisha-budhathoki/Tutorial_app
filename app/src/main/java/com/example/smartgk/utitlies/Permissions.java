package com.example.smartgk.utitlies;

import android.Manifest;


/**
 * Created by User on 7/10/2017.
 */

public class Permissions {
    private static final String TAG = "Permissions";


    public static final String[] PERMISSIONS = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
    };

    public static final String[] CAMERA_PERMISSION = {
            Manifest.permission.CAMERA
    };

    public static final String[] WRITE_STORAGE_PERMISSION = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static final String[] READ_STORAGE_PERMISSION = {
            Manifest.permission.READ_EXTERNAL_STORAGE
    };

    public static final String[] ACCESS_FINE_LOCATION = {
            Manifest.permission.ACCESS_FINE_LOCATION
    };


}

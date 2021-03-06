package com.example.codetribe.geofence;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by CodeTribe on 2017/11/24.
 */

public class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    static final float GEOFENCE_RADIUS_IN_METERS = 50; // 50 meters

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    static final HashMap<String, LatLng> CODETRIBE_AREA_LANDMARKS = new HashMap<>();

    static {
        //Tshwane.
        CODETRIBE_AREA_LANDMARKS.put("Tshwane", new LatLng(-25.7519042, 28.2631811));

        // Soweto.
        CODETRIBE_AREA_LANDMARKS.put("Soweto", new LatLng(-26.262048, 27.9481053));
    }
}

/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.xyztouristattractions.provider;

import android.net.Uri;

import com.example.android.xyztouristattractions.common.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_SYDNEY = "Sydney";

    public static final String TEST_CITY = CITY_SYDNEY;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_SYDNEY, new LatLng(-33.873651, 151.2068896));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_SYDNEY, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));



            add(new Attraction(
                    "School",
                    "School",
                    "",
                    Uri.parse("https://dashboard.esgindex.ai/pictures/School.jpg"),
                    Uri.parse("https://dashboard.esgindex.ai/pictures/School.jpg"),
                    new LatLng(37, 122),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Apple",
                    "Apple",
                    "",
                    Uri.parse("https://dashboard.esgindex.ai/pictures/Apple.jpg"),
                    Uri.parse("https://dashboard.esgindex.ai/pictures/Apple.jpg"),
                    new LatLng(38, 124),
                    CITY_SYDNEY
            ));
        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = 1;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}

package io.github.arahmandc.android.limabd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.LocationSettingsStatusCodes;


//Location code from
//https://github.com/Hkaps1997/Locations


public class MenuActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, View.OnClickListener{

    CardView poem, story, photos, birthday;


    private final static int SEND_SMS_PERMISSION_REQ=1;

    //location
    TextView latd, longtd, altd;
    boolean gpsCheck = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        poem = (CardView)findViewById(R.id.poemID);
        story = (CardView)findViewById(R.id.storyID);
        photos = (CardView)findViewById(R.id.photosID);
        birthday = (CardView)findViewById(R.id.birthdayID);


        poem.setOnClickListener(this);
        story.setOnClickListener(this);
        photos.setOnClickListener(this);
        birthday.setOnClickListener(this);




        //Location

        latd = (TextView) findViewById(R.id.latitude);
        longtd = (TextView) findViewById(R.id.longitude);
        altd = (TextView) findViewById(R.id.altitude);


        if (savedInstanceState != null) {

            gpsCheck=savedInstanceState.getBoolean("GPS");
            latd.setText(savedInstanceState.getString("latitude"));
            longtd.setText(savedInstanceState.getString("longitude"));
            altd.setText(savedInstanceState.getString("altitude"));


        }
        if (!gpsCheck) {
            EnableGPSAutoMatically();

        }
        final LocationManager locman = (LocationManager) getSystemService(LOCATION_SERVICE);
        //gives us the location services

        //to use these services we need a listner as given below


        final LocationListener loclis = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                //do something when location is changed

                Log.d("MA", "Latitude: " + location.getLatitude());
                Log.d("MA", "Longitude: " + location.getLongitude());
                Log.d("MA", "Altitude: " + location.getAltitude());


                latd.setText("Latitude:" + location.getLatitude());
                longtd.setText("Longitude:" + location.getLongitude());
                altd.setText("Altitude:" + location.getAltitude());


            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

                //do something when status is changed
                //status means from where the provider is getting its data
                //previous locations,current locations etc.

            }

            @Override
            public void onProviderEnabled(String provider) {

                //does something when provider is enabled

            }

            @Override
            public void onProviderDisabled(String provider) {
                //does something when provider is disabled

//                if(provider.equals(LocationManager.GPS_PROVIDER))
//                {
//
//                }
//

            }
        };

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(MenuActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 111);


            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        //we set the listner to the location manager


        locman.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 10, loclis);
        /*
        1st para=Provider i.e. from where are we getting our data; our phones network or gps?
        2nd para=time in milliseconds after which locations must be updated
        3rd para=distance in meters after which we want updating to occur
        4th para=locations listner
         */

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                if (latd.getText().toString().equals("")) {

                    if (ActivityCompat.checkSelfPermission(MenuActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MenuActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    locman.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 10, loclis);

                }
            }
        }.start();












//        buttonSend.setOnClickListener(this);
//        SMS SEND
//        when click birtday then automatically sent thanks sms.

        birthday.setEnabled(false);


        if(checkPermission(Manifest.permission.SEND_SMS))
        {
            birthday.setEnabled(true);
        }
        else
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_PERMISSION_REQ);

        }

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.poemID:

                Intent intentv = new Intent(MenuActivity.this,Poem.class);
                startActivity(intentv);
                break;
            case R.id.storyID:
                Intent intent = new Intent(MenuActivity.this,Story.class);
                startActivity(intent);
                break;
            case R.id.photosID:
                Intent intenta = new Intent(MenuActivity.this,Photos.class);
                startActivity(intenta);
                break;
            case R.id.birthdayID:



                // Auto location and sms send



                // this is fatch from string.xml
                String phoneNo = getString(R.string.phoneNo);
                // this is fatch from location
                String sms = ("Thank you.\n" +latd.getText().toString().substring(9)+","+longtd.getText().toString().substring(10));



                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null,sms, null, null);
                    Toast.makeText(MenuActivity.this, "Happy Birthday to You!",
                            Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(MenuActivity.this,
                            "faild, please turn on your location and try again later!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }


                Intent intents = new Intent(MenuActivity.this,Birtthday.class);
                startActivity(intents);
                break;

//                This is impliment on birthday
//
//
//            case R.id.buttonSend:
//                String phoneNo = getString(R.string.phoneNo);
//                String sms = getString(R.string.sms);
//                try {
//                    SmsManager smsManager = SmsManager.getDefault();
//                    smsManager.sendTextMessage(phoneNo, null,sms, null, null);
//                    Toast.makeText(MenuActivity.this, "SMS Sent!",
//                            Toast.LENGTH_LONG).show();
//                } catch (Exception e) {
//                    Toast.makeText(MenuActivity.this,
//                            "SMS faild, please try again later!",
//                            Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//                }
//            break;
        }

    }



//    sms send

    private boolean checkPermission(String sendSms) {

        int checkpermission= ContextCompat.checkSelfPermission(this,sendSms);
        return checkpermission== PackageManager.PERMISSION_GRANTED;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case SEND_SMS_PERMISSION_REQ:
                if(grantResults.length>0 &&(grantResults[0]==PackageManager.PERMISSION_GRANTED))
                {
                    birthday.setEnabled(true);
                }
                break;
//            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

//    Locaion

    private void EnableGPSAutoMatically() {
        GoogleApiClient googleApiClient = null;
        if (googleApiClient == null) {
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addApi(LocationServices.API).addConnectionCallbacks(MenuActivity.this)
                    .addOnConnectionFailedListener(MenuActivity.this).build();
            googleApiClient.connect();
            LocationRequest locationRequest = LocationRequest.create();
            locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
            locationRequest.setInterval(30 * 1000);
            locationRequest.setFastestInterval(5 * 1000);
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                    .addLocationRequest(locationRequest);

            builder.setAlwaysShow(true); // this is the key ingredient


            PendingResult<LocationSettingsResult> result = LocationServices.SettingsApi
                    .checkLocationSettings(googleApiClient, builder.build());
            result.setResultCallback(new ResultCallback<LocationSettingsResult>() {
                @Override
                public void onResult(LocationSettingsResult result) {
                    final Status status = result.getStatus();
                    final LocationSettingsStates state = result
                            .getLocationSettingsStates();
                    switch (status.getStatusCode()) {
                        case LocationSettingsStatusCodes.SUCCESS:

                            // All location settings are satisfied. The client can
                            // initialize location
                            // requests here.
                            break;
                        case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:

                            // Location settings are not satisfied. But could be
                            // fixed by showing the user
                            // a dialog.
                            try {
                                // Show the dialog by calling
                                // startResolutionForResult(),
                                // and check the result in onActivityResult().
                                status.startResolutionForResult(MenuActivity.this, 1000);

                            } catch (IntentSender.SendIntentException e) {
                                // Ignore the error.
                            }
                            break;
                        case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                            toast("Setting change not allowed");
                            // Location settings are not satisfied. However, we have
                            // no way to fix the
                            // settings so we won't show the dialog.
                            break;
                    }
                }
            });
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1000) {
            if (resultCode == Activity.RESULT_OK) {
                gpsCheck = true;
                String result = data.getStringExtra("result");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
                gpsCheck = false;
            }
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {
        toast("Suspended");
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        toast("Failed");
    }

    private void toast(String message) {
        try {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Log.d("MA", "Window has been closed");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putBoolean("GPS", gpsCheck);


        if (!latd.getText().toString().equals("")) {
            savedInstanceState.putString("latitude", latd.getText().toString());
            savedInstanceState.putString("longitude", longtd.getText().toString());
            savedInstanceState.putString("altitude", altd.getText().toString());
        }


        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }


//      This is not needed when other onRequestPermissionsResult exist

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//    }



}

package edu.miracostacollege.waterdoctor;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback
{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mMap = googleMap;

        // Adding markers
        LatLng marker1 = new LatLng(33.007422, -117.263206);
        LatLng marker2 = new LatLng(33.008062, -117.267216);
        LatLng marker3 = new LatLng(33.009389, -117.259105);
        LatLng marker4 = new LatLng(33.011341, -117.273986);
        LatLng marker5 = new LatLng(33.006159, -117.272656);
        LatLng marker6 = new LatLng(33.009567, -117.265340);
        LatLng marker7 = new LatLng(33.009387, -117.276519);
        LatLng marker8 = new LatLng(33.006962, -117.257885);
        LatLng marker9 = new LatLng(33.002103, -117.268545);
        LatLng marker10 = new LatLng(33.002697, -117.272257);
        LatLng marker11 = new LatLng(33.002193, -117.262837);

        // 33.008062  -117.267216

        CameraPosition position = new CameraPosition.Builder().target(marker1).zoom(15f).build();
        CameraUpdate update = CameraUpdateFactory.newCameraPosition(position);
        mMap.moveCamera(update);



        mMap.addMarker(new MarkerOptions().position(marker1).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker2).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker3).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker4).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker5).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker6).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker7).icon(BitmapDescriptorFactory.fromResource(R.drawable.danger_marker)));
        mMap.addMarker(new MarkerOptions().position(marker8).icon(BitmapDescriptorFactory.fromResource(R.drawable.safe_marker)));
        mMap.addMarker(new MarkerOptions().position(marker9).icon(BitmapDescriptorFactory.fromResource(R.drawable.safe_marker)));
        mMap.addMarker(new MarkerOptions().position(marker10).icon(BitmapDescriptorFactory.fromResource(R.drawable.safe_marker)));
        mMap.addMarker(new MarkerOptions().position(marker11).icon(BitmapDescriptorFactory.fromResource(R.drawable.safe_marker)));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(marker1));
    }
}

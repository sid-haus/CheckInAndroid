package io.github.saish1396.checkinandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class AndroidBarcodeActivityOneFragment extends Fragment {

    public AndroidBarcodeActivityOneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_android_barcode_activity_one, container, false);
    }
}

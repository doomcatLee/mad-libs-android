package com.doomcat.madlibs;

import android.os.Build;
import android.widget.TextView;

import com.doomcat.madlibs.BuildConfig;
import com.doomcat.madlibs.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView titleTextView = (TextView) activity.findViewById(R.id.titleTextView);
        assertTrue("MadLibs".equals(titleTextView.getText().toString()));
    }

//    @Test
//    public void secondActivityStarted() {
//        activity.findViewById(R.id.findRestaurantsButton).performClick();
//        Intent expectedIntent = new Intent(activity, RestaurantsActivity.class);
//        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
//        Intent actualIntent = shadowActivity.getNextStartedActivity();
//        assertTrue(actualIntent.filterEquals(expectedIntent));
//    }


}
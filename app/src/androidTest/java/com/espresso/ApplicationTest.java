package com.espresso;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
import android.test.ActivityInstrumentationTestCase2;

import java.io.IOException;


public class ApplicationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Before
    public void setup() throws IOException {

    }

    @After
    public void tearDown() throws IOException {
    }


    @Test
    public void testButtonToNextActivity(){
        Espresso.onView(ViewMatchers.withId(R.id.btn_go_second)).perform(ViewActions.click());
    }
}


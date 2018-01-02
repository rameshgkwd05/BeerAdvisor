package com.hfad.beeradvisor;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class FindBeerActivityTest {

    @Rule
    public ActivityTestRule<FindBeerActivity> mActivityTestRule = new ActivityTestRule<>(FindBeerActivity.class);

    @Test
    public void findBeerActivityTest() {
    }

}

package com.example.testing;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends TestCase {

    @Rule
    public ActivityScenarioRule<MainActivity> ActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    private String mName="Blackbytt";


    @Test
    public void testUserInputScenario()
    {
        ActivityScenario scenario=ActivityTestRule.getScenario();
        // input some text in the edit text
        Espresso.onView(withId(R.id.etTextToChange)).perform(typeText(mName));
        // close soft keyboard
        Espresso.closeSoftKeyboard();
        // perform button click
        Espresso.onView(withId(R.id.btnChange)).perform(click());
        // checking the text in the
        Espresso.onView(withId(R.id.tvChangedText)).check(matches(withText(mName)));
    }
}
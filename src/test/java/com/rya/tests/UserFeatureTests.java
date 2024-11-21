package com.rya.tests;

import com.intuit.karate.junit5.Karate;

public class UserFeatureTests {

    @Karate.Test
    Karate testUserFeature() {
        return Karate.run("features/User").relativeTo(getClass());
    }
}

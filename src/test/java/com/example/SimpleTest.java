package com.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class SimpleTest {

    @Test
    @Ignore
    public void test_should_fail() {
        fail();
    }
}

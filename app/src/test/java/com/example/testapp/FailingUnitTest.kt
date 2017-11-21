package com.example.testapp

import com.example.extensionlibrary.isEmptyExtension
import org.junit.Assert
import org.junit.Test

class FailingUnitTest {

    @Test fun extensionMethodFailsInDifferentModule() {
        Assert.assertTrue("".isEmptyExtension())
    }
}

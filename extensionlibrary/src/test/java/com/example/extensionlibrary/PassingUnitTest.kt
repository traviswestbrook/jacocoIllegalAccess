package com.example.extensionlibrary

import org.junit.Test

import org.junit.Assert.*

class PassingUnitTest {

    @Test
    fun passingExtensionTest() {
        assertTrue("".isEmptyExtension())
    }
}

/*
 * Copyright (c) 2020 Mastercard
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.zapp.library.merchant.test.pbbaapputils;

import com.zapp.library.merchant.util.PBBAAppUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

/**
 * Instrumented unit tests for PBBAAppUtils class.
 *
 * @author msagi
 */
@SuppressWarnings({"ProhibitedExceptionDeclared", "unused"})
@RunWith(AndroidJUnit4.class)
@SmallTest
public class IsCFIAppAvailableTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIsCFIAppAvailableNull() throws Exception {
        //noinspection ConstantConditions
        PBBAAppUtils.isCFIAppAvailable(/* context */ null);
    }

}
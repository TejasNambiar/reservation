package com.casestudy.reservation.util;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {NullChecks.class})
@ExtendWith(SpringExtension.class)
class NullChecksTest {
    @Autowired
    private NullChecks<Object> nullChecks;

    /**
     * Method under test: {@link NullChecks#insertionNullCheck(Object)}
     */
    @Test
    void testInsertionNullCheck() {
        assertFalse(nullChecks.insertionNullCheck("Object"));
    }
}


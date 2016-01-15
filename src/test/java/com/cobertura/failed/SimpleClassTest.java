package com.puppycrawl.tools.checkstyle.filters;

import com.cobertura.failed.ClassToTest;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by lee on 2016-01-15.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ClassToTest.class})
public class SimpleClassTest {
    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier
                .forClass(ClassToTest.class)
                .usingGetClass()
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }

    @Test
    public void addTest() {
        ClassToTest classToTest = new ClassToTest();
        classToTest.add(5,9);
    }
}

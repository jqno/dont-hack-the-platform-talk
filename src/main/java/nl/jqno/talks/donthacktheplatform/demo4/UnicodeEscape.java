package nl.jqno.talks.donthacktheplatform.demo4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicodeEscape {
    @Test
    public void passing() {
        // This test passes!                                                                                                                             Move along, nothing to see here! ;-)   \u000A if (true) return;
        assertEquals("true", "false");
    }
}

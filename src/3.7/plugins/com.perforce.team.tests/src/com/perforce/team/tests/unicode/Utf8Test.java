package com.perforce.team.tests.unicode;

/**
 * 
 * @author Kevin Sawicki (ksawicki@perforce.com)
 * 
 */
public class Utf8Test extends UnicodeTestCase {

    /**
     * @see com.perforce.team.tests.unicode.UnicodeTestCase#getP4Charset()
     */
    @Override
    protected String getP4Charset() {
        return "utf8";
    }

    /**
     * @see com.perforce.team.tests.unicode.UnicodeTestCase#getRawPath()
     */
    @Override
    protected String getRawPath() {
        return "//depot/charset_files/Unicode/UTF-8/always_utf8.txt";
    }

    /**
     * @see com.perforce.team.tests.unicode.UnicodeTestCase#getTranslatePath()
     */
    @Override
    protected String getTranslatePath() {
        return "//depot/charset_files/Unicode/UTF-8/translated.txt";
    }

}

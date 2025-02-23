/**
 * Copyright (c) 2010 Perforce Software.  All rights reserved.
 */
package com.perforce.team.ui.refactor;

import org.eclipse.osgi.util.NLS;

/**
 * @author Kevin Sawicki (ksawicki@perforce.com)
 */
public class Messages extends NLS {

    private static final String BUNDLE_NAME = "com.perforce.team.ui.refactor.messages"; //$NON-NLS-1$

    /**
     * MoveManager_CaseRenamesMessage
     */
    public static String MoveManager_CaseRenamesMessage;

    /**
     * MoveManager_CaseRenamesTitle
     */
    public static String MoveManager_CaseRenamesTitle;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}

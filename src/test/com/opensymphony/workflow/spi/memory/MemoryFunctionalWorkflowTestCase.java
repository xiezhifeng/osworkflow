/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.workflow.spi.memory;

import com.opensymphony.workflow.TestWorkflow;
import com.opensymphony.workflow.spi.BaseFunctionalWorkflow;


/**
 * This test case is functional in that it attempts to validate the entire
 * lifecycle of a workflow.  This is also a good resource for beginners
 * to OSWorkflow.
 *
 * @author Eric Pugh (epugh@upstate.com)
 */
public class MemoryFunctionalWorkflowTestCase extends BaseFunctionalWorkflow {
    //~ Constructors ///////////////////////////////////////////////////////////

    public MemoryFunctionalWorkflowTestCase(String s) {
        super(s);
    }

    //~ Methods ////////////////////////////////////////////////////////////////

    protected void setUp() throws Exception {
        MemoryWorkflowStore.reset();
        TestWorkflow.configFile = "/osworkflow.xml";
        super.setUp();
    }
}
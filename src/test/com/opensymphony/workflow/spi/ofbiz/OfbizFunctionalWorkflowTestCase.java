/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.workflow.spi.ofbiz;

import com.opensymphony.workflow.TestWorkflow;
import com.opensymphony.workflow.spi.BaseFunctionalWorkflowTest;
import com.opensymphony.workflow.spi.DatabaseHelper;


/**
 * @author Hani Suleiman (hani@formicary.net)
 * Date: Oct 4, 2003
 * Time: 1:57:25 AM
 */
public class OfbizFunctionalWorkflowTestCase extends BaseFunctionalWorkflowTest {
    //~ Constructors ///////////////////////////////////////////////////////////

    public OfbizFunctionalWorkflowTestCase(String s) {
        super(s);
    }

    //~ Methods ////////////////////////////////////////////////////////////////

    protected void setUp() throws Exception {
        DatabaseHelper.createDatabase("src/etc/deployment/ofbiz/mckoi.sql");
        TestWorkflow.configFile = "/osworkflow-ofbiz.xml";
        super.setUp();
    }
}

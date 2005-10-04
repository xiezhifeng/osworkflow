/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.workflow.spi.hibernate;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.opensymphony.workflow.Workflow;
import com.opensymphony.workflow.config.Configuration;
import com.opensymphony.workflow.spi.AbstractFunctionalWorkflowTest;
import com.opensymphony.workflow.util.DatabaseHelper;


/**
 * @author        Quake Wang
 * @since        2004-5-2
 *
 **/
public class NewSpringHibernateFunctionalWorkflowTestCase extends AbstractFunctionalWorkflowTest {
    //~ Constructors ///////////////////////////////////////////////////////////

    public NewSpringHibernateFunctionalWorkflowTestCase(String s) {
        super(s);
    }

    //~ Methods ////////////////////////////////////////////////////////////////

    protected void setUp() throws Exception {
        super.setUp();
        DatabaseHelper.runScript("", "jdbc/CreateDS");

        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("new-osworkflow-spring.xml"));
        
        workflow = (Workflow)beanFactory.getBean("workflow");
        workflow.setConfiguration((Configuration) beanFactory.getBean("osworkflowConfiguration"));
    }

    protected String getWorkflowName() {
        return "example";
    }
}
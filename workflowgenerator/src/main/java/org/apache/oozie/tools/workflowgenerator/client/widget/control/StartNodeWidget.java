/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.oozie.tools.workflowgenerator.client.widget.control;

import org.apache.oozie.tools.workflowgenerator.client.OozieWorkflowGenerator;
import org.apache.oozie.tools.workflowgenerator.client.widget.NodeWidget;

import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;

/**
 * Class for node widget of start node
 */
public class StartNodeWidget extends NodeWidget {

    /**
     * Constructor which records oozie workflow generator and initializes
     * property table
     *
     * @param gen oozieWorkflowGenerator
     */
    public StartNodeWidget(OozieWorkflowGenerator gen) {
        super(gen, "oozie-StartNodeWidget");
    }

    /**
     * Set a name of node widget (note that start node doesn't have name, making
     * it empty to avoid exception)
     */
    @Override
    public void setName(String s) {
    }

    /**
     * Update current lists of created node widgets when clicked in workflow
     * design panel
     */
    @Override
    public void updateOnSelection() {
        table.updateWidgetDropDown();
    }

    /**
     * Generate xml elements of start node and attach them to xml doc
     */
    @Override
    public void generateXML(Document doc, Element root, NodeWidget next) {
        Element startele = doc.createElement("start");
        startele.setAttribute("to", next.getName());
        root.appendChild(startele);
    }

}

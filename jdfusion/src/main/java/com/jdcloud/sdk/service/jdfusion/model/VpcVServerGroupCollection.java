/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vpcVServerGroupCollection
 */
public class VpcVServerGroupCollection  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * vserverGroups
     */
    private List<VserverGroupInfo> vserverGroups;


    /**
     * get vserverGroups
     *
     * @return
     */
    public List<VserverGroupInfo> getVserverGroups() {
        return vserverGroups;
    }

    /**
     * set vserverGroups
     *
     * @param vserverGroups
     */
    public void setVserverGroups(List<VserverGroupInfo> vserverGroups) {
        this.vserverGroups = vserverGroups;
    }


    /**
     * set vserverGroups
     *
     * @param vserverGroups
     */
    public VpcVServerGroupCollection vserverGroups(List<VserverGroupInfo> vserverGroups) {
        this.vserverGroups = vserverGroups;
        return this;
    }


    /**
     * add item to vserverGroups
     *
     * @param vserverGroup
     */
    public void addVserverGroup(VserverGroupInfo vserverGroup) {
        if (this.vserverGroups == null) {
            this.vserverGroups = new ArrayList<>();
        }
        this.vserverGroups.add(vserverGroup);
    }

}
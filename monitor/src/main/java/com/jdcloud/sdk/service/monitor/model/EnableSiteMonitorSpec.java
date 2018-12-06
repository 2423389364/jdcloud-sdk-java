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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * enableSiteMonitorSpec
 */
public class EnableSiteMonitorSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * list
     */
    private List<EnableSiteMonitorReqItem> list;


    /**
     * get list
     *
     * @return
     */
    public List<EnableSiteMonitorReqItem> getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(List<EnableSiteMonitorReqItem> list) {
        this.list = list;
    }


    /**
     * set list
     *
     * @param list
     */
    public EnableSiteMonitorSpec list(List<EnableSiteMonitorReqItem> list) {
        this.list = list;
        return this;
    }


    /**
     * add item to list
     *
     * @param list
     */
    public void addList(EnableSiteMonitorReqItem list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}
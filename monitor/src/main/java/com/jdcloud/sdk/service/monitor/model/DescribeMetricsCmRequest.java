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
 * CustomMetric APIs
 * 自定义监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询自定义监控的metric列表
 */
public class DescribeMetricsCmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * region
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * namespaceUID
     * Required:true
     */
    @Required
    private String namespaceUID;

    /**
     * objUID
     * Required:true
     */
    @Required
    private String objUID;


    /**
     * get region
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get namespaceUID
     *
     * @return
     */
    public String getNamespaceUID() {
        return namespaceUID;
    }

    /**
     * set namespaceUID
     *
     * @param namespaceUID
     */
    public void setNamespaceUID(String namespaceUID) {
        this.namespaceUID = namespaceUID;
    }

    /**
     * get objUID
     *
     * @return
     */
    public String getObjUID() {
        return objUID;
    }

    /**
     * set objUID
     *
     * @param objUID
     */
    public void setObjUID(String objUID) {
        this.objUID = objUID;
    }


    /**
     * set region
     *
     * @param regionId
     */
    public DescribeMetricsCmRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set namespaceUID
     *
     * @param namespaceUID
     */
    public DescribeMetricsCmRequest namespaceUID(String namespaceUID) {
        this.namespaceUID = namespaceUID;
        return this;
    }

    /**
     * set objUID
     *
     * @param objUID
     */
    public DescribeMetricsCmRequest objUID(String objUID) {
        this.objUID = objUID;
        return this;
    }


}
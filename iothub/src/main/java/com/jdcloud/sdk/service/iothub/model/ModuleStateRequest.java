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
 * 设备生命周期管理
 * 用于完成设备全生命周期管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 客户用该接口可以修改模块预期状态

 */
public class ModuleStateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * states
     */
    private String states;

    /**
     * moduleName 唯一标识
     * Required:true
     */
    @Required
    private String moduleName;


    /**
     * get states
     *
     * @return
     */
    public String getStates() {
        return states;
    }

    /**
     * set states
     *
     * @param states
     */
    public void setStates(String states) {
        this.states = states;
    }

    /**
     * get moduleName 唯一标识
     *
     * @return
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * set moduleName 唯一标识
     *
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * set states
     *
     * @param states
     */
    public ModuleStateRequest states(String states) {
        this.states = states;
        return this;
    }

    /**
     * set moduleName 唯一标识
     *
     * @param moduleName
     */
    public ModuleStateRequest moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }


}
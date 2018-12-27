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
 * Vpc-VserverGroup
 * 与服务器组相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.service.jdfusion.model.ResourceTFInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建虚拟服务器组，并添加后端服务器
 */
public class CreateVpcVServerGroupResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * task
     */
    private ResourceTFInfo task;


    /**
     * get task
     *
     * @return
     */
    public ResourceTFInfo getTask() {
        return task;
    }

    /**
     * set task
     *
     * @param task
     */
    public void setTask(ResourceTFInfo task) {
        this.task = task;
    }


    /**
     * set task
     *
     * @param task
     */
    public CreateVpcVServerGroupResult task(ResourceTFInfo task) {
        this.task = task;
        return this;
    }


}
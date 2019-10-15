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
 * 分布式云物理服务器
 * 分布式云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询分布式云物理服务器名称
 */
public class DescribeInstanceNameResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分布式云物理服务器名称
     */
    private String name;


    /**
     * get 分布式云物理服务器名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 分布式云物理服务器名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set 分布式云物理服务器名称
     *
     * @param name
     */
    public DescribeInstanceNameResult name(String name) {
        this.name = name;
        return this;
    }


}
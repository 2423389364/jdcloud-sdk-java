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


/**
 * 子网属性信息
 */
public class SubnetDesInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Subnet的Id
     */
    private String id;

    /**
     * 子网名称
     */
    private String name;

    /**
     * 子网所属VPC的Id
     */
    private String vpcId;

    /**
     * 子网网段
     */
    private String cidrBlock;

    /**
     * 子网描述信息
     */
    private String description;

    /**
     * 子网所属可用域Id
     */
    private String az;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 所属云提供商ID
     */
    private String cloudID;


    /**
     * get Subnet的Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set Subnet的Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 子网名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 子网所属VPC的Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 子网所属VPC的Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网网段
     *
     * @return
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * set 子网网段
     *
     * @param cidrBlock
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * get 子网描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 子网描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 子网所属可用域Id
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 子网所属可用域Id
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }


    /**
     * set Subnet的Id
     *
     * @param id
     */
    public SubnetDesInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param name
     */
    public SubnetDesInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 子网所属VPC的Id
     *
     * @param vpcId
     */
    public SubnetDesInfo vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网网段
     *
     * @param cidrBlock
     */
    public SubnetDesInfo cidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * set 子网描述信息
     *
     * @param description
     */
    public SubnetDesInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 子网所属可用域Id
     *
     * @param az
     */
    public SubnetDesInfo az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public SubnetDesInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public SubnetDesInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }


}
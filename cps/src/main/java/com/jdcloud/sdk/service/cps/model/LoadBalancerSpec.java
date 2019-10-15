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

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * loadBalancerSpec
 */
public class LoadBalancerSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 网络类型，取值public
     * Required:true
     */
    @Required
    private String netType;

    /**
     * 负载均衡实例的IP版本，取值ipv4
     * Required:true
     */
    @Required
    private String ipAddressType;

    /**
     * 私有网络ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否申请弹性公网Ip
     * Required:true
     */
    @Required
    private Boolean applyElasticIp;

    /**
     * 带宽
     * Required:true
     */
    @Required
    private Integer bandwidth;

    /**
     * 计费配置
     * Required:true
     */
    @Required
    private ChargeSpec charge;


    /**
     * get 网络类型，取值public
     *
     * @return
     */
    public String getNetType() {
        return netType;
    }

    /**
     * set 网络类型，取值public
     *
     * @param netType
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }

    /**
     * get 负载均衡实例的IP版本，取值ipv4
     *
     * @return
     */
    public String getIpAddressType() {
        return ipAddressType;
    }

    /**
     * set 负载均衡实例的IP版本，取值ipv4
     *
     * @param ipAddressType
     */
    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 是否申请弹性公网Ip
     *
     * @return
     */
    public Boolean getApplyElasticIp() {
        return applyElasticIp;
    }

    /**
     * set 是否申请弹性公网Ip
     *
     * @param applyElasticIp
     */
    public void setApplyElasticIp(Boolean applyElasticIp) {
        this.applyElasticIp = applyElasticIp;
    }

    /**
     * get 带宽
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }


    /**
     * set 网络类型，取值public
     *
     * @param netType
     */
    public LoadBalancerSpec netType(String netType) {
        this.netType = netType;
        return this;
    }

    /**
     * set 负载均衡实例的IP版本，取值ipv4
     *
     * @param ipAddressType
     */
    public LoadBalancerSpec ipAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public LoadBalancerSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public LoadBalancerSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public LoadBalancerSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 是否申请弹性公网Ip
     *
     * @param applyElasticIp
     */
    public LoadBalancerSpec applyElasticIp(Boolean applyElasticIp) {
        this.applyElasticIp = applyElasticIp;
        return this;
    }

    /**
     * set 带宽
     *
     * @param bandwidth
     */
    public LoadBalancerSpec bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public LoadBalancerSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }


}
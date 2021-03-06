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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kubernetes.model.AddonConfigSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置集群组件
 */
public class SetAddonsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要设置的集群组件配置
     * Required:true
     */
    @Required
    private List<AddonConfigSpec> addonsConfig;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 集群 ID
     * Required:true
     */
    @Required
    private String clusterId;


    /**
     * get 需要设置的集群组件配置
     *
     * @return
     */
    public List<AddonConfigSpec> getAddonsConfig() {
        return addonsConfig;
    }

    /**
     * set 需要设置的集群组件配置
     *
     * @param addonsConfig
     */
    public void setAddonsConfig(List<AddonConfigSpec> addonsConfig) {
        this.addonsConfig = addonsConfig;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 集群 ID
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    /**
     * set 需要设置的集群组件配置
     *
     * @param addonsConfig
     */
    public SetAddonsRequest addonsConfig(List<AddonConfigSpec> addonsConfig) {
        this.addonsConfig = addonsConfig;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public SetAddonsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public SetAddonsRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }


    /**
     * add item to 需要设置的集群组件配置
     *
     * @param addonsConfig
     */
    public void addAddonsConfig(AddonConfigSpec addonsConfig) {
        if (this.addonsConfig == null) {
            this.addonsConfig = new ArrayList<>();
        }
        this.addonsConfig.add(addonsConfig);
    }

}
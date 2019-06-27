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
 * Select options
 * The api for user selected options
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pipeline.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 可选地域
 */
public class GetRegionsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源提供商类型
     */
    private String type;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 源提供商类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 源提供商类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 源提供商类型
     *
     * @param type
     */
    public GetRegionsRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public GetRegionsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
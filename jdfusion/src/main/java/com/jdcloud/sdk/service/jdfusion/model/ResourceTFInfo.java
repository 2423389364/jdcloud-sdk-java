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
 * 创建资源tf信息
 */
public class ResourceTFInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * uuid
     */
    private String uuid;

    /**
     * 请求体
     */
    private String body;

    /**
     * 状态
     */
    private String status;

    /**
     * 执行结果
     */
    private String result;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * cloud provider
     */
    private String provider;

    /**
     * cloud ID
     */
    private String cloudId;

    /**
     * user ID
     */
    private String userId;


    /**
     * get uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 请求体
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    /**
     * set 请求体
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 执行结果
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * set 执行结果
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
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
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get cloud provider
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set cloud provider
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * get cloud ID
     *
     * @return
     */
    public String getCloudId() {
        return cloudId;
    }

    /**
     * set cloud ID
     *
     * @param cloudId
     */
    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    /**
     * get user ID
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set user ID
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * set uuid
     *
     * @param uuid
     */
    public ResourceTFInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 请求体
     *
     * @param body
     */
    public ResourceTFInfo body(String body) {
        this.body = body;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public ResourceTFInfo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 执行结果
     *
     * @param result
     */
    public ResourceTFInfo result(String result) {
        this.result = result;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public ResourceTFInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public ResourceTFInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set cloud provider
     *
     * @param provider
     */
    public ResourceTFInfo provider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * set cloud ID
     *
     * @param cloudId
     */
    public ResourceTFInfo cloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * set user ID
     *
     * @param userId
     */
    public ResourceTFInfo userId(String userId) {
        this.userId = userId;
        return this;
    }


}
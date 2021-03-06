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

package com.jdcloud.sdk.service.mongodb.model;


/**
 * backupSynchronicity
 */
public class BackupSynchronicity  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 跨地域备份同步服务ID
     */
    private String serviceId;

    /**
     * MongoDB 实例ID
     */
    private String instanceId;

    /**
     * MongoDB 实例名称
     */
    private String instanceName;

    /**
     * 跨地域备份同步服务状态，正常，running；错误，error
     */
    private String serviceStatus;

    /**
     * 源实例所在地域
     */
    private String srcRegion;

    /**
     * 跨地域备份同步服务的目的地域
     */
    private String dstRegion;

    /**
     * 数据库类型
     */
    private String engine;

    /**
     * 数据库版本
     */
    private String engineVersion;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 跨地域备份的最新数据时间点
     */
    private String newestDataTime;


    /**
     * get 跨地域备份同步服务ID
     *
     * @return
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * set 跨地域备份同步服务ID
     *
     * @param serviceId
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * get MongoDB 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set MongoDB 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get MongoDB 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set MongoDB 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 跨地域备份同步服务状态，正常，running；错误，error
     *
     * @return
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * set 跨地域备份同步服务状态，正常，running；错误，error
     *
     * @param serviceStatus
     */
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * get 源实例所在地域
     *
     * @return
     */
    public String getSrcRegion() {
        return srcRegion;
    }

    /**
     * set 源实例所在地域
     *
     * @param srcRegion
     */
    public void setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
    }

    /**
     * get 跨地域备份同步服务的目的地域
     *
     * @return
     */
    public String getDstRegion() {
        return dstRegion;
    }

    /**
     * set 跨地域备份同步服务的目的地域
     *
     * @param dstRegion
     */
    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    /**
     * get 数据库类型
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 数据库类型
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 数据库版本
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 数据库版本
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 跨地域备份的最新数据时间点
     *
     * @return
     */
    public String getNewestDataTime() {
        return newestDataTime;
    }

    /**
     * set 跨地域备份的最新数据时间点
     *
     * @param newestDataTime
     */
    public void setNewestDataTime(String newestDataTime) {
        this.newestDataTime = newestDataTime;
    }


    /**
     * set 跨地域备份同步服务ID
     *
     * @param serviceId
     */
    public BackupSynchronicity serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * set MongoDB 实例ID
     *
     * @param instanceId
     */
    public BackupSynchronicity instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set MongoDB 实例名称
     *
     * @param instanceName
     */
    public BackupSynchronicity instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 跨地域备份同步服务状态，正常，running；错误，error
     *
     * @param serviceStatus
     */
    public BackupSynchronicity serviceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     * set 源实例所在地域
     *
     * @param srcRegion
     */
    public BackupSynchronicity srcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }

    /**
     * set 跨地域备份同步服务的目的地域
     *
     * @param dstRegion
     */
    public BackupSynchronicity dstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
        return this;
    }

    /**
     * set 数据库类型
     *
     * @param engine
     */
    public BackupSynchronicity engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 数据库版本
     *
     * @param engineVersion
     */
    public BackupSynchronicity engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public BackupSynchronicity createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 跨地域备份的最新数据时间点
     *
     * @param newestDataTime
     */
    public BackupSynchronicity newestDataTime(String newestDataTime) {
        this.newestDataTime = newestDataTime;
        return this;
    }


}
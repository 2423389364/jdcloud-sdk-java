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

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * reinstallInstanceSpec
 */
public class ReinstallInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用区, 如cn-east-tz1a
     * Required:true
     */
    @Required
    private String az;

    /**
     * 镜像类型, 取值范围：standard
     * Required:true
     */
    @Required
    private String imageType;

    /**
     * 操作系统类型ID
     * Required:true
     */
    @Required
    private String osTypeId;

    /**
     * 系统盘RAID类型ID
     * Required:true
     */
    @Required
    private String sysRaidTypeId;

    /**
     * 是否保留数据盘数据, 取值为：yes、no
     * Required:true
     */
    @Required
    private String keepData;

    /**
     * 数据盘RAID类型ID
     * Required:true
     */
    @Required
    private String dataRaidTypeId;

    /**
     * 密码
     * Required:true
     */
    @Required
    private String password;

    /**
     * 主机名
     */
    private String hostname;

    /**
     * 可执行脚本Base64编码后的内容，支持shell和python脚本
     */
    private String userData;

    /**
     * 密钥对id
     */
    private String keypairId;


    /**
     * get 可用区, 如cn-east-tz1a
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如cn-east-tz1a
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 镜像类型, 取值范围：standard
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型, 取值范围：standard
     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * get 操作系统类型ID
     *
     * @return
     */
    public String getOsTypeId() {
        return osTypeId;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public void setOsTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
    }

    /**
     * get 系统盘RAID类型ID
     *
     * @return
     */
    public String getSysRaidTypeId() {
        return sysRaidTypeId;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public void setSysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
    }

    /**
     * get 是否保留数据盘数据, 取值为：yes、no
     *
     * @return
     */
    public String getKeepData() {
        return keepData;
    }

    /**
     * set 是否保留数据盘数据, 取值为：yes、no
     *
     * @param keepData
     */
    public void setKeepData(String keepData) {
        this.keepData = keepData;
    }

    /**
     * get 数据盘RAID类型ID
     *
     * @return
     */
    public String getDataRaidTypeId() {
        return dataRaidTypeId;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public void setDataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
    }

    /**
     * get 密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 主机名
     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 主机名
     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * get 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @return
     */
    public String getUserData() {
        return userData;
    }

    /**
     * set 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @param userData
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * get 密钥对id
     *
     * @return
     */
    public String getKeypairId() {
        return keypairId;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }


    /**
     * set 可用区, 如cn-east-tz1a
     *
     * @param az
     */
    public ReinstallInstanceSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 镜像类型, 取值范围：standard
     *
     * @param imageType
     */
    public ReinstallInstanceSpec imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public ReinstallInstanceSpec osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public ReinstallInstanceSpec sysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
        return this;
    }

    /**
     * set 是否保留数据盘数据, 取值为：yes、no
     *
     * @param keepData
     */
    public ReinstallInstanceSpec keepData(String keepData) {
        this.keepData = keepData;
        return this;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public ReinstallInstanceSpec dataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
        return this;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public ReinstallInstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 主机名
     *
     * @param hostname
     */
    public ReinstallInstanceSpec hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * set 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @param userData
     */
    public ReinstallInstanceSpec userData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public ReinstallInstanceSpec keypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }


}
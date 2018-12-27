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
 * Image
 * 容器镜像服务镜像相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.containerregistry.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除镜像
imageDigest imageTag imageTagStatus 三者只能且必须传一个。
可根据Tag状态删除Image，例如删除所有tagged的镜像。
digest和tag唯一表征单个镜像，其中imageDigest为sha256哈希，image manifest的digest。
例如 sha256:examplee6d1e504117a17000003d3753086354a38375961f2e665416ef4b1b2f；image使用的tag, 如  &quot;precise&quot; 

 */
public class DeleteImageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sha256哈希，image manifest的digest.
     */
    private String imageDigest;

    /**
     * image使用的tag
     */
    private String imageTag;

    /**
     * 枚举中的一个值，如 tagged 和 untagged.
     */
    private String imageTagStatus;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 注册表名称
     * Required:true
     */
    @Required
    private String registryName;

    /**
     * 镜像仓库表名称
     * Required:true
     */
    @Required
    private String repositoryName;


    /**
     * get sha256哈希，image manifest的digest.
     *
     * @return
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * set sha256哈希，image manifest的digest.
     *
     * @param imageDigest
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * get image使用的tag
     *
     * @return
     */
    public String getImageTag() {
        return imageTag;
    }

    /**
     * set image使用的tag
     *
     * @param imageTag
     */
    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * get 枚举中的一个值，如 tagged 和 untagged.
     *
     * @return
     */
    public String getImageTagStatus() {
        return imageTagStatus;
    }

    /**
     * set 枚举中的一个值，如 tagged 和 untagged.
     *
     * @param imageTagStatus
     */
    public void setImageTagStatus(String imageTagStatus) {
        this.imageTagStatus = imageTagStatus;
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
     * get 注册表名称
     *
     * @return
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * get 镜像仓库表名称
     *
     * @return
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * set 镜像仓库表名称
     *
     * @param repositoryName
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }


    /**
     * set sha256哈希，image manifest的digest.
     *
     * @param imageDigest
     */
    public DeleteImageRequest imageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * set image使用的tag
     *
     * @param imageTag
     */
    public DeleteImageRequest imageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    /**
     * set 枚举中的一个值，如 tagged 和 untagged.
     *
     * @param imageTagStatus
     */
    public DeleteImageRequest imageTagStatus(String imageTagStatus) {
        this.imageTagStatus = imageTagStatus;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteImageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public DeleteImageRequest registryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * set 镜像仓库表名称
     *
     * @param repositoryName
     */
    public DeleteImageRequest repositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }


}
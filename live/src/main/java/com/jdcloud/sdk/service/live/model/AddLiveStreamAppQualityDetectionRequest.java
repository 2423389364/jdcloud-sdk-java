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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加应用质量检测配置
- 添加应用级别的质量检测模板配置

 */
public class AddLiveStreamAppQualityDetectionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 质量检测模板

     * Required:true
     */
    @Required
    private String template;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 质量检测模板

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 质量检测模板

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public AddLiveStreamAppQualityDetectionRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public AddLiveStreamAppQualityDetectionRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 质量检测模板

     *
     * @param template
     */
    public AddLiveStreamAppQualityDetectionRequest template(String template) {
        this.template = template;
        return this;
    }


}
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
 * Live API
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
 * 添加直播域名
 */
public class AddLiveDomainRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 直播的推流域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 直播的播放域名
     * Required:true
     */
    @Required
    private String playDomain;

    /**
     * 区域ID
     * Required:true
     */
    @Required
    private String region;


    /**
     * get 直播的推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 直播的推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 直播的播放域名
     *
     * @return
     */
    public String getPlayDomain() {
        return playDomain;
    }

    /**
     * set 直播的播放域名
     *
     * @param playDomain
     */
    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    /**
     * get 区域ID
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域ID
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * set 直播的推流域名
     *
     * @param publishDomain
     */
    public AddLiveDomainRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 直播的播放域名
     *
     * @param playDomain
     */
    public AddLiveDomainRequest playDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * set 区域ID
     *
     * @param region
     */
    public AddLiveDomainRequest region(String region) {
        this.region = region;
        return this;
    }


}
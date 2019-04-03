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
 * 设置播放鉴权KEY
 */
public class SetLivePlayAuthKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 播放域名
     * Required:true
     */
    @Required
    private String playDomain;

    /**
     * 播放鉴权状态
  on: 开启
  off: 关闭
- 当推流鉴权状态on(开启)时,authKey不能为空

     */
    private String authStatus;

    /**
     * 播放鉴权key
- 取值: 支持大小写字母和数字 长度6-32位

     */
    private String authKey;


    /**
     * get 播放域名
     *
     * @return
     */
    public String getPlayDomain() {
        return playDomain;
    }

    /**
     * set 播放域名
     *
     * @param playDomain
     */
    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    /**
     * get 播放鉴权状态
  on: 开启
  off: 关闭
- 当推流鉴权状态on(开启)时,authKey不能为空

     *
     * @return
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * set 播放鉴权状态
  on: 开启
  off: 关闭
- 当推流鉴权状态on(开启)时,authKey不能为空

     *
     * @param authStatus
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * get 播放鉴权key
- 取值: 支持大小写字母和数字 长度6-32位

     *
     * @return
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * set 播放鉴权key
- 取值: 支持大小写字母和数字 长度6-32位

     *
     * @param authKey
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }


    /**
     * set 播放域名
     *
     * @param playDomain
     */
    public SetLivePlayAuthKeyRequest playDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * set 播放鉴权状态
  on: 开启
  off: 关闭
- 当推流鉴权状态on(开启)时,authKey不能为空

     *
     * @param authStatus
     */
    public SetLivePlayAuthKeyRequest authStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * set 播放鉴权key
- 取值: 支持大小写字母和数字 长度6-32位

     *
     * @param authKey
     */
    public SetLivePlayAuthKeyRequest authKey(String authKey) {
        this.authKey = authKey;
        return this;
    }


}
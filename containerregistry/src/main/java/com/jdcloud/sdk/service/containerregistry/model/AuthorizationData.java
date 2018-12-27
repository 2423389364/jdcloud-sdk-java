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

package com.jdcloud.sdk.service.containerregistry.model;


/**
 * authorizationData
 */
public class AuthorizationData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 基于base64编码的字符串，包含指定JCR registry的授权信息。解码后可用于docker login。
     */
    private String authorizationToken;

    /**
     * 用户直接使用的docker login 命令行
     */
    private String loginCmdLine;

    /**
     * Unix 时钟，记录authorization token的过期时间。默认Authorization tokens有效期为12小时。
     */
    private String expiresAt;


    /**
     * get 基于base64编码的字符串，包含指定JCR registry的授权信息。解码后可用于docker login。
     *
     * @return
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * set 基于base64编码的字符串，包含指定JCR registry的授权信息。解码后可用于docker login。
     *
     * @param authorizationToken
     */
    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * get 用户直接使用的docker login 命令行
     *
     * @return
     */
    public String getLoginCmdLine() {
        return loginCmdLine;
    }

    /**
     * set 用户直接使用的docker login 命令行
     *
     * @param loginCmdLine
     */
    public void setLoginCmdLine(String loginCmdLine) {
        this.loginCmdLine = loginCmdLine;
    }

    /**
     * get Unix 时钟，记录authorization token的过期时间。默认Authorization tokens有效期为12小时。
     *
     * @return
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * set Unix 时钟，记录authorization token的过期时间。默认Authorization tokens有效期为12小时。
     *
     * @param expiresAt
     */
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }


    /**
     * set 基于base64编码的字符串，包含指定JCR registry的授权信息。解码后可用于docker login。
     *
     * @param authorizationToken
     */
    public AuthorizationData authorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    /**
     * set 用户直接使用的docker login 命令行
     *
     * @param loginCmdLine
     */
    public AuthorizationData loginCmdLine(String loginCmdLine) {
        this.loginCmdLine = loginCmdLine;
        return this;
    }

    /**
     * set Unix 时钟，记录authorization token的过期时间。默认Authorization tokens有效期为12小时。
     *
     * @param expiresAt
     */
    public AuthorizationData expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }


}
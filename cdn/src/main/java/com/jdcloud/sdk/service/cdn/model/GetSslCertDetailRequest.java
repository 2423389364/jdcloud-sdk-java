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
 * SSL Certificate
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看证书详情
 */
public class GetSslCertDetailRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书 Id
     * Required:true
     */
    @Required
    private String sslCertId;


    /**
     * get 证书 Id
     *
     * @return
     */
    public String getSslCertId() {
        return sslCertId;
    }

    /**
     * set 证书 Id
     *
     * @param sslCertId
     */
    public void setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
    }


    /**
     * set 证书 Id
     *
     * @param sslCertId
     */
    public GetSslCertDetailRequest sslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }


}
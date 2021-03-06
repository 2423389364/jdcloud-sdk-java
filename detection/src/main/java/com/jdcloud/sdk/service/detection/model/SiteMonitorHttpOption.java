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

package com.jdcloud.sdk.service.detection.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * siteMonitorHttpOption
 */
public class SiteMonitorHttpOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cookie
     */
    private Object cookie;

    /**
     * header
     */
    private Object header;

    /**
     * 请求方法，可选值：GET、POST、HEAD
     * Required:true
     */
    @Required
    private String method;

    /**
     * 请求内容
     */
    private String reqContent;

    /**
     * 返回校验内容
     */
    private String resCheck;

    /**
     * 返回校验方式，可选值：match、notmatch
     */
    private String resCheckType;


    /**
     * get cookie
     *
     * @return
     */
    public Object getCookie() {
        return cookie;
    }

    /**
     * set cookie
     *
     * @param cookie
     */
    public void setCookie(Object cookie) {
        this.cookie = cookie;
    }

    /**
     * get header
     *
     * @return
     */
    public Object getHeader() {
        return header;
    }

    /**
     * set header
     *
     * @param header
     */
    public void setHeader(Object header) {
        this.header = header;
    }

    /**
     * get 请求方法，可选值：GET、POST、HEAD
     *
     * @return
     */
    public String getMethod() {
        return method;
    }

    /**
     * set 请求方法，可选值：GET、POST、HEAD
     *
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * get 请求内容
     *
     * @return
     */
    public String getReqContent() {
        return reqContent;
    }

    /**
     * set 请求内容
     *
     * @param reqContent
     */
    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    /**
     * get 返回校验内容
     *
     * @return
     */
    public String getResCheck() {
        return resCheck;
    }

    /**
     * set 返回校验内容
     *
     * @param resCheck
     */
    public void setResCheck(String resCheck) {
        this.resCheck = resCheck;
    }

    /**
     * get 返回校验方式，可选值：match、notmatch
     *
     * @return
     */
    public String getResCheckType() {
        return resCheckType;
    }

    /**
     * set 返回校验方式，可选值：match、notmatch
     *
     * @param resCheckType
     */
    public void setResCheckType(String resCheckType) {
        this.resCheckType = resCheckType;
    }


    /**
     * set cookie
     *
     * @param cookie
     */
    public SiteMonitorHttpOption cookie(Object cookie) {
        this.cookie = cookie;
        return this;
    }

    /**
     * set header
     *
     * @param header
     */
    public SiteMonitorHttpOption header(Object header) {
        this.header = header;
        return this;
    }

    /**
     * set 请求方法，可选值：GET、POST、HEAD
     *
     * @param method
     */
    public SiteMonitorHttpOption method(String method) {
        this.method = method;
        return this;
    }

    /**
     * set 请求内容
     *
     * @param reqContent
     */
    public SiteMonitorHttpOption reqContent(String reqContent) {
        this.reqContent = reqContent;
        return this;
    }

    /**
     * set 返回校验内容
     *
     * @param resCheck
     */
    public SiteMonitorHttpOption resCheck(String resCheck) {
        this.resCheck = resCheck;
        return this;
    }

    /**
     * set 返回校验方式，可选值：match、notmatch
     *
     * @param resCheckType
     */
    public SiteMonitorHttpOption resCheckType(String resCheckType) {
        this.resCheckType = resCheckType;
        return this;
    }


}
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
 * jdx订单交付相关接口
 * jdx订单交付相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.elite.model;

import com.jdcloud.sdk.service.elite.model.QueryDeliveryInfoResultVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询交付信息接口
 */
public class JdxQueryDeliveryInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true为成功，false为失败
     */
    private Boolean status;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 查询数据结果
     */
    private QueryDeliveryInfoResultVo data;


    /**
     * get true为成功，false为失败
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 描述信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 查询数据结果
     *
     * @return
     */
    public QueryDeliveryInfoResultVo getData() {
        return data;
    }

    /**
     * set 查询数据结果
     *
     * @param data
     */
    public void setData(QueryDeliveryInfoResultVo data) {
        this.data = data;
    }


    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public JdxQueryDeliveryInfoResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public JdxQueryDeliveryInfoResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 查询数据结果
     *
     * @param data
     */
    public JdxQueryDeliveryInfoResult data(QueryDeliveryInfoResultVo data) {
        this.data = data;
        return this;
    }


}
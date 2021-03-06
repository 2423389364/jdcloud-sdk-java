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
 * 相关接口
 * API related to order
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.order.model;


/**
 * orderResponseObject
 */
public class OrderResponseObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单应付金额
     */
    private Number actualFee;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 业务名称
     */
    private String appName;

    /**
     * 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     */
    private String chargeMode;

    /**
     * 订单创建时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String createTime;

    /**
     * 折扣金额
     */
    private Number discountFee;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 购买订单类型(NEW-新购,RENEW-续费，RESIZE_FORMULA-配置变更)
     */
    private String orderType;

    /**
     * 订单支付时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String payTime;

    /**
     * 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     */
    private String payType;

    /**
     * 订单号
     */
    private String paymentNumber;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 自营类型(SELF_SUPPORT-自营,THIRD_PARTY_SUPPORT-非自营)
     */
    private String selfSupportType;

    /**
     * 产品线名称
     */
    private String serviceName;

    /**
     * 订单状态（PAID-已支付,FAILED-失败,NO_PAY-未支付,DEALING-处理中,CANCELED-已取消,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     */
    private String status;

    /**
     * 订单总金额
     */
    private Number totalFee;


    /**
     * get 订单应付金额
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 订单应付金额
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }

    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 业务名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 业务名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @return
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * set 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @param chargeMode
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get 订单创建时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 订单创建时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 折扣金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }

    /**
     * get 订单号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * get 购买订单类型(NEW-新购,RENEW-续费，RESIZE_FORMULA-配置变更)
     *
     * @return
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * set 购买订单类型(NEW-新购,RENEW-续费，RESIZE_FORMULA-配置变更)
     *
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * get 订单支付时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * set 订单支付时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param payTime
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     * get 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @return
     */
    public String getPayType() {
        return payType;
    }

    /**
     * set 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * get 订单号
     *
     * @return
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * set 订单号
     *
     * @param paymentNumber
     */
    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 自营类型(SELF_SUPPORT-自营,THIRD_PARTY_SUPPORT-非自营)
     *
     * @return
     */
    public String getSelfSupportType() {
        return selfSupportType;
    }

    /**
     * set 自营类型(SELF_SUPPORT-自营,THIRD_PARTY_SUPPORT-非自营)
     *
     * @param selfSupportType
     */
    public void setSelfSupportType(String selfSupportType) {
        this.selfSupportType = selfSupportType;
    }

    /**
     * get 产品线名称
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * get 订单状态（PAID-已支付,FAILED-失败,NO_PAY-未支付,DEALING-处理中,CANCELED-已取消,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 订单状态（PAID-已支付,FAILED-失败,NO_PAY-未支付,DEALING-处理中,CANCELED-已取消,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 订单总金额
     *
     * @return
     */
    public Number getTotalFee() {
        return totalFee;
    }

    /**
     * set 订单总金额
     *
     * @param totalFee
     */
    public void setTotalFee(Number totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * set 订单应付金额
     *
     * @param actualFee
     */
    public OrderResponseObject actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public OrderResponseObject appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 业务名称
     *
     * @param appName
     */
    public OrderResponseObject appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @param chargeMode
     */
    public OrderResponseObject chargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set 订单创建时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param createTime
     */
    public OrderResponseObject createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public OrderResponseObject discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public OrderResponseObject orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * set 购买订单类型(NEW-新购,RENEW-续费，RESIZE_FORMULA-配置变更)
     *
     * @param orderType
     */
    public OrderResponseObject orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * set 订单支付时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param payTime
     */
    public OrderResponseObject payTime(String payTime) {
        this.payTime = payTime;
        return this;
    }

    /**
     * set 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @param payType
     */
    public OrderResponseObject payType(String payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set 订单号
     *
     * @param paymentNumber
     */
    public OrderResponseObject paymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public OrderResponseObject pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 自营类型(SELF_SUPPORT-自营,THIRD_PARTY_SUPPORT-非自营)
     *
     * @param selfSupportType
     */
    public OrderResponseObject selfSupportType(String selfSupportType) {
        this.selfSupportType = selfSupportType;
        return this;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public OrderResponseObject serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * set 订单状态（PAID-已支付,FAILED-失败,NO_PAY-未支付,DEALING-处理中,CANCELED-已取消,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @param status
     */
    public OrderResponseObject status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 订单总金额
     *
     * @param totalFee
     */
    public OrderResponseObject totalFee(Number totalFee) {
        this.totalFee = totalFee;
        return this;
    }


}
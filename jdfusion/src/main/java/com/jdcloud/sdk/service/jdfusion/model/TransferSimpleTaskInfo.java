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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * transferSimpleTaskInfo
 */
public class TransferSimpleTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务名称
     */
    private String name;

    /**
     * srcAddress
     */
    private SimpleTaskAddressInfo srcAddress;

    /**
     * dstAddress
     */
    private SimpleTaskAddressInfo dstAddress;


    /**
     * get 任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get srcAddress
     *
     * @return
     */
    public SimpleTaskAddressInfo getSrcAddress() {
        return srcAddress;
    }

    /**
     * set srcAddress
     *
     * @param srcAddress
     */
    public void setSrcAddress(SimpleTaskAddressInfo srcAddress) {
        this.srcAddress = srcAddress;
    }

    /**
     * get dstAddress
     *
     * @return
     */
    public SimpleTaskAddressInfo getDstAddress() {
        return dstAddress;
    }

    /**
     * set dstAddress
     *
     * @param dstAddress
     */
    public void setDstAddress(SimpleTaskAddressInfo dstAddress) {
        this.dstAddress = dstAddress;
    }


    /**
     * set 任务名称
     *
     * @param name
     */
    public TransferSimpleTaskInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set srcAddress
     *
     * @param srcAddress
     */
    public TransferSimpleTaskInfo srcAddress(SimpleTaskAddressInfo srcAddress) {
        this.srcAddress = srcAddress;
        return this;
    }

    /**
     * set dstAddress
     *
     * @param dstAddress
     */
    public TransferSimpleTaskInfo dstAddress(SimpleTaskAddressInfo dstAddress) {
        this.dstAddress = dstAddress;
        return this;
    }


}
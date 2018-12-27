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
 * Vpc
 * 与虚拟私有云相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdfusion.model.VpcInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询私有网络资源列表
 */
public class GetVpcsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * vpcs
     */
    private List<VpcInfo> vpcs;


    /**
     * get vpcs
     *
     * @return
     */
    public List<VpcInfo> getVpcs() {
        return vpcs;
    }

    /**
     * set vpcs
     *
     * @param vpcs
     */
    public void setVpcs(List<VpcInfo> vpcs) {
        this.vpcs = vpcs;
    }


    /**
     * set vpcs
     *
     * @param vpcs
     */
    public GetVpcsResult vpcs(List<VpcInfo> vpcs) {
        this.vpcs = vpcs;
        return this;
    }


    /**
     * add item to vpcs
     *
     * @param vpc
     */
    public void addVpc(VpcInfo vpc) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpc);
    }

}
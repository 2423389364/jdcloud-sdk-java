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
 * 监控项相关接口
 * 监控项相关接口，提供自定义监控数据上报功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitorcm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitorcm.model.MetricDataList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 上报用户自定义监控数据
 */
public class PutMetricDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success
     */
    private Boolean success;

    /**
     * errMetricDataList
     */
    private List<MetricDataList> errMetricDataList;


    /**
     * get success
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get errMetricDataList
     *
     * @return
     */
    public List<MetricDataList> getErrMetricDataList() {
        return errMetricDataList;
    }

    /**
     * set errMetricDataList
     *
     * @param errMetricDataList
     */
    public void setErrMetricDataList(List<MetricDataList> errMetricDataList) {
        this.errMetricDataList = errMetricDataList;
    }


    /**
     * set success
     *
     * @param success
     */
    public PutMetricDataResult success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set errMetricDataList
     *
     * @param errMetricDataList
     */
    public PutMetricDataResult errMetricDataList(List<MetricDataList> errMetricDataList) {
        this.errMetricDataList = errMetricDataList;
        return this;
    }


    /**
     * add item to errMetricDataList
     *
     * @param errMetricDataList
     */
    public void addErrMetricDataList(MetricDataList errMetricDataList) {
        if (this.errMetricDataList == null) {
            this.errMetricDataList = new ArrayList<>();
        }
        this.errMetricDataList.add(errMetricDataList);
    }

}
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
 * 大屏数据查询接口
 * 陕西苹果大屏数据查询接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.datastar.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据区域、行业、一级指标、二级指标、起始时间等条件查询数据
 */
public class GetLargeScreenDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询区域，比如某某省或某某市（可选区域以最终授权为准）
     * Required:true
     */
    @Required
    private String region;

    /**
     * 查询行业，比如某个水果或者农作物（可选行业以最终授权为准）
     * Required:true
     */
    @Required
    private String industry;

    /**
     * 查询起始时间，格式如下：yyyy-MM-dd
     * Required:true
     */
    @Required
    private String startDate;

    /**
     * 查询结束时间，格式如下：yyyy-MM-dd
     * Required:true
     */
    @Required
    private String endDate;

    /**
     * 数据对应的第一级分析指标（可选一级指标以最终授权为准）
     * Required:true
     */
    @Required
    private String firstIndex;

    /**
     * 数据对应的第二级分析指标，如不填写，则默认把一级指标下的所有二级指标都查询出来（可选二级指标以最终授权为准）
     */
    private String secondIndex;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 查询区域，比如某某省或某某市（可选区域以最终授权为准）
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 查询区域，比如某某省或某某市（可选区域以最终授权为准）
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 查询行业，比如某个水果或者农作物（可选行业以最终授权为准）
     *
     * @return
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * set 查询行业，比如某个水果或者农作物（可选行业以最终授权为准）
     *
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * get 查询起始时间，格式如下：yyyy-MM-dd
     *
     * @return
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * set 查询起始时间，格式如下：yyyy-MM-dd
     *
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * get 查询结束时间，格式如下：yyyy-MM-dd
     *
     * @return
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * set 查询结束时间，格式如下：yyyy-MM-dd
     *
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * get 数据对应的第一级分析指标（可选一级指标以最终授权为准）
     *
     * @return
     */
    public String getFirstIndex() {
        return firstIndex;
    }

    /**
     * set 数据对应的第一级分析指标（可选一级指标以最终授权为准）
     *
     * @param firstIndex
     */
    public void setFirstIndex(String firstIndex) {
        this.firstIndex = firstIndex;
    }

    /**
     * get 数据对应的第二级分析指标，如不填写，则默认把一级指标下的所有二级指标都查询出来（可选二级指标以最终授权为准）
     *
     * @return
     */
    public String getSecondIndex() {
        return secondIndex;
    }

    /**
     * set 数据对应的第二级分析指标，如不填写，则默认把一级指标下的所有二级指标都查询出来（可选二级指标以最终授权为准）
     *
     * @param secondIndex
     */
    public void setSecondIndex(String secondIndex) {
        this.secondIndex = secondIndex;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 查询区域，比如某某省或某某市（可选区域以最终授权为准）
     *
     * @param region
     */
    public GetLargeScreenDataRequest region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 查询行业，比如某个水果或者农作物（可选行业以最终授权为准）
     *
     * @param industry
     */
    public GetLargeScreenDataRequest industry(String industry) {
        this.industry = industry;
        return this;
    }

    /**
     * set 查询起始时间，格式如下：yyyy-MM-dd
     *
     * @param startDate
     */
    public GetLargeScreenDataRequest startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * set 查询结束时间，格式如下：yyyy-MM-dd
     *
     * @param endDate
     */
    public GetLargeScreenDataRequest endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * set 数据对应的第一级分析指标（可选一级指标以最终授权为准）
     *
     * @param firstIndex
     */
    public GetLargeScreenDataRequest firstIndex(String firstIndex) {
        this.firstIndex = firstIndex;
        return this;
    }

    /**
     * set 数据对应的第二级分析指标，如不填写，则默认把一级指标下的所有二级指标都查询出来（可选二级指标以最终授权为准）
     *
     * @param secondIndex
     */
    public GetLargeScreenDataRequest secondIndex(String secondIndex) {
        this.secondIndex = secondIndex;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetLargeScreenDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
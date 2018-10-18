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
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.TagFilter;
import com.jdcloud.sdk.service.monitor.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看某资源多个监控项数据
 */
public class BatchDescribeMetricDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源的类型，取值vm, lb, ip, database 等
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 资源的uuid
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
     */
    private String startTime;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     */
    private String endTime;

    /**
     * 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     */
    private String timeInterval;

    /**
     * 自定义标签
     */
    private List<TagFilter> tags;

    /**
     * 是否对查询的tags分组
     */
    private Boolean groupBy;

    /**
     * 自定义标签
     */
    private List<Filter> filters;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 资源的类型，取值vm, lb, ip, database 等
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源的uuid
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get 自定义标签
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 自定义标签
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    /**
     * get 是否对查询的tags分组
     *
     * @return
     */
    public Boolean getGroupBy() {
        return groupBy;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public void setGroupBy(Boolean groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * get 自定义标签
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 自定义标签
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public BatchDescribeMetricDataRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public BatchDescribeMetricDataRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
     *
     * @param startTime
     */
    public BatchDescribeMetricDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @param endTime
     */
    public BatchDescribeMetricDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @param timeInterval
     */
    public BatchDescribeMetricDataRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 自定义标签
     *
     * @param tags
     */
    public BatchDescribeMetricDataRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public BatchDescribeMetricDataRequest groupBy(Boolean groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * set 自定义标签
     *
     * @param filters
     */
    public BatchDescribeMetricDataRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public BatchDescribeMetricDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 自定义标签
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to 自定义标签
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}
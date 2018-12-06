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
 * CustomMetric APIs
 * 自定义监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询自定义监控项数据
 */
public class DescribeCmMetricDataByTagSpecRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指标聚合方式，每个指标都有默认的聚合方式， 可选值包括：sum,avg.max.min；多个对象的数据如何合并(resourceId -&gt; cluster)
     */
    private String aggrType;

    /**
     * 指标采样方式，默认avg， 可选值包括：sum,avg,max,min,last；同一对象的数据，在改变时间点粒度时如何合并(1m-&gt;20m)
     */
    private String downSampleType;

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
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * namespace
     * Required:true
     */
    @Required
    private String namespace;

    /**
     * 监控项英文标识(id)，监控项名称
     * Required:true
     */
    @Required
    private String metric;


    /**
     * get 指标聚合方式，每个指标都有默认的聚合方式， 可选值包括：sum,avg.max.min；多个对象的数据如何合并(resourceId -&gt; cluster)
     *
     * @return
     */
    public String getAggrType() {
        return aggrType;
    }

    /**
     * set 指标聚合方式，每个指标都有默认的聚合方式， 可选值包括：sum,avg.max.min；多个对象的数据如何合并(resourceId -&gt; cluster)
     *
     * @param aggrType
     */
    public void setAggrType(String aggrType) {
        this.aggrType = aggrType;
    }

    /**
     * get 指标采样方式，默认avg， 可选值包括：sum,avg,max,min,last；同一对象的数据，在改变时间点粒度时如何合并(1m-&gt;20m)
     *
     * @return
     */
    public String getDownSampleType() {
        return downSampleType;
    }

    /**
     * set 指标采样方式，默认avg， 可选值包括：sum,avg,max,min,last；同一对象的数据，在改变时间点粒度时如何合并(1m-&gt;20m)
     *
     * @param downSampleType
     */
    public void setDownSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
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
     * get namespace
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set namespace
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * get 监控项英文标识(id)，监控项名称
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识(id)，监控项名称
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 指标聚合方式，每个指标都有默认的聚合方式， 可选值包括：sum,avg.max.min；多个对象的数据如何合并(resourceId -&gt; cluster)
     *
     * @param aggrType
     */
    public DescribeCmMetricDataByTagSpecRequest aggrType(String aggrType) {
        this.aggrType = aggrType;
        return this;
    }

    /**
     * set 指标采样方式，默认avg， 可选值包括：sum,avg,max,min,last；同一对象的数据，在改变时间点粒度时如何合并(1m-&gt;20m)
     *
     * @param downSampleType
     */
    public DescribeCmMetricDataByTagSpecRequest downSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
     *
     * @param startTime
     */
    public DescribeCmMetricDataByTagSpecRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @param endTime
     */
    public DescribeCmMetricDataByTagSpecRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @param timeInterval
     */
    public DescribeCmMetricDataByTagSpecRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 自定义标签
     *
     * @param tags
     */
    public DescribeCmMetricDataByTagSpecRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public DescribeCmMetricDataByTagSpecRequest groupBy(Boolean groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeCmMetricDataByTagSpecRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set namespace
     *
     * @param namespace
     */
    public DescribeCmMetricDataByTagSpecRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * set 监控项英文标识(id)，监控项名称
     *
     * @param metric
     */
    public DescribeCmMetricDataByTagSpecRequest metric(String metric) {
        this.metric = metric;
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

}
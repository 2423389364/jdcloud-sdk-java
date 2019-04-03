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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.StatisticsWithAreaGroupDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 分地区及运营商查询统计数据
 */
public class QueryMixStatisticsWithAreaDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * domain
     */
    private String domain;

    /**
     * statistics
     */
    private List<StatisticsWithAreaGroupDetail> statistics;


    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get statistics
     *
     * @return
     */
    public List<StatisticsWithAreaGroupDetail> getStatistics() {
        return statistics;
    }

    /**
     * set statistics
     *
     * @param statistics
     */
    public void setStatistics(List<StatisticsWithAreaGroupDetail> statistics) {
        this.statistics = statistics;
    }


    /**
     * set startTime
     *
     * @param startTime
     */
    public QueryMixStatisticsWithAreaDataResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public QueryMixStatisticsWithAreaDataResult endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public QueryMixStatisticsWithAreaDataResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set statistics
     *
     * @param statistics
     */
    public QueryMixStatisticsWithAreaDataResult statistics(List<StatisticsWithAreaGroupDetail> statistics) {
        this.statistics = statistics;
        return this;
    }


    /**
     * add item to statistics
     *
     * @param statistic
     */
    public void addStatistic(StatisticsWithAreaGroupDetail statistic) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statistic);
    }

}
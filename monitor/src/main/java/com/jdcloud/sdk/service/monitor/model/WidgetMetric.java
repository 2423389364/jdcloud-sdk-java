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

package com.jdcloud.sdk.service.monitor.model;


/**
 * widgetMetric
 */
public class WidgetMetric  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * aggregate
     */
    private String aggregate;

    /**
     * metric
     */
    private String metric;

    /**
     * metricName
     */
    private String metricName;


    /**
     * get aggregate
     *
     * @return
     */
    public String getAggregate() {
        return aggregate;
    }

    /**
     * set aggregate
     *
     * @param aggregate
     */
    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * get metric
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set metric
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get metricName
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set metricName
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }


    /**
     * set aggregate
     *
     * @param aggregate
     */
    public WidgetMetric aggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * set metric
     *
     * @param metric
     */
    public WidgetMetric metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set metricName
     *
     * @param metricName
     */
    public WidgetMetric metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }


}
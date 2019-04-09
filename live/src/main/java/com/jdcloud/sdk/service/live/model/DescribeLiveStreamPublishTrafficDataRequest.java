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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询推流上行流量数据
- 查询某个时间段内的流量数据。
- 查询1分钟粒度的数据时，时间跨度不超过7天，其他粒度时时间跨度不超过30天

 */
public class DescribeLiveStreamPublishTrafficDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名，可以通过指定域名查询该域名下产生的带宽数据。

     */
    private String domainName;

    /**
     * 推流AppName，将AppName作为查询条件时须指定域名。

     */
    private String appName;

    /**
     * 流名称

     */
    private String streamName;

    /**
     * 运营商

     */
    private String ispName;

    /**
     * 查询的区域，如beijing,shanghai。多个用逗号分隔

     */
    private String locationName;

    /**
     * 查询的流协议类型，取值范围：&quot;rtmp,hdl,hls&quot;，多个时以逗号分隔

     */
    private String protocolType;

    /**
     * 查询周期，当前取值范围：“oneMin,fiveMin,halfHour,hour,twoHour,sixHour,day,followTime”，分别表示1min，5min，半小时，1小时，2小时，6小时，1天，跟随时间。默认为空，表示fiveMin。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     */
    private String period;

    /**
     * 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     */
    private String endTime;


    /**
     * get 推流域名，可以通过指定域名查询该域名下产生的带宽数据。

     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 推流域名，可以通过指定域名查询该域名下产生的带宽数据。

     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 推流AppName，将AppName作为查询条件时须指定域名。

     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 推流AppName，将AppName作为查询条件时须指定域名。

     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称

     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 运营商

     *
     * @return
     */
    public String getIspName() {
        return ispName;
    }

    /**
     * set 运营商

     *
     * @param ispName
     */
    public void setIspName(String ispName) {
        this.ispName = ispName;
    }

    /**
     * get 查询的区域，如beijing,shanghai。多个用逗号分隔

     *
     * @return
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * set 查询的区域，如beijing,shanghai。多个用逗号分隔

     *
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * get 查询的流协议类型，取值范围：&quot;rtmp,hdl,hls&quot;，多个时以逗号分隔

     *
     * @return
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * set 查询的流协议类型，取值范围：&quot;rtmp,hdl,hls&quot;，多个时以逗号分隔

     *
     * @param protocolType
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * get 查询周期，当前取值范围：“oneMin,fiveMin,halfHour,hour,twoHour,sixHour,day,followTime”，分别表示1min，5min，半小时，1小时，2小时，6小时，1天，跟随时间。默认为空，表示fiveMin。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 查询周期，当前取值范围：“oneMin,fiveMin,halfHour,hour,twoHour,sixHour,day,followTime”，分别表示1min，5min，半小时，1小时，2小时，6小时，1天，跟随时间。默认为空，表示fiveMin。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * get 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 推流域名，可以通过指定域名查询该域名下产生的带宽数据。

     *
     * @param domainName
     */
    public DescribeLiveStreamPublishTrafficDataRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 推流AppName，将AppName作为查询条件时须指定域名。

     *
     * @param appName
     */
    public DescribeLiveStreamPublishTrafficDataRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public DescribeLiveStreamPublishTrafficDataRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 运营商

     *
     * @param ispName
     */
    public DescribeLiveStreamPublishTrafficDataRequest ispName(String ispName) {
        this.ispName = ispName;
        return this;
    }

    /**
     * set 查询的区域，如beijing,shanghai。多个用逗号分隔

     *
     * @param locationName
     */
    public DescribeLiveStreamPublishTrafficDataRequest locationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * set 查询的流协议类型，取值范围：&quot;rtmp,hdl,hls&quot;，多个时以逗号分隔

     *
     * @param protocolType
     */
    public DescribeLiveStreamPublishTrafficDataRequest protocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * set 查询周期，当前取值范围：“oneMin,fiveMin,halfHour,hour,twoHour,sixHour,day,followTime”，分别表示1min，5min，半小时，1小时，2小时，6小时，1天，跟随时间。默认为空，表示fiveMin。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @param period
     */
    public DescribeLiveStreamPublishTrafficDataRequest period(String period) {
        this.period = period;
        return this;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public DescribeLiveStreamPublishTrafficDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @param endTime
     */
    public DescribeLiveStreamPublishTrafficDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}
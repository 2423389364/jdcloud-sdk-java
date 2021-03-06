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

import java.util.List;
import java.util.ArrayList;

/**
 * describeAlarmHistoryDetail
 */
public class DescribeAlarmHistoryDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警规则ID
     */
    private String alarmId;

    /**
     * 资源维度
     */
    private Object dimension;

    /**
     * 告警持续次数
     */
    private Long durationTimes;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 命名空间名称
     */
    private String namespaceName;

    /**
     * 告警持续时间，单位分钟
     */
    private Long noticeDurationTime;

    /**
     * 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     */
    private String noticeLevelTriggered;

    /**
     * 告警时间
     */
    private String noticeTime;

    /**
     * 告警通知人
     */
    private List<NoticeReceiver> receivers;

    /**
     * 规则绑定资源所在地域
     */
    private String region;

    /**
     * rule
     */
    private CustomRuleDetail rule;

    /**
     * 告警类型  1-告警恢复  2-告警 4-数据不足
     */
    private Long status;

    /**
     * 告警值
     */
    private Double value;


    /**
     * get 报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 资源维度
     *
     * @return
     */
    public Object getDimension() {
        return dimension;
    }

    /**
     * set 资源维度
     *
     * @param dimension
     */
    public void setDimension(Object dimension) {
        this.dimension = dimension;
    }

    /**
     * get 告警持续次数
     *
     * @return
     */
    public Long getDurationTimes() {
        return durationTimes;
    }

    /**
     * set 告警持续次数
     *
     * @param durationTimes
     */
    public void setDurationTimes(Long durationTimes) {
        this.durationTimes = durationTimes;
    }

    /**
     * get 命名空间
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set 命名空间
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * get 命名空间名称
     *
     * @return
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * set 命名空间名称
     *
     * @param namespaceName
     */
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * get 告警持续时间，单位分钟
     *
     * @return
     */
    public Long getNoticeDurationTime() {
        return noticeDurationTime;
    }

    /**
     * set 告警持续时间，单位分钟
     *
     * @param noticeDurationTime
     */
    public void setNoticeDurationTime(Long noticeDurationTime) {
        this.noticeDurationTime = noticeDurationTime;
    }

    /**
     * get 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @return
     */
    public String getNoticeLevelTriggered() {
        return noticeLevelTriggered;
    }

    /**
     * set 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @param noticeLevelTriggered
     */
    public void setNoticeLevelTriggered(String noticeLevelTriggered) {
        this.noticeLevelTriggered = noticeLevelTriggered;
    }

    /**
     * get 告警时间
     *
     * @return
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /**
     * set 告警时间
     *
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * get 告警通知人
     *
     * @return
     */
    public List<NoticeReceiver> getReceivers() {
        return receivers;
    }

    /**
     * set 告警通知人
     *
     * @param receivers
     */
    public void setReceivers(List<NoticeReceiver> receivers) {
        this.receivers = receivers;
    }

    /**
     * get 规则绑定资源所在地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 规则绑定资源所在地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get rule
     *
     * @return
     */
    public CustomRuleDetail getRule() {
        return rule;
    }

    /**
     * set rule
     *
     * @param rule
     */
    public void setRule(CustomRuleDetail rule) {
        this.rule = rule;
    }

    /**
     * get 告警类型  1-告警恢复  2-告警 4-数据不足
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 告警类型  1-告警恢复  2-告警 4-数据不足
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * get 告警值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 告警值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }


    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public DescribeAlarmHistoryDetail alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 资源维度
     *
     * @param dimension
     */
    public DescribeAlarmHistoryDetail dimension(Object dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 告警持续次数
     *
     * @param durationTimes
     */
    public DescribeAlarmHistoryDetail durationTimes(Long durationTimes) {
        this.durationTimes = durationTimes;
        return this;
    }

    /**
     * set 命名空间
     *
     * @param namespace
     */
    public DescribeAlarmHistoryDetail namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * set 命名空间名称
     *
     * @param namespaceName
     */
    public DescribeAlarmHistoryDetail namespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * set 告警持续时间，单位分钟
     *
     * @param noticeDurationTime
     */
    public DescribeAlarmHistoryDetail noticeDurationTime(Long noticeDurationTime) {
        this.noticeDurationTime = noticeDurationTime;
        return this;
    }

    /**
     * set 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @param noticeLevelTriggered
     */
    public DescribeAlarmHistoryDetail noticeLevelTriggered(String noticeLevelTriggered) {
        this.noticeLevelTriggered = noticeLevelTriggered;
        return this;
    }

    /**
     * set 告警时间
     *
     * @param noticeTime
     */
    public DescribeAlarmHistoryDetail noticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
        return this;
    }

    /**
     * set 告警通知人
     *
     * @param receivers
     */
    public DescribeAlarmHistoryDetail receivers(List<NoticeReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    /**
     * set 规则绑定资源所在地域
     *
     * @param region
     */
    public DescribeAlarmHistoryDetail region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set rule
     *
     * @param rule
     */
    public DescribeAlarmHistoryDetail rule(CustomRuleDetail rule) {
        this.rule = rule;
        return this;
    }

    /**
     * set 告警类型  1-告警恢复  2-告警 4-数据不足
     *
     * @param status
     */
    public DescribeAlarmHistoryDetail status(Long status) {
        this.status = status;
        return this;
    }

    /**
     * set 告警值
     *
     * @param value
     */
    public DescribeAlarmHistoryDetail value(Double value) {
        this.value = value;
        return this;
    }


    /**
     * add item to 告警通知人
     *
     * @param receiver
     */
    public void addReceiver(NoticeReceiver receiver) {
        if (this.receivers == null) {
            this.receivers = new ArrayList<>();
        }
        this.receivers.add(receiver);
    }

}
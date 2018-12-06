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
 * Availability Monitoring APIs
 * 可用性监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.Event;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询可用性监控任务的指定探测源的异常探测历史
 */
public class DescribeProbeHistoryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * events
     */
    private List<Event> events;

    /**
     * 探测源名称
     */
    private String name;

    /**
     * 探测源uuid
     */
    private String uuid;


    /**
     * get events
     *
     * @return
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * set events
     *
     * @param events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    /**
     * get 探测源名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 探测源名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 探测源uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 探测源uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * set events
     *
     * @param events
     */
    public DescribeProbeHistoryResult events(List<Event> events) {
        this.events = events;
        return this;
    }

    /**
     * set 探测源名称
     *
     * @param name
     */
    public DescribeProbeHistoryResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 探测源uuid
     *
     * @param uuid
     */
    public DescribeProbeHistoryResult uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    /**
     * add item to events
     *
     * @param event
     */
    public void addEvent(Event event) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(event);
    }

}
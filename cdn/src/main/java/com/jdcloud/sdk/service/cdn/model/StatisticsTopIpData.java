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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * statisticsTopIpData
 */
public class StatisticsTopIpData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * count
     */
    private Integer count;

    /**
     * ips
     */
    private List<StatisticsTopIpItem> ips;


    /**
     * get count
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set count
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get ips
     *
     * @return
     */
    public List<StatisticsTopIpItem> getIps() {
        return ips;
    }

    /**
     * set ips
     *
     * @param ips
     */
    public void setIps(List<StatisticsTopIpItem> ips) {
        this.ips = ips;
    }


    /**
     * set count
     *
     * @param count
     */
    public StatisticsTopIpData count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set ips
     *
     * @param ips
     */
    public StatisticsTopIpData ips(List<StatisticsTopIpItem> ips) {
        this.ips = ips;
        return this;
    }


    /**
     * add item to ips
     *
     * @param ip
     */
    public void addIp(StatisticsTopIpItem ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }

}
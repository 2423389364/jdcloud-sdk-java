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
 * 部署组
 * 云部署部署组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.deploy.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.deploy.model.Group;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询部署组的信息，此接口支持分页查询，默认每页20条
 */
public class DescribeGroupsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * groups
     */
    private List<Group> groups;

    /**
     * totalCount
     */
    private Number totalCount;


    /**
     * get groups
     *
     * @return
     */
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * set groups
     *
     * @param groups
     */
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set groups
     *
     * @param groups
     */
    public DescribeGroupsResult groups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeGroupsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to groups
     *
     * @param group
     */
    public void addGroup(Group group) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(group);
    }

}
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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、列表查询、备份、配置参数接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.Backup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询缓存Redis实例的备份结果（备份文件列表），可分页、可指定起止时间或备份任务ID
 */
public class DescribeBackupsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * backups
     */
    private List<Backup> backups;

    /**
     * 备份结果总数
     */
    private Integer totalCount;


    /**
     * get backups
     *
     * @return
     */
    public List<Backup> getBackups() {
        return backups;
    }

    /**
     * set backups
     *
     * @param backups
     */
    public void setBackups(List<Backup> backups) {
        this.backups = backups;
    }

    /**
     * get 备份结果总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 备份结果总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set backups
     *
     * @param backups
     */
    public DescribeBackupsResult backups(List<Backup> backups) {
        this.backups = backups;
        return this;
    }

    /**
     * set 备份结果总数
     *
     * @param totalCount
     */
    public DescribeBackupsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to backups
     *
     * @param backup
     */
    public void addBackup(Backup backup) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backup);
    }

}
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
 * Oss-TransferTasks
 * 与OSS迁移任务相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.service.jdfusion.model.TransferTaskFailedDetailInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据指定任务id查询迁移失败文件列表
 */
public class GetTransferTaskFailedFilesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * task
     */
    private TransferTaskFailedDetailInfo task;


    /**
     * get task
     *
     * @return
     */
    public TransferTaskFailedDetailInfo getTask() {
        return task;
    }

    /**
     * set task
     *
     * @param task
     */
    public void setTask(TransferTaskFailedDetailInfo task) {
        this.task = task;
    }


    /**
     * set task
     *
     * @param task
     */
    public GetTransferTaskFailedFilesResult task(TransferTaskFailedDetailInfo task) {
        this.task = task;
        return this;
    }


}
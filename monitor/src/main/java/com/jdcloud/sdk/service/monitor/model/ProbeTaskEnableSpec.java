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
import com.jdcloud.sdk.annotation.Required;

/**
 * probeTaskEnableSpec
 */
public class ProbeTaskEnableSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认：禁用； true：启用，false：禁用
     */
    private Boolean enabled;

    /**
     * 要启用或禁用的探测任务的task_id列表，列表长度[1，100)
     * Required:true
     */
    @Required
    private List<String> taskId;


    /**
     * get 默认：禁用； true：启用，false：禁用
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 默认：禁用； true：启用，false：禁用
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 要启用或禁用的探测任务的task_id列表，列表长度[1，100)
     *
     * @return
     */
    public List<String> getTaskId() {
        return taskId;
    }

    /**
     * set 要启用或禁用的探测任务的task_id列表，列表长度[1，100)
     *
     * @param taskId
     */
    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }


    /**
     * set 默认：禁用； true：启用，false：禁用
     *
     * @param enabled
     */
    public ProbeTaskEnableSpec enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 要启用或禁用的探测任务的task_id列表，列表长度[1，100)
     *
     * @param taskId
     */
    public ProbeTaskEnableSpec taskId(List<String> taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * add item to 要启用或禁用的探测任务的task_id列表，列表长度[1，100)
     *
     * @param taskId
     */
    public void addTaskId(String taskId) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskId);
    }

}
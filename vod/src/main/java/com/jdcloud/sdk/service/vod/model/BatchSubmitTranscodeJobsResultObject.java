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

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 批量提交转码作业结果对象
 */
public class BatchSubmitTranscodeJobsResultObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tasks
     */
    private List<SubmittedTranscodeTask> tasks;


    /**
     * get tasks
     *
     * @return
     */
    public List<SubmittedTranscodeTask> getTasks() {
        return tasks;
    }

    /**
     * set tasks
     *
     * @param tasks
     */
    public void setTasks(List<SubmittedTranscodeTask> tasks) {
        this.tasks = tasks;
    }


    /**
     * set tasks
     *
     * @param tasks
     */
    public BatchSubmitTranscodeJobsResultObject tasks(List<SubmittedTranscodeTask> tasks) {
        this.tasks = tasks;
        return this;
    }


    /**
     * add item to tasks
     *
     * @param task
     */
    public void addTask(SubmittedTranscodeTask task) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(task);
    }

}
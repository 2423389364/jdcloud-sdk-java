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

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 转码作业信息
 */
public class TranscodeJob  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业ID
     */
    private String jobId;

    /**
     * 输入文件标题
     */
    private String title;

    /**
     * 转码任务集合
     */
    private List<TranscodeTask> tasks;


    /**
     * get 作业ID
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 作业ID
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * get 输入文件标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 输入文件标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 转码任务集合
     *
     * @return
     */
    public List<TranscodeTask> getTasks() {
        return tasks;
    }

    /**
     * set 转码任务集合
     *
     * @param tasks
     */
    public void setTasks(List<TranscodeTask> tasks) {
        this.tasks = tasks;
    }


    /**
     * set 作业ID
     *
     * @param jobId
     */
    public TranscodeJob jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set 输入文件标题
     *
     * @param title
     */
    public TranscodeJob title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 转码任务集合
     *
     * @param tasks
     */
    public TranscodeJob tasks(List<TranscodeTask> tasks) {
        this.tasks = tasks;
        return this;
    }


    /**
     * add item to 转码任务集合
     *
     * @param task
     */
    public void addTask(TranscodeTask task) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(task);
    }

}
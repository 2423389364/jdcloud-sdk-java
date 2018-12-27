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
 * Live API
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加直播水印模板
 */
public class AddCustomLiveStreamWatermarkTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回结果
     */
    private Boolean feedback;


    /**
     * get 返回结果
     *
     * @return
     */
    public Boolean getFeedback() {
        return feedback;
    }

    /**
     * set 返回结果
     *
     * @param feedback
     */
    public void setFeedback(Boolean feedback) {
        this.feedback = feedback;
    }


    /**
     * set 返回结果
     *
     * @param feedback
     */
    public AddCustomLiveStreamWatermarkTemplateResult feedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }


}
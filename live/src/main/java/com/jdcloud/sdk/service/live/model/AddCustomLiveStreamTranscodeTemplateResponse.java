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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 添加自定义转码模板
- 系统为您预设了标准转码模板,如果不能满足您的转码需求,可以通过此接口添加自定义转码模板
- 系统标准转码模板
    ld (h.264/640*360/15f)
    sd (h.264/854*480/24f)
    hd (h.264/1280*720/25f)
    shd (h.264/1920*1080/30f)

 */
public class AddCustomLiveStreamTranscodeTemplateResponse extends JdcloudResponse<AddCustomLiveStreamTranscodeTemplateResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}
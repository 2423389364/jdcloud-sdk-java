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
 * Transcode
 * 视频转码任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.mps.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询转码作业列表。
支持如下过滤器：
- title[eq] 按照输入视频标题进行精确匹配

 */
public class ListTranscodeJobsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认值为 1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认值为 10；取值范围 [10, 100]
     */
    private Integer pageSize;

    /**
     * filters
     */
    private List<Filter> filters;


    /**
     * get 页码；默认值为 1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get filters
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public ListTranscodeJobsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public ListTranscodeJobsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public ListTranscodeJobsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to filters
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}
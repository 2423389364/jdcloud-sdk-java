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
 * Function OpenAPI
 * 
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.function.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.function.model.Alias;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询别名列表
 */
public class ListAliasResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<Alias> data;


    /**
     * get data
     *
     * @return
     */
    public List<Alias> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<Alias> data) {
        this.data = data;
    }


    /**
     * set data
     *
     * @param data
     */
    public ListAliasResult data(List<Alias> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(Alias data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}
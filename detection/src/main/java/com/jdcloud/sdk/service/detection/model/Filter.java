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

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;

/**
 * filter
 */
public class Filter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private String name;

    /**
     * values
     */
    private List<String> values;


    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get values
     *
     * @return
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * set values
     *
     * @param values
     */
    public void setValues(List<String> values) {
        this.values = values;
    }


    /**
     * set name
     *
     * @param name
     */
    public Filter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set values
     *
     * @param values
     */
    public Filter values(List<String> values) {
        this.values = values;
        return this;
    }


    /**
     * add item to values
     *
     * @param value
     */
    public void addValue(String value) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(value);
    }

}
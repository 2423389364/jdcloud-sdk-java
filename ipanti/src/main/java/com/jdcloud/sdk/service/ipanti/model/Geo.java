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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * geo
 */
public class Geo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * geo 拦截地域
     */
    private String label;

    /**
     * geo 拦截地域编码
     */
    private String value;


    /**
     * get geo 拦截地域
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set geo 拦截地域
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get geo 拦截地域编码
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set geo 拦截地域编码
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set geo 拦截地域
     *
     * @param label
     */
    public Geo label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set geo 拦截地域编码
     *
     * @param value
     */
    public Geo value(String value) {
        this.value = value;
        return this;
    }


}
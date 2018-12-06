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

/**
 * widgetResources
 */
public class WidgetResources  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * raw
     */
    private List<WidgetRawResource> raw;

    /**
     * tag
     */
    private List<WidgetTagResource> tag;


    /**
     * get raw
     *
     * @return
     */
    public List<WidgetRawResource> getRaw() {
        return raw;
    }

    /**
     * set raw
     *
     * @param raw
     */
    public void setRaw(List<WidgetRawResource> raw) {
        this.raw = raw;
    }

    /**
     * get tag
     *
     * @return
     */
    public List<WidgetTagResource> getTag() {
        return tag;
    }

    /**
     * set tag
     *
     * @param tag
     */
    public void setTag(List<WidgetTagResource> tag) {
        this.tag = tag;
    }


    /**
     * set raw
     *
     * @param raw
     */
    public WidgetResources raw(List<WidgetRawResource> raw) {
        this.raw = raw;
        return this;
    }

    /**
     * set tag
     *
     * @param tag
     */
    public WidgetResources tag(List<WidgetTagResource> tag) {
        this.tag = tag;
        return this;
    }


    /**
     * add item to raw
     *
     * @param raw
     */
    public void addRaw(WidgetRawResource raw) {
        if (this.raw == null) {
            this.raw = new ArrayList<>();
        }
        this.raw.add(raw);
    }

    /**
     * add item to tag
     *
     * @param tag
     */
    public void addTag(WidgetTagResource tag) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        this.tag.add(tag);
    }

}
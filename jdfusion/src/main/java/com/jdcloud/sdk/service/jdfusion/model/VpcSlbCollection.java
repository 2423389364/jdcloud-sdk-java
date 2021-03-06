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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vpcSlbCollection
 */
public class VpcSlbCollection  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * slbs
     */
    private List<SlbInfo> slbs;


    /**
     * get slbs
     *
     * @return
     */
    public List<SlbInfo> getSlbs() {
        return slbs;
    }

    /**
     * set slbs
     *
     * @param slbs
     */
    public void setSlbs(List<SlbInfo> slbs) {
        this.slbs = slbs;
    }


    /**
     * set slbs
     *
     * @param slbs
     */
    public VpcSlbCollection slbs(List<SlbInfo> slbs) {
        this.slbs = slbs;
        return this;
    }


    /**
     * add item to slbs
     *
     * @param slb
     */
    public void addSlb(SlbInfo slb) {
        if (this.slbs == null) {
            this.slbs = new ArrayList<>();
        }
        this.slbs.add(slb);
    }

}
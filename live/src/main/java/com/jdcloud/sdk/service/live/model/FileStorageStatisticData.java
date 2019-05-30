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

package com.jdcloud.sdk.service.live.model;


/**
 * fileStorageStatisticData
 */
public class FileStorageStatisticData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存储空间，单位：B

     */
    private Long size;


    /**
     * get 存储空间，单位：B

     *
     * @return
     */
    public Long getSize() {
        return size;
    }

    /**
     * set 存储空间，单位：B

     *
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }


    /**
     * set 存储空间，单位：B

     *
     * @param size
     */
    public FileStorageStatisticData size(Long size) {
        this.size = size;
        return this;
    }


}
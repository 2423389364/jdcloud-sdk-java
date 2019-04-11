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

package com.jdcloud.sdk.service.rms.model;


/**
 * queryAddTemplateContent
 */
public class QueryAddTemplateContent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * type参数
     */
    private String type;

    /**
     * txt参数
     */
    private String txt;

    /**
     * file参数
     */
    private String file;


    /**
     * get type参数
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type参数
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get txt参数
     *
     * @return
     */
    public String getTxt() {
        return txt;
    }

    /**
     * set txt参数
     *
     * @param txt
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }

    /**
     * get file参数
     *
     * @return
     */
    public String getFile() {
        return file;
    }

    /**
     * set file参数
     *
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }


    /**
     * set type参数
     *
     * @param type
     */
    public QueryAddTemplateContent type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set txt参数
     *
     * @param txt
     */
    public QueryAddTemplateContent txt(String txt) {
        this.txt = txt;
        return this;
    }

    /**
     * set file参数
     *
     * @param file
     */
    public QueryAddTemplateContent file(String file) {
        this.file = file;
        return this;
    }


}
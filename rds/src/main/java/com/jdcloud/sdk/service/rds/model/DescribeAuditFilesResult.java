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
 * 审计管理
 * 审计管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.AuditFile;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取当前实例下的所有审计结果文件的列表&lt;br&gt;- 仅支持SQL Server
 */
public class DescribeAuditFilesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * auditFiles
     */
    private List<AuditFile> auditFiles;


    /**
     * get auditFiles
     *
     * @return
     */
    public List<AuditFile> getAuditFiles() {
        return auditFiles;
    }

    /**
     * set auditFiles
     *
     * @param auditFiles
     */
    public void setAuditFiles(List<AuditFile> auditFiles) {
        this.auditFiles = auditFiles;
    }


    /**
     * set auditFiles
     *
     * @param auditFiles
     */
    public DescribeAuditFilesResult auditFiles(List<AuditFile> auditFiles) {
        this.auditFiles = auditFiles;
        return this;
    }


    /**
     * add item to auditFiles
     *
     * @param auditFile
     */
    public void addAuditFile(AuditFile auditFile) {
        if (this.auditFiles == null) {
            this.auditFiles = new ArrayList<>();
        }
        this.auditFiles.add(auditFile);
    }

}
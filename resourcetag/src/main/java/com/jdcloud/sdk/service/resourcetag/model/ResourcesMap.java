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

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * resourcesMap
 */
public class ResourcesMap  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 资源id列表
     * Required:true
     */
    @Required
    private List<String> resourceId;


    /**
     * get 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源id列表
     *
     * @return
     */
    public List<String> getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id列表
     *
     * @param resourceId
     */
    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * set 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @param serviceCode
     */
    public ResourcesMap serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源id列表
     *
     * @param resourceId
     */
    public ResourcesMap resourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * add item to 资源id列表
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        this.resourceId.add(resourceId);
    }

}
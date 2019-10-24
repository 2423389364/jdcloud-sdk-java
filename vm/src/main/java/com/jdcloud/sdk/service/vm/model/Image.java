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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * image
 */
public class Image  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 镜像名称
     */
    private String name;

    /**
     * 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     */
    private String platform;

    /**
     * 镜像的操作系统版本。
     */
    private String osVersion;

    /**
     * 镜像架构。取值：i386,x86_64
     */
    private String architecture;

    /**
     * 镜像系统盘大小
     */
    private Integer systemDiskSizeGB;

    /**
     * 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     */
    private String imageSource;

    /**
     * 镜像的操作系统类型。取值：windows,linux
     */
    private String osType;

    /**
     * &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 镜像文件实际大小
     */
    private Integer sizeMB;

    /**
     * 镜像描述
     */
    private String desc;

    /**
     * 该镜像所有者的用户PIN
     */
    private String ownerPin;

    /**
     * 镜像的使用权限，取值：all（所有人可用）， specifiedUsers（共享用户可用），ownerOnly（镜像所有者自己可用）
     */
    private String launchPermission;

    /**
     * 镜像系统盘配置
     */
    private InstanceDiskAttachment systemDisk;

    /**
     * 镜像数据盘映射信息
     */
    private List<InstanceDiskAttachment> dataDisks;

    /**
     * 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     */
    private String snapshotId;

    /**
     * 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     */
    private String rootDeviceType;

    /**
     * 镜像复制和转换时的进度，仅显示数值，单位为百分比
     */
    private String progress;


    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 镜像名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * get 镜像的操作系统版本。
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 镜像的操作系统版本。
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * get 镜像架构。取值：i386,x86_64
     *
     * @return
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * set 镜像架构。取值：i386,x86_64
     *
     * @param architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * get 镜像系统盘大小
     *
     * @return
     */
    public Integer getSystemDiskSizeGB() {
        return systemDiskSizeGB;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public void setSystemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
    }

    /**
     * get 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     * get 镜像的操作系统类型。取值：windows,linux
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 镜像的操作系统类型。取值：windows,linux
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 镜像文件实际大小
     *
     * @return
     */
    public Integer getSizeMB() {
        return sizeMB;
    }

    /**
     * set 镜像文件实际大小
     *
     * @param sizeMB
     */
    public void setSizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
    }

    /**
     * get 镜像描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 镜像描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 该镜像所有者的用户PIN
     *
     * @return
     */
    public String getOwnerPin() {
        return ownerPin;
    }

    /**
     * set 该镜像所有者的用户PIN
     *
     * @param ownerPin
     */
    public void setOwnerPin(String ownerPin) {
        this.ownerPin = ownerPin;
    }

    /**
     * get 镜像的使用权限，取值：all（所有人可用）， specifiedUsers（共享用户可用），ownerOnly（镜像所有者自己可用）
     *
     * @return
     */
    public String getLaunchPermission() {
        return launchPermission;
    }

    /**
     * set 镜像的使用权限，取值：all（所有人可用）， specifiedUsers（共享用户可用），ownerOnly（镜像所有者自己可用）
     *
     * @param launchPermission
     */
    public void setLaunchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * get 镜像系统盘配置
     *
     * @return
     */
    public InstanceDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 镜像系统盘配置
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 镜像数据盘映射信息
     *
     * @return
     */
    public List<InstanceDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 镜像数据盘映射信息
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @return
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * set 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @param rootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * get 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @return
     */
    public String getProgress() {
        return progress;
    }

    /**
     * set 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @param progress
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }


    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public Image imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public Image name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @param platform
     */
    public Image platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * set 镜像的操作系统版本。
     *
     * @param osVersion
     */
    public Image osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * set 镜像架构。取值：i386,x86_64
     *
     * @param architecture
     */
    public Image architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public Image systemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
        return this;
    }

    /**
     * set 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public Image imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * set 镜像的操作系统类型。取值：windows,linux
     *
     * @param osType
     */
    public Image osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @param status
     */
    public Image status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Image createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 镜像文件实际大小
     *
     * @param sizeMB
     */
    public Image sizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
        return this;
    }

    /**
     * set 镜像描述
     *
     * @param desc
     */
    public Image desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 该镜像所有者的用户PIN
     *
     * @param ownerPin
     */
    public Image ownerPin(String ownerPin) {
        this.ownerPin = ownerPin;
        return this;
    }

    /**
     * set 镜像的使用权限，取值：all（所有人可用）， specifiedUsers（共享用户可用），ownerOnly（镜像所有者自己可用）
     *
     * @param launchPermission
     */
    public Image launchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }

    /**
     * set 镜像系统盘配置
     *
     * @param systemDisk
     */
    public Image systemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 镜像数据盘映射信息
     *
     * @param dataDisks
     */
    public Image dataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @param snapshotId
     */
    public Image snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @param rootDeviceType
     */
    public Image rootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * set 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @param progress
     */
    public Image progress(String progress) {
        this.progress = progress;
        return this;
    }


    /**
     * add item to 镜像数据盘映射信息
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

}
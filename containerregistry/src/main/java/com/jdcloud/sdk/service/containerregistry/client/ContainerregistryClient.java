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
 * 容器镜像仓库
 * 容器镜像仓库服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.containerregistry.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.containerregistry.model.CheckRegistryNameRequest;
import com.jdcloud.sdk.service.containerregistry.model.CheckRegistryNameResponse;
import com.jdcloud.sdk.service.containerregistry.client.CheckRegistryNameExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRepositoriesRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRepositoriesResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeRepositoriesExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DeleteRegistryRequest;
import com.jdcloud.sdk.service.containerregistry.model.DeleteRegistryResponse;
import com.jdcloud.sdk.service.containerregistry.client.DeleteRegistryExecutor;
import com.jdcloud.sdk.service.containerregistry.model.ReleaseAuthorizationTokenRequest;
import com.jdcloud.sdk.service.containerregistry.model.ReleaseAuthorizationTokenResponse;
import com.jdcloud.sdk.service.containerregistry.client.ReleaseAuthorizationTokenExecutor;
import com.jdcloud.sdk.service.containerregistry.model.CheckRepositoryNameRequest;
import com.jdcloud.sdk.service.containerregistry.model.CheckRepositoryNameResponse;
import com.jdcloud.sdk.service.containerregistry.client.CheckRepositoryNameExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DeleteRepositoryRequest;
import com.jdcloud.sdk.service.containerregistry.model.DeleteRepositoryResponse;
import com.jdcloud.sdk.service.containerregistry.client.DeleteRepositoryExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DeleteImageRequest;
import com.jdcloud.sdk.service.containerregistry.model.DeleteImageResponse;
import com.jdcloud.sdk.service.containerregistry.client.DeleteImageExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeAuthorizationTokensRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeAuthorizationTokensResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeAuthorizationTokensExecutor;
import com.jdcloud.sdk.service.containerregistry.model.CreateRepositoryRequest;
import com.jdcloud.sdk.service.containerregistry.model.CreateRepositoryResponse;
import com.jdcloud.sdk.service.containerregistry.client.CreateRepositoryExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRegistryRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRegistryResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeRegistryExecutor;
import com.jdcloud.sdk.service.containerregistry.model.CreateRegistryRequest;
import com.jdcloud.sdk.service.containerregistry.model.CreateRegistryResponse;
import com.jdcloud.sdk.service.containerregistry.client.CreateRegistryExecutor;
import com.jdcloud.sdk.service.containerregistry.model.GetAuthorizationTokenRequest;
import com.jdcloud.sdk.service.containerregistry.model.GetAuthorizationTokenResponse;
import com.jdcloud.sdk.service.containerregistry.client.GetAuthorizationTokenExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeImagesRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeImagesResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeImagesExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeQuotasRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeQuotasResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeQuotasExecutor;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRegistriesRequest;
import com.jdcloud.sdk.service.containerregistry.model.DescribeRegistriesResponse;
import com.jdcloud.sdk.service.containerregistry.client.DescribeRegistriesExecutor;

/**
 * containerregistryClient
 */
public class ContainerregistryClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "containerregistry.jdcloud-api.com";
    public final static String ServiceName = "containerregistry";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private ContainerregistryClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询指定注册表名称是否已经存在以及是否符合命名规范。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckRegistryNameResponse checkRegistryName(CheckRegistryNameRequest request) throws JdcloudSdkException {
        return new CheckRegistryNameExecutor().client(this).execute(request);
    }

    /**
     * 描述用户指定 registry 下的 repository.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRepositoriesResponse describeRepositories(DescribeRepositoriesRequest request) throws JdcloudSdkException {
        return new DescribeRepositoriesExecutor().client(this).execute(request);
    }

    /**
     * 删除指定用户下某个 registry.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRegistryResponse deleteRegistry(DeleteRegistryRequest request) throws JdcloudSdkException {
        return new DeleteRegistryExecutor().client(this).execute(request);
    }

    /**
     * 释放用户 registry 的 token。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReleaseAuthorizationTokenResponse releaseAuthorizationToken(ReleaseAuthorizationTokenRequest request) throws JdcloudSdkException {
        return new ReleaseAuthorizationTokenExecutor().client(this).execute(request);
    }

    /**
     * 查询指定镜像仓库名称是否已经存在以及是否符合命名规范。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckRepositoryNameResponse checkRepositoryName(CheckRepositoryNameRequest request) throws JdcloudSdkException {
        return new CheckRepositoryNameExecutor().client(this).execute(request);
    }

    /**
     * 删除指定用户下某个镜像仓库.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws JdcloudSdkException {
        return new DeleteRepositoryExecutor().client(this).execute(request);
    }

    /**
     * 删除镜像
imageDigest imageTag imageTagStatus 三者只能且必须传一个。
可根据Tag状态删除Image，例如删除所有tagged的镜像。
digest和tag唯一表征单个镜像，其中imageDigest为sha256哈希，image manifest的digest。
例如 sha256:examplee6d1e504117a17000003d3753086354a38375961f2e665416ef4b1b2f；image使用的tag, 如  &quot;precise&quot; 

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws JdcloudSdkException {
        return new DeleteImageExecutor().client(this).execute(request);
    }

    /**
     * &lt;p&gt;批量查询令牌。&lt;/p&gt; 
&lt;p&gt;暂时不支持分页和过滤条件。&lt;/p&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAuthorizationTokensResponse describeAuthorizationTokens(DescribeAuthorizationTokensRequest request) throws JdcloudSdkException {
        return new DescribeAuthorizationTokensExecutor().client(this).execute(request);
    }

    /**
     * 通过参数创建镜像仓库。
仓库名称可以分解为多个路径名，每个名称必须至少包含一个小写字母数字，考虑URL规范。
支持包含段划线或者下划线进行分割，但不允许点&#39;.&#39;，多个路径名之间通过(&quot;/&quot;)连接，总长度不超过256个字符，当前只支持二级目录。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws JdcloudSdkException {
        return new CreateRepositoryExecutor().client(this).execute(request);
    }

    /**
     * 查询指定用户下某个 registry 详情。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRegistryResponse describeRegistry(DescribeRegistryRequest request) throws JdcloudSdkException {
        return new DescribeRegistryExecutor().client(this).execute(request);
    }

    /**
     * 通过参数创建注册表。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateRegistryResponse createRegistry(CreateRegistryRequest request) throws JdcloudSdkException {
        return new CreateRegistryExecutor().client(this).execute(request);
    }

    /**
     * &lt;p&gt;申请12小时有效期的令牌。 使用&lt;code&gt;docker&lt;/code&gt; CLI push和pull镜像。&lt;/p&gt;
&lt;p&gt;&lt;code&gt;authorizationToken&lt;/code&gt;为每个registry返回一个base64编码的字符串，解码后&lt;code&gt;docker login&lt;/code&gt;命令
可完成指定registry的鉴权。JCR CLI提供&lt;code&gt;jcr get-login&lt;/code&gt;进行认证处理。&lt;/p&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetAuthorizationTokenResponse getAuthorizationToken(GetAuthorizationTokenRequest request) throws JdcloudSdkException {
        return new GetAuthorizationTokenExecutor().client(this).execute(request);
    }

    /**
     * 返回指定repository中images的元数据，包括image size, image tags和creation date。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws JdcloudSdkException {
        return new DescribeImagesExecutor().client(this).execute(request);
    }

    /**
     * 查询配额
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotasResponse describeQuotas(DescribeQuotasRequest request) throws JdcloudSdkException {
        return new DescribeQuotasExecutor().client(this).execute(request);
    }

    /**
     * 批量查询指定用户下所有 registry 详情。
暂不支持 filter.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRegistriesResponse describeRegistries(DescribeRegistriesRequest request) throws JdcloudSdkException {
        return new DescribeRegistriesExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public ContainerregistryClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private ContainerregistryClient containerregistryClient;

        public DefaultBuilder() {
            containerregistryClient = new ContainerregistryClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            containerregistryClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            containerregistryClient.httpRequestConfig = config;
            return this;
        }

        public ContainerregistryClient build() throws JdcloudSdkException {

            if (containerregistryClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                containerregistryClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (containerregistryClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("ContainerregistryClient build error: jdcloud credentials provider not set");
                }
            }
            if (containerregistryClient.httpRequestConfig == null) {
                containerregistryClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (containerregistryClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("ContainerregistryClient build error: http request config not set");
                }
            }
            return containerregistryClient;
        }

        public Builder environment(Environment environment) {
            containerregistryClient.environment = environment;
            return this;
        }
    }
}

/*
 * GoPlus Security API Document
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ResponseWrapperListApproveNFT1155ListResponse;
import io.swagger.client.model.ResponseWrapperListApproveNFTListResponse;
import io.swagger.client.model.ResponseWrapperListApproveTokenOutListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApproveControllerV2Api {
    private ApiClient apiClient;

    public ApproveControllerV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ApproveControllerV2Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addressNFT1155ApproveListUsingGET1
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressNFT1155ApproveListUsingGET1Call(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/nft1155_approval_security/{chainId}"
            .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addresses", addresses));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addressNFT1155ApproveListUsingGET1ValidateBeforeCall(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling addressNFT1155ApproveListUsingGET1(Async)");
        }
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling addressNFT1155ApproveListUsingGET1(Async)");
        }
        
        com.squareup.okhttp.Call call = addressNFT1155ApproveListUsingGET1Call(addresses, chainId, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check risk of all erc1155 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ResponseWrapperListApproveNFT1155ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperListApproveNFT1155ListResponse addressNFT1155ApproveListUsingGET1(String addresses, String chainId, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperListApproveNFT1155ListResponse> resp = addressNFT1155ApproveListUsingGET1WithHttpInfo(addresses, chainId, authorization);
        return resp.getData();
    }

    /**
     * Check risk of all erc1155 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ApiResponse&lt;ResponseWrapperListApproveNFT1155ListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperListApproveNFT1155ListResponse> addressNFT1155ApproveListUsingGET1WithHttpInfo(String addresses, String chainId, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = addressNFT1155ApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveNFT1155ListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check risk of all erc1155 approvals under one EOA. (asynchronously)
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressNFT1155ApproveListUsingGET1Async(String addresses, String chainId, String authorization, final ApiCallback<ResponseWrapperListApproveNFT1155ListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addressNFT1155ApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveNFT1155ListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressNFT721ApproveListUsingGET1
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressNFT721ApproveListUsingGET1Call(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/nft721_approval_security/{chainId}"
            .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addresses", addresses));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addressNFT721ApproveListUsingGET1ValidateBeforeCall(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling addressNFT721ApproveListUsingGET1(Async)");
        }
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling addressNFT721ApproveListUsingGET1(Async)");
        }
        
        com.squareup.okhttp.Call call = addressNFT721ApproveListUsingGET1Call(addresses, chainId, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check risk of all erc721 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ResponseWrapperListApproveNFTListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperListApproveNFTListResponse addressNFT721ApproveListUsingGET1(String addresses, String chainId, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperListApproveNFTListResponse> resp = addressNFT721ApproveListUsingGET1WithHttpInfo(addresses, chainId, authorization);
        return resp.getData();
    }

    /**
     * Check risk of all erc721 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ApiResponse&lt;ResponseWrapperListApproveNFTListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperListApproveNFTListResponse> addressNFT721ApproveListUsingGET1WithHttpInfo(String addresses, String chainId, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = addressNFT721ApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveNFTListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check risk of all erc721 approvals under one EOA. (asynchronously)
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressNFT721ApproveListUsingGET1Async(String addresses, String chainId, String authorization, final ApiCallback<ResponseWrapperListApproveNFTListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addressNFT721ApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveNFTListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressTokenApproveListUsingGET1
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressTokenApproveListUsingGET1Call(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/token_approval_security/{chainId}"
            .replaceAll("\\{" + "chainId" + "\\}", apiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addresses", addresses));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addressTokenApproveListUsingGET1ValidateBeforeCall(String addresses, String chainId, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling addressTokenApproveListUsingGET1(Async)");
        }
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling addressTokenApproveListUsingGET1(Async)");
        }
        
        com.squareup.okhttp.Call call = addressTokenApproveListUsingGET1Call(addresses, chainId, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check risk of all erc20 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ResponseWrapperListApproveTokenOutListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperListApproveTokenOutListResponse addressTokenApproveListUsingGET1(String addresses, String chainId, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperListApproveTokenOutListResponse> resp = addressTokenApproveListUsingGET1WithHttpInfo(addresses, chainId, authorization);
        return resp.getData();
    }

    /**
     * Check risk of all erc20 approvals under one EOA.
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ApiResponse&lt;ResponseWrapperListApproveTokenOutListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperListApproveTokenOutListResponse> addressTokenApproveListUsingGET1WithHttpInfo(String addresses, String chainId, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = addressTokenApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveTokenOutListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check risk of all erc20 approvals under one EOA. (asynchronously)
     * 
     * @param addresses contract address (required)
     * @param chainId chain id (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressTokenApproveListUsingGET1Async(String addresses, String chainId, String authorization, final ApiCallback<ResponseWrapperListApproveTokenOutListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addressTokenApproveListUsingGET1ValidateBeforeCall(addresses, chainId, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperListApproveTokenOutListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

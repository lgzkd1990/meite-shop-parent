package com.mayikt;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags="微信服务接口")
public interface WeiXinAppService {

    /**
     * 功能说明： 应用服务接口
     */
    @ApiOperation(value="微信应用服务接口")
    @GetMapping("/getApp")
    public AppEntity getApp();

}

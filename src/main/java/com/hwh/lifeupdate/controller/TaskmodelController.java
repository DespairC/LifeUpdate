package com.hwh.lifeupdate.controller;

import com.hwh.lifeupdate.common.APIResult;
import com.hwh.lifeupdate.controller.model.TaskModelListRequestVo;
import com.hwh.lifeupdate.controller.model.TaskModelListResponseVo;
import com.hwh.lifeupdate.service.TaskmodelService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hwh
 * @since 2022-10-28
 */
@RestController
@RequestMapping("/taskmodel")
@ApiModel("任务模块")
@Slf4j
public class TaskmodelController {

    @Resource
    TaskmodelService taskmodelService;

    @ApiOperation(value = "查询测试", httpMethod = "POST", notes = "")
    @RequestMapping(value = "/listByQuery", method = RequestMethod.POST, produces = "application/json")
    public APIResult listByQuery(@ApiParam(name = "TaskModelListRequestVo", value = "查询实体")
                                                                 @Validated @RequestBody TaskModelListRequestVo requestVo){
        log.info("查询测试入参：" + requestVo);
        return APIResult.success(taskmodelService.query());
    }
}

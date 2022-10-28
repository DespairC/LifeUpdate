package com.hwh.lifeupdate.controller.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: HWH
 * @create: 2022-10-28 15:59
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TaskModelListRequestVo", description = "分页查询参数实体")
public class TaskModelListRequestVo {
    @ApiModelProperty(value = "查询类型", example = "something")
    private String queryType;

    @ApiModelProperty(value = "查询内容", example = "某某")
    private String queryText;
}

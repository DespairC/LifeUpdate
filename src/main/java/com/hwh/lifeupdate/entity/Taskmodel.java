package com.hwh.lifeupdate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hwh
 * @since 2022-10-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Taskmodel对象", description="")
public class Taskmodel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String relatedattribute1;

    private Integer teamrecordid;

    private String relatedattribute2;

    private String completereward;

    private String relatedattribute3;

    private Integer ishandleoverdue;

    private Integer taskfrequency;

    private String remark;

    private Integer starttime;

    private Integer userid;

    private String content;

    private String extrainfo;

    private Integer isuserinputstarttime;

    private Integer updatedtime;

    private Integer taskstatus;

    private Integer lasttaskid;

    private Integer rewardcoin;

    private Integer tasktargetid;

    private Integer teamid;

    private Integer expreward;

    private Integer isfrozen;

    private Integer currenttimes;

    private Integer categoryid;

    private Integer taskid;

    private Integer taskurgencydegree;

    private Integer taskremindtime;

    private Integer isneedtoremake;

    private Integer isshared;

    private Integer tasktype;

    private Integer tagcolor;

    private Integer groupid;

    private Integer taskexpiretime;

    private Integer endtime;

    private Integer priority;

    private Integer createdtime;

    private Integer taskcountextraid;

    private Integer enddate;

    private Integer isdeleterecord;

    private Integer enableebbinghausmode;

    private Integer taskdifficultydegree;

    private Integer rewardcoinvariable;

    private Integer orderincategory;

    private Integer isusespecificexpiretime;

    private Integer nexttaskid;


}

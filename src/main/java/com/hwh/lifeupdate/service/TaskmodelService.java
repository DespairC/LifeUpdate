package com.hwh.lifeupdate.service;

import com.hwh.lifeupdate.entity.Taskmodel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hwh
 * @since 2022-10-28
 */
public interface TaskmodelService {
    List<Taskmodel> query();
}

package com.hwh.lifeupdate.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hwh.lifeupdate.entity.Taskmodel;
import com.hwh.lifeupdate.mapper.TaskmodelMapper;
import com.hwh.lifeupdate.service.TaskmodelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hwh
 * @since 2022-10-28
 */
@Service
public class TaskmodelServiceImpl implements TaskmodelService {

    @Resource
    TaskmodelMapper taskmodelMapper;

    @Override
    public List<Taskmodel> query() {
        QueryWrapper<Taskmodel> queryWrapper = new QueryWrapper();
        List<Taskmodel> taskmodelList = taskmodelMapper.selectList(queryWrapper);
        return taskmodelList;
    }

}

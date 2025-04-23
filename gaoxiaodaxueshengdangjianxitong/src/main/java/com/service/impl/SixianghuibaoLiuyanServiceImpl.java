package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.SixianghuibaoLiuyanDao;
import com.entity.SixianghuibaoLiuyanEntity;
import com.service.SixianghuibaoLiuyanService;
import com.entity.view.SixianghuibaoLiuyanView;

/**
 * 思想汇报留言 服务实现类
 */
@Service("sixianghuibaoLiuyanService")
@Transactional
public class SixianghuibaoLiuyanServiceImpl extends ServiceImpl<SixianghuibaoLiuyanDao, SixianghuibaoLiuyanEntity> implements SixianghuibaoLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<SixianghuibaoLiuyanView> page =new Query<SixianghuibaoLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}

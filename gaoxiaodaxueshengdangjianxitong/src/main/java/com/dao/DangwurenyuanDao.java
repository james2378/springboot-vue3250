package com.dao;

import com.entity.DangwurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DangwurenyuanView;

/**
 * 党务人员 Dao 接口
 *
 * @author 
 */
public interface DangwurenyuanDao extends BaseMapper<DangwurenyuanEntity> {

   List<DangwurenyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

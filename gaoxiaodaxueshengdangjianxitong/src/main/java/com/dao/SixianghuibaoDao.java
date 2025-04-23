package com.dao;

import com.entity.SixianghuibaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SixianghuibaoView;

/**
 * 思想汇报 Dao 接口
 *
 * @author 
 */
public interface SixianghuibaoDao extends BaseMapper<SixianghuibaoEntity> {

   List<SixianghuibaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

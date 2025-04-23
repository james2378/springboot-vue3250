package com.dao;

import com.entity.SixianghuibaoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SixianghuibaoLiuyanView;

/**
 * 思想汇报留言 Dao 接口
 *
 * @author 
 */
public interface SixianghuibaoLiuyanDao extends BaseMapper<SixianghuibaoLiuyanEntity> {

   List<SixianghuibaoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.dao;

import com.entity.ChandiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChandiVO;
import com.entity.view.ChandiView;


/**
 * 产地
 * 
 * @author 
 * @email 
 * @date 2021-03-10 21:39:25
 */
public interface ChandiDao extends BaseMapper<ChandiEntity> {
	
	List<ChandiVO> selectListVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	ChandiVO selectVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	List<ChandiView> selectListView(@Param("ew") Wrapper<ChandiEntity> wrapper);

	List<ChandiView> selectListView(Pagination page,@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	ChandiView selectView(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
}

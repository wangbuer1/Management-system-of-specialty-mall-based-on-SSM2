package com.dao;

import com.entity.ZhaoshangzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaoshangzixunVO;
import com.entity.view.ZhaoshangzixunView;


/**
 * 招商资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-10 21:39:26
 */
public interface ZhaoshangzixunDao extends BaseMapper<ZhaoshangzixunEntity> {
	
	List<ZhaoshangzixunVO> selectListVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	ZhaoshangzixunVO selectVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	List<ZhaoshangzixunView> selectListView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);

	List<ZhaoshangzixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	ZhaoshangzixunView selectView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
}

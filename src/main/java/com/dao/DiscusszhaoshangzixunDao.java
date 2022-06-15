package com.dao;

import com.entity.DiscusszhaoshangzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhaoshangzixunVO;
import com.entity.view.DiscusszhaoshangzixunView;


/**
 * 招商资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-10 21:39:26
 */
public interface DiscusszhaoshangzixunDao extends BaseMapper<DiscusszhaoshangzixunEntity> {
	
	List<DiscusszhaoshangzixunVO> selectListVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	DiscusszhaoshangzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	List<DiscusszhaoshangzixunView> selectListView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);

	List<DiscusszhaoshangzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	DiscusszhaoshangzixunView selectView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
}

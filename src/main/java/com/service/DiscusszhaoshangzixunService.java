package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhaoshangzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhaoshangzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhaoshangzixunView;


/**
 * 招商资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-03-10 21:39:26
 */
public interface DiscusszhaoshangzixunService extends IService<DiscusszhaoshangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhaoshangzixunVO> selectListVO(Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	DiscusszhaoshangzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	List<DiscusszhaoshangzixunView> selectListView(Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	DiscusszhaoshangzixunView selectView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
}


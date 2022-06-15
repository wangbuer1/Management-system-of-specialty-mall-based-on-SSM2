package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaoshangzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaoshangzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaoshangzixunView;


/**
 * 招商资讯
 *
 * @author 
 * @email 
 * @date 2021-03-10 21:39:26
 */
public interface ZhaoshangzixunService extends IService<ZhaoshangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaoshangzixunVO> selectListVO(Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	ZhaoshangzixunVO selectVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	List<ZhaoshangzixunView> selectListView(Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	ZhaoshangzixunView selectView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaoshangzixunEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChandiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChandiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChandiView;


/**
 * 产地
 *
 * @author 
 * @email 
 * @date 2021-03-10 21:39:25
 */
public interface ChandiService extends IService<ChandiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChandiVO> selectListVO(Wrapper<ChandiEntity> wrapper);
   	
   	ChandiVO selectVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
   	
   	List<ChandiView> selectListView(Wrapper<ChandiEntity> wrapper);
   	
   	ChandiView selectView(@Param("ew") Wrapper<ChandiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChandiEntity> wrapper);
   	
}


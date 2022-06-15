package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TechanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TechanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TechanfenleiView;


/**
 * 特产分类
 *
 * @author 
 * @email 
 * @date 2021-03-10 21:39:25
 */
public interface TechanfenleiService extends IService<TechanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TechanfenleiVO> selectListVO(Wrapper<TechanfenleiEntity> wrapper);
   	
   	TechanfenleiVO selectVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
   	
   	List<TechanfenleiView> selectListView(Wrapper<TechanfenleiEntity> wrapper);
   	
   	TechanfenleiView selectView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TechanfenleiEntity> wrapper);
   	
}


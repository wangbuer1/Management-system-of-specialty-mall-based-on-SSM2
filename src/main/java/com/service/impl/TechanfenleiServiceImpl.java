package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TechanfenleiDao;
import com.entity.TechanfenleiEntity;
import com.service.TechanfenleiService;
import com.entity.vo.TechanfenleiVO;
import com.entity.view.TechanfenleiView;

@Service("techanfenleiService")
public class TechanfenleiServiceImpl extends ServiceImpl<TechanfenleiDao, TechanfenleiEntity> implements TechanfenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TechanfenleiEntity> page = this.selectPage(
                new Query<TechanfenleiEntity>(params).getPage(),
                new EntityWrapper<TechanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TechanfenleiEntity> wrapper) {
		  Page<TechanfenleiView> page =new Query<TechanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TechanfenleiVO> selectListVO(Wrapper<TechanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TechanfenleiVO selectVO(Wrapper<TechanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TechanfenleiView> selectListView(Wrapper<TechanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TechanfenleiView selectView(Wrapper<TechanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

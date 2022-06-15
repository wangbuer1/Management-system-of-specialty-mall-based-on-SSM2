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


import com.dao.ChandiDao;
import com.entity.ChandiEntity;
import com.service.ChandiService;
import com.entity.vo.ChandiVO;
import com.entity.view.ChandiView;

@Service("chandiService")
public class ChandiServiceImpl extends ServiceImpl<ChandiDao, ChandiEntity> implements ChandiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChandiEntity> page = this.selectPage(
                new Query<ChandiEntity>(params).getPage(),
                new EntityWrapper<ChandiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChandiEntity> wrapper) {
		  Page<ChandiView> page =new Query<ChandiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChandiVO> selectListVO(Wrapper<ChandiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChandiVO selectVO(Wrapper<ChandiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChandiView> selectListView(Wrapper<ChandiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChandiView selectView(Wrapper<ChandiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

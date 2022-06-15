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


import com.dao.ZhaoshangzixunDao;
import com.entity.ZhaoshangzixunEntity;
import com.service.ZhaoshangzixunService;
import com.entity.vo.ZhaoshangzixunVO;
import com.entity.view.ZhaoshangzixunView;

@Service("zhaoshangzixunService")
public class ZhaoshangzixunServiceImpl extends ServiceImpl<ZhaoshangzixunDao, ZhaoshangzixunEntity> implements ZhaoshangzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaoshangzixunEntity> page = this.selectPage(
                new Query<ZhaoshangzixunEntity>(params).getPage(),
                new EntityWrapper<ZhaoshangzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaoshangzixunEntity> wrapper) {
		  Page<ZhaoshangzixunView> page =new Query<ZhaoshangzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaoshangzixunVO> selectListVO(Wrapper<ZhaoshangzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaoshangzixunVO selectVO(Wrapper<ZhaoshangzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaoshangzixunView> selectListView(Wrapper<ZhaoshangzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaoshangzixunView selectView(Wrapper<ZhaoshangzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

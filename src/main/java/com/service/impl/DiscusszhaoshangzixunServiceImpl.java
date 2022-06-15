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


import com.dao.DiscusszhaoshangzixunDao;
import com.entity.DiscusszhaoshangzixunEntity;
import com.service.DiscusszhaoshangzixunService;
import com.entity.vo.DiscusszhaoshangzixunVO;
import com.entity.view.DiscusszhaoshangzixunView;

@Service("discusszhaoshangzixunService")
public class DiscusszhaoshangzixunServiceImpl extends ServiceImpl<DiscusszhaoshangzixunDao, DiscusszhaoshangzixunEntity> implements DiscusszhaoshangzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhaoshangzixunEntity> page = this.selectPage(
                new Query<DiscusszhaoshangzixunEntity>(params).getPage(),
                new EntityWrapper<DiscusszhaoshangzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhaoshangzixunEntity> wrapper) {
		  Page<DiscusszhaoshangzixunView> page =new Query<DiscusszhaoshangzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhaoshangzixunVO> selectListVO(Wrapper<DiscusszhaoshangzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhaoshangzixunVO selectVO(Wrapper<DiscusszhaoshangzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhaoshangzixunView> selectListView(Wrapper<DiscusszhaoshangzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhaoshangzixunView selectView(Wrapper<DiscusszhaoshangzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

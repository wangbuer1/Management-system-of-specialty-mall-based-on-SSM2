package com.entity.view;

import com.entity.ZhaoshangzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招商资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 21:39:26
 */
@TableName("zhaoshangzixun")
public class ZhaoshangzixunView  extends ZhaoshangzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaoshangzixunView(){
	}
 
 	public ZhaoshangzixunView(ZhaoshangzixunEntity zhaoshangzixunEntity){
 	try {
			BeanUtils.copyProperties(this, zhaoshangzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

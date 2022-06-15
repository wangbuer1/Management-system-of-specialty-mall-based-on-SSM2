package com.entity.view;

import com.entity.ChandiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产地
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 21:39:25
 */
@TableName("chandi")
public class ChandiView  extends ChandiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChandiView(){
	}
 
 	public ChandiView(ChandiEntity chandiEntity){
 	try {
			BeanUtils.copyProperties(this, chandiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

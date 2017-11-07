package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemsService;

@Service
public class itemServiceImpl implements ItemsService{

	@Autowired
	private TbItemMapper itemMap;
	
	@Override
	public TbItem getItemById(long itemId) {
		TbItem item = itemMap.selectByPrimaryKey(itemId);
		return item;
	}
}

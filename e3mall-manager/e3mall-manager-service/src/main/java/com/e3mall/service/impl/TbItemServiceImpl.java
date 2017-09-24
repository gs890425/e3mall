package com.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;
@Service
public class TbItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem findById(Long id) {
		// TODO Auto-generated method stub
		
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		
		return tbItem;
	}

}

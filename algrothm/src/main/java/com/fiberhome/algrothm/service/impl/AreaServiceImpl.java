
package com.fiberhome.algrothm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fiberhome.algrothm.dao.AreaDao;
import com.fiberhome.algrothm.service.AreaService;


/**
 * Area.
 * @author root
 * @timestamp 2019-12-10 10:31:43
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao dao;


}

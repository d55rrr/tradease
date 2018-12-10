package com.yh.tradease.system.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.ResponseData;
import com.yh.tradease.system.entity.SysMenu;
import com.yh.tradease.system.entity.SysUserGroup;
import com.yh.tradease.system.service.SysGroupMenuService;
import com.yh.tradease.system.service.SysMenuService;
import com.yh.tradease.system.service.SysUserGroupService;

@Controller
@RequestMapping("/index")
public class SystemController {

	@Autowired
	private SysGroupMenuService sysGroupMenuService ;
	
	@Autowired
	private SysUserGroupService sysUserGroupService;
	
	@Autowired
	private SysMenuService sysMenuService;
	
    @RequestMapping("/main")
    String toMain() {
        return "/main.html";
    }
    
    @RequestMapping("/sales")
    String toSales(){
    	return "/sales/sales.html";
    }
    /**
     * 查询所有菜单
     * @param session
     * @return
     */
    @RequestMapping("/menus")
    @ResponseBody
    ResponseData<SysMenu> getMenu(HttpSession session){
    	
    	SysUserGroup us = sysUserGroupService.getByUserId(1);

		//List<SysMenu> gm = sysMenuService.getByGroupId(us.getGroupId());
    	List<SysMenu> gm = sysMenuService.queryAllMenu();
		//sysController.addParents(gm,gm);

		
		return new ResponseData(gm);
    }
    /**加入所有父节点
     * sysmenu:供添加的list
     * pmenu:供迭代的list
     * 
     * @return
     */
    public void addParents(List<SysMenu> sysmenu,List<SysMenu> pmenu){
    	List<Integer> parentIds = new ArrayList<>();
    	parentIds.add(pmenu.get(0).getPid());
    	for(int i=0;i<pmenu.size();i++){
    		if(parentIds.size()>0){
    			boolean noneExs = true;
    			for(int j=0;j<parentIds.size();j++){
    				if(parentIds.get(j).intValue()==pmenu.get(i).getPid().intValue()){
    					noneExs = false;
    				}
    			}
    			if(noneExs){
    				parentIds.add(pmenu.get(i).getPid());
    			}
    		}
    	}
    	List<SysMenu> pmenus = sysMenuService.getByIds(parentIds);
    	if(pmenus!=null&&pmenus.size()>0){
    		sysmenu.addAll(pmenus);
    		addParents(sysmenu,pmenus);
    		
    	}
    }
}

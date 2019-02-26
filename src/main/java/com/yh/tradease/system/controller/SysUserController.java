package com.yh.tradease.system.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Constant;
import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.system.service.SysUserService;
import com.yh.tradease.system.vo.SysUserVo;

/**
 * 
* @ClassName: SysUserController
* <li>文件名称: SysUserController.java </li>
* <li>公　　司: </li>
* <li>版权所有: 版权所有(C)2015-2020</li>
* <li>修改记录: ...</li>
* <li>内容摘要: 用户相关操作</li>
* <li>其他说明: ...</li>
* @version  v1.0
* @author ZhengTao
* @date 2018年3月18日  下午5:39:06
 */
@Controller
@RequestMapping("/sys/user")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 
	 * @Title: queryUserList
	 * @Description: 查询用户列表
	 * @return
	 * @Return ResponseData
	 * 2018年3月18日 下午6:07:01
	 */
	@RequestMapping("/userList")
	@ResponseBody
	public ResponseData queryUserList(SysUserVo user,Pager page){
		
		Pager result = sysUserService.queryUserList(user,page);
		
		return new ResponseData(result);
	}
	/**
	 * 
	 * @Title: addUser
	 * @Description: 新增用户
	 * @return
	 * @Return ResponseData
	 * 2018年3月19日 下午6:03:51
	 */
	@RequestMapping("/add")
	@ResponseBody
	public ResponseData addUser(SysUserVo user){
		
		int result = sysUserService.addUser(user);
		
		
		return new ResponseData(result) ;
		
	}
	/**
	 * 
	 * @Title: updateUser
	 * @Description: 更新用户
	 * @return
	 * @Return ResponseData
	 * 2018年3月19日 下午6:05:24
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData updateUser(SysUserVo user){
		
		int result = sysUserService.updateUser(user);
		
		return new ResponseData(result) ;
	}
	/**
	 * 
	 * @Title: deleleUser
	 * @Description: 删除用户
	 * @return
	 * @Return ResponseData
	 * 2018年3月19日 下午6:06:28
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData deleleUser(Integer[] ids){
		int result = sysUserService.deleteUser(ids);
		
		return new ResponseData(result) ;
	}
	/**
	 * 
	 * @Title: resetpwd
	 * @Description: 重设密码
	 * @param user
	 * @return
	 * @Return ResponseData
	 * 2018年3月19日 下午6:22:26
	 */
	@RequestMapping("/resetpwd")
	@ResponseBody
	public ResponseData resetpwd(SysUserVo user){
		
		int result = sysUserService.updatepwd(user);
		
		return new ResponseData(result);
	}
	
	@RequestMapping("/enterin")
	@ResponseBody
	public ResponseData login(String code1,String code2,HttpServletRequest request){
		
		if(code1.equals("admin")&&code2.equals(StringToMd5("admin@2019#")+"tradease")){
			HttpSession session = request.getSession();
			session.setAttribute(Constant.USER_LOGIN_ACCOUNT, "admin");
			System.out.println(session.getAttribute(Constant.USER_LOGIN_ACCOUNT)+"------------------------");
			return ResponseData.success();
		}
		return ResponseData.error("用户名或密码错误！");
	}
	@RequestMapping("/kickout")
	@ResponseBody
	public ResponseData logout(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		session.removeAttribute(Constant.USER_LOGIN_ACCOUNT);
			
		return ResponseData.success();
	}
	

	private static String StringToMd5(String psw) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(psw.getBytes("UTF-8"));
                byte[] encryption = md5.digest();
 
                StringBuffer strBuf = new StringBuffer();
                for (int i = 0; i < encryption.length; i++) {
                    if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                        strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                    } else {
                        strBuf.append(Integer.toHexString(0xff & encryption[i]));
                    }
                }
 
                return strBuf.toString();
            } catch (NoSuchAlgorithmException e) {
                return "";
            } catch (UnsupportedEncodingException e) {
                return "";
            }
        }
	
	
		
}

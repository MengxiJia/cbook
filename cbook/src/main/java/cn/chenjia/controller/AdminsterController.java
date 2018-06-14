package cn.chenjia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.service.AdminsterService;

@Controller
public class AdminsterController {

	@Autowired
	private AdminsterService adminsterService;

	@RequestMapping("/adminsterlist")
	public String getAdminsterList() {
		return "adminsterlist";
	}

	@RequestMapping("/admiRegister")
	public String getAdmiRegister() {
		return "admiregister";
	}

	@RequestMapping(value = "/AdmiRegisterFunc")
	public String AdmiRegister(Adminster adminster) {
		// System.out.println(user.getuUsername()+"\n"+user.getuPassword());
		boolean success = adminsterService.AdmiRegister(adminster);
		if (success) {
			System.out.println("注册成功");
		} else {
			System.out.println("注册失败");
		}
		return "admiregister";
	}

	@RequestMapping(value = "/admiLogin")
	public String getAdmiLogin() {
		return "admilogin";
	}

	@RequestMapping(value = "/admiLoginFunc")
	public String AdmiLogin(Adminster adminster, HttpServletRequest request) {
		Adminster adminsternew = adminsterService.AdmiLogin(adminster);
		String url = "admilogin";
		if (adminsternew != null) {
			System.out.println("登陆成功");
			url = "user";
			request.getSession().setAttribute("admin", adminsternew);

		} else {
			System.out.println("登陆失败");
		}
		return url;
	}

	@RequestMapping(value = "/Delete/{adid}")
	public String AdmiDelete(@PathVariable("adid") String adid) {
		Adminster adminster = new Adminster();
		int adidint = Integer.parseInt(adid);
		adminster.setAdid(adidint);
		boolean success = adminsterService.DeleteAdmi(adminster);
		if (success) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		return "admidelete";
	}

	@RequestMapping(value = "/AdminList")
	public String getEditAdmin(Model model) {
		List<Adminster> adminsters = adminsterService.selectAllAdmin();
		model.addAttribute("adminsters", adminsters);
		return "adminsterlist";

	}
	
	@RequestMapping(value = "/EditAdmin/{adid}")
	public String editAdmin(@PathVariable("adid")int adid , Model model) {
		Adminster adminster = new Adminster();
		adminster.setAdid(adid);
		boolean success = adminsterService.DeleteAdmi(adminster);
		if(success) {
			System.out.println("delete admin succeed");
		}
		return "adminsterlist";

	}
	
	@RequestMapping(value = "/UpdateAdminPage/{adid}")
	public String updateAdminPage(@PathVariable("adid")int adid , Model model) {
		Adminster adminster = adminsterService.selectAdmin(adid);
		model.addAttribute("adminster", adminster);
		return "adminsterupdatepage";

	}
	
	@RequestMapping("/UpdateAdmin")
	public String updateAdmin(Adminster adminster , Model model) {
		boolean success = adminsterService.updateAdmin(adminster);
		
		return "redirect:/AdminList";
	}

}

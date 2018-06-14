package cn.chenjia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.core.bean.AdminsterQuery;
import cn.chenjia.core.bean.AdminsterQuery.Criteria;
import cn.chenjia.core.dao.AdminsterDao;
@Service("adminsterService")
@Transactional
public class AdminsterServiceImpl implements AdminsterService {
	@Autowired
	private AdminsterDao adminsterDao;
	public boolean AdmiRegister(Adminster adminster) {
		// TODO Auto-generated method stub
		int count = adminsterDao.insert(adminster);
//		int count = adminsterDao.updateByPrimaryKey(adminster);
		boolean success = false;
		if(count>0) {
			success = true;
		}
		return success;
	}

	public Adminster AdmiLogin(Adminster adminster) {
		// TODO Auto-generated method stub
		AdminsterQuery adminsterQuery =new AdminsterQuery();
		Criteria cri = adminsterQuery.createCriteria();
		cri.andAdnameEqualTo(adminster.getAdname());
		cri.andAdpasswordEqualTo(adminster.getAdpassword());
		List<Adminster> admins =  adminsterDao.selectByExample(adminsterQuery);
		Adminster admin = null;
		if(admins!= null) {
			admin = admins.get(0);
		}
		return admin;
	}

	public boolean DeleteAdmi(Adminster adminster) {
		// TODO Auto-generated method stub
		AdminsterQuery adminsterQuery =new AdminsterQuery();
		Criteria cri = adminsterQuery.createCriteria();
		cri.andAdidEqualTo(adminster.getAdid());
		int count = adminsterDao.deleteByExample(adminsterQuery);
		boolean success = false;
		if(count>0) {
			success = true;
		}
		return success;
	}

	public List<Adminster> selectAllAdmin() {
		// TODO Auto-generated method stub
		AdminsterQuery adminsterQuery =new AdminsterQuery();
		List<Adminster> adminsters = adminsterDao.selectByExample(adminsterQuery);
		return adminsters;
	}

	public Adminster selectAdmin(int adid) {
		Adminster  adminster = adminsterDao.selectByPrimaryKey(adid);
		return adminster;
	}

	public boolean updateAdmin(Adminster adminster) {
		int count = adminsterDao.updateByPrimaryKey(adminster);
		boolean success = false;
		if(count>0) {
			success = true;
		}
		return success;
	}

}

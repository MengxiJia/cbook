package cn.chenjia.service;

import java.util.List;

import cn.chenjia.core.bean.Adminster;

public interface AdminsterService {
	public boolean AdmiRegister(Adminster adminster);
	public Adminster AdmiLogin(Adminster adminster);
	public boolean DeleteAdmi(Adminster adminster);
	public List<Adminster> selectAllAdmin();
	public Adminster selectAdmin(int adid);
	public boolean updateAdmin(Adminster adminster);

}

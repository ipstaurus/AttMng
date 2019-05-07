package custom.action;

import java.util.ArrayList;

import custom.dao.CustomDAO;
import custom.dto.CustomDTO;

public class ListAction {
	private ArrayList<CustomDTO> list = new ArrayList<CustomDTO>();

	public String SelectAllList() throws Exception {
		list = (ArrayList<CustomDTO>) CustomDAO.selectAllData();
		return "success";
	}

	// Getter, Setter
	public ArrayList<CustomDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CustomDTO> list) {
		this.list = list;
	}
}

package action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dAO.FetchContactDataDAO;
import dTO.FetchContactDTO;

public class FetchContactAC extends ActionSupport {
	
	List<FetchContactDTO >  dataList= null;
	ResultSet rs = null;
	String fetchData = null;
	FetchContactDataDAO daoObj = null;
	public List<FetchContactDTO> getDataList() {
		return dataList;
	}
	public void setDataList(List<FetchContactDTO> dataList) {
		this.dataList = dataList;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	public String getFetchData() {
		return fetchData;
	}
	public void setFetchData(String fetchData) {
		this.fetchData = fetchData;
	}
	public FetchContactDataDAO getDaoObj() {
		return daoObj;
	}
	public void setDaoObj(FetchContactDataDAO daoObj) {
		this.daoObj = daoObj;
	}
	
     public String execute(){
    	 
    	 if (fetchData.equals("FetchRecords")) {
    		 if (fetchData.equals("FetchRecords")){
				dataList = new ArrayList<FetchContactDTO>();
				FetchContactDTO dataBean = null;
				rs = new FetchContactDataDAO ().fetchData();
				if(rs!=null){
					try {
						while(rs.next()){
							dataBean= new FetchContactDTO();
							dataBean.setSalutation(rs.getString("salutation"));
							dataBean.setContact_type(rs.getString("contact_type"));
							dataBean.setFirstname(rs.getString("firstname"));
							dataBean.setMiddlename(rs.getString("middlename"));
							dataBean.setLastname(rs.getString("lastname"));
							dataBean.setGender(rs.getString("gender"));
							dataBean.setPhone(rs.getString("phone"));
							dataBean.setEmailid(rs.getString("emailid"));
							dataBean.setBilling_address(rs.getString("billing_address"));
							dataBean.setShipping_address(rs.getString("shipping_address"));
							dataList.add(dataBean);
						}
					
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
    		 }
				
    	 
     }
    	 return SUCCESS;
}
}

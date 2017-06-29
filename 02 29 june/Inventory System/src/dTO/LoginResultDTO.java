package dTO;

public class LoginResultDTO {

	boolean result;
	DashboardDTO dashboardDTO;
	
	
	public boolean getResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public DashboardDTO getDashboardDTO() {
		return dashboardDTO;
	}
	public void setDashboardDTO(DashboardDTO dashboardDTO) {
		this.dashboardDTO = dashboardDTO;
	}
	
	@Override
	public String toString() {
		return "LoginResultDTO [result=" + result + ", dashboardDTO=" + dashboardDTO + "]";
	}
	
	
	
}

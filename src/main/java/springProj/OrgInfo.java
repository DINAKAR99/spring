package springProj;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OrgInfo {

	private String namesArr[] = new String[2];
	private List<String> empNameList;
	private Set<Integer> empIdsSet;
	private Map<Integer, String> treasure;
	private Properties userinfo;

	public Properties getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Properties userinfo) {
		this.userinfo = userinfo;
	}

	public Map<Integer, String> getTreasure() {
		return treasure;
	}

	public void setTreasure(Map<Integer, String> treasure) {
		this.treasure = treasure;
	}

	public String[] getNamesArr() {
		return namesArr;
	}

	public void setNamesArr(String[] namesArr) {
		this.namesArr = namesArr;
	}

	public List<String> getEmpNameList() {
		return empNameList;
	}

	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}

	public Set<Integer> getEmpIdsSet() {
		return empIdsSet;
	}

	public void setEmpIdsSet(Set<Integer> empIdsSet) {
		this.empIdsSet = empIdsSet;
	}

	@Override
	public String toString() {
		return "OrgInfo [namesArr=" + Arrays.toString(namesArr) + ", empNameList=" + empNameList + ", empIdsSet="
				+ empIdsSet + ", treasure=" + treasure + ", userinfo=" + userinfo + "]";
	}

}

package javaprograms;
import java.util.Map;
import java.util.TreeMap;
public class countrycapitalmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> countryCapitalMap=new TreeMap<String,String>();{
			countryCapitalMap.put("India","New Delhi");
			countryCapitalMap.put("USA","Washington");
			countryCapitalMap.put("Germany","Berlin");
			countryCapitalMap.put("Japan","Tokyo");
			countryCapitalMap.put("Pakisthan","Islamabad");
			for(Map.Entry<String,String> entry : countryCapitalMap.entrySet()) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
 
		}
	}

}

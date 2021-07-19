import java.util.HashMap;
import java.util.Map;

public class SplitStringOnTwoOperatorsIntoAMap{

     public static void main(String []args){
		System.out.println("Hello today we will split a string on Ampersand & and Equal to = so as to get a Map of values.");
		
		String test = "thirdPartyUniqueId=1234569875&smId=test123&txnStatus=success&shjTxnId=123654&proposalNo=testpropono123&txnAmount=1000.00&serviceProviderId=testServiceProviderId";
		
		Map<String, String> map = new HashMap<String, String>();

		// split on '=' and on '&'
		String[] parts = test.split("[&=]+");

		for (int i = 0; i < parts.length; i += 2) {
		map.put(parts[i], parts[i + 1]);
		}

		for (String s : map.keySet()) {
		System.out.println(s + " is " + map.get(s));
		}
     }
}
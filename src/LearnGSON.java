
import com.google.gson.*;

public class LearnGSON {
	
	public static void main(String args[]) {
		
		Gson gson = new Gson();
		String json;
		
		json = "{\"stocks\":[{\"key\":\"amazon\",\"sector\":\"Infra\",\"isActive\":false,\"stockName\":\"blue\"},{\"key\":\"amazon\",\"sector\":\"Infra\",\"isActive\":false,\"stockName\":\"blue\"}]}";
		
		
		
		Stocks lj = gson.fromJson(json,Stocks.class);
		
		System.out.println(lj.getStocks().get(1).getKey());
	}
}
	


//{ 'key': 'amazon', 'sector': 'Infra', 'isActive': false, 'stockName': 'blue', 'stockSymbol': 'NASDAQ:AMZN', 'lowestPurchasePrice': '2319.12', 'highestPurchasePrice': '3537.74', 'targetPurchasePrice': '1841.53', 'lastTradedPrice': '3564.24', 'changePercentage': '3025.40', 'change': '3399.01'}
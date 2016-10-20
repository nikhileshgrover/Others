import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Stock {

	@SerializedName("key")
	@Expose
	private String key;
	@SerializedName("sector")
	@Expose
	private String sector;
	@SerializedName("isActive")
	@Expose
	private Boolean isActive;
	@SerializedName("stockName")
	@Expose
	private String stockName;

	/**
	 * 
	 * @return
	 * The key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 
	 * @param key
	 * The key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 
	 * @return
	 * The sector
	 */
	public String getSector() {
		return sector;
	}

	/**
	 * 
	 * @param sector
	 * The sector
	 */
	public void setSector(String sector) {
		this.sector = sector;
	}

	/**
	 * 
	 * @return
	 * The isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * 
	 * @param isActive
	 * The isActive
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * 
	 * @return
	 * The stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * 
	 * @param stockName
	 * The stockName
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
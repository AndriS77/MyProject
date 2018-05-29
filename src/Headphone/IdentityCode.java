package Headphone;

public class IdentityCode {
	private String code;
	private Country country;
	
	public IdentityCode(String code, Country country) {
		this.code = code;
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IdentityCode [" + (code != null ? "code=" + code + ", " : "")
				+ (country != null ? "country=" + country : "") + "]";
	}

}

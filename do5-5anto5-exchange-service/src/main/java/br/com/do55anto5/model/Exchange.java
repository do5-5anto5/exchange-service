package br.com.do55anto5.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Exchange implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal versionFactor;
	private BigDecimal convertedValue;
	private String environmet;

	public Exchange () {}

	public Exchange(Long id, String from, String to, BigDecimal versionFactor, BigDecimal convertedValue,
			String environmet) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.versionFactor = versionFactor;
		this.convertedValue = convertedValue;
		this.environmet = environmet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getVersionFactor() {
		return versionFactor;
	}

	public void setVersionFactor(BigDecimal versionFactor) {
		this.versionFactor = versionFactor;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getEnvironmet() {
		return environmet;
	}

	public void setEnvironmet(String environmet) {
		this.environmet = environmet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(convertedValue, environmet, from, id, to, versionFactor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exchange other = (Exchange) obj;
		return Objects.equals(convertedValue, other.convertedValue) && Objects.equals(environmet, other.environmet)
				&& Objects.equals(from, other.from) && Objects.equals(id, other.id) && Objects.equals(to, other.to)
				&& Objects.equals(versionFactor, other.versionFactor);
	}

}

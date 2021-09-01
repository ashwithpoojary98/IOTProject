package com.iot.general;

public class Appliance {
	private boolean switchOn;
	private String appliance;
	private int unit;

	public Appliance() {
		super();
	}

	@Override
	public String toString() {
		return "Appliance [switchOn=" + switchOn + ", appliance=" + appliance + ", unit=" + unit + "]";
	}

	public Appliance(boolean switchOn, String appliance, int unit) {
		super();
		this.switchOn = switchOn;
		this.appliance = appliance;
		this.unit = unit;
	}

	public boolean isSwitchOn() {
		return switchOn;
	}

	public void setSwitchOn(boolean switchOn) {
		this.switchOn = switchOn;
	}

	public String getAppliance() {
		return appliance;
	}

	public void setAppliance(String appliance) {
		this.appliance = appliance;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

}

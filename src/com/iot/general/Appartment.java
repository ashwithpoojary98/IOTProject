package com.iot.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Appartment {
	private List<Appliance> homeAppliances=new ArrayList<Appliance>();
	private Appliance appliance;

	public List<Appliance> getHomeAppliances() {
		return homeAppliances;
	}

	public void setHomeAppliances(List<Appliance> homeAppliances) {
		this.homeAppliances = homeAppliances;
	}

	@Override
	public String toString() {
		return "Appartment [homeAppliances=" + homeAppliances + ", appliance=" + appliance + "]";
	}

	public Appliance getAppliance() {
		return appliance;
	}

	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	public Appartment(List<Appliance> homeAppliances, Appliance appliance) {
		super();
		this.homeAppliances = homeAppliances;
		this.appliance = appliance;
	}

	public Appartment() {
	}

	public void addHomeApplicane(boolean switchOn, String applianceName, int unit) {
		appliance = new Appliance(switchOn, applianceName, unit);
		homeAppliances.add(appliance);
	}
	public void sortByUnit(){
		Collections.sort(homeAppliances, new UnitSort());
		getSortedDevice();
	}
	public void sortByUnitDescendentent(){
		Collections.sort(homeAppliances, new UnitDesSort());
		getSortedDevice();
	}
	public List<String> getSortedDevice(){
		List<String> device=new ArrayList<String>();
		for (Appliance appliance : homeAppliances) {
			device.add(appliance.getAppliance());
		}
		return device;
	}
	public int getLoadAmount() {
		int amount=0;
		for (Appliance appliance : homeAppliances) {
			if(appliance.isSwitchOn()) {
				amount+=appliance.getUnit();
			}
		}
		return amount*10;
	}
class UnitSort implements Comparator<Appliance>{

	@Override
	public int compare(Appliance appliance1, Appliance appliance2) {
		return appliance1.getUnit()-appliance2.getUnit();
	}
	
}
class UnitDesSort implements Comparator<Appliance>{

	@Override
	public int compare(Appliance appliance1, Appliance appliance2) {
		if(appliance1.getUnit()==appliance2.getUnit())
			return 0;
		else if (appliance1.getUnit()<appliance2.getUnit()) {
			return 1;
		}
		return -1;
	}
	
}
}

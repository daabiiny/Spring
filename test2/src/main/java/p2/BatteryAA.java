package p2;

public class BatteryAA implements Battery {
	
	private int energy;
	
	public BatteryAA() {

	}
	
	// 생성자
	public BatteryAA(int energy) {
		this.energy = energy;
	}
	public int getEnergy() {
		return energy;
	}
	// setter
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void useEnergy() {
		this.energy -= 10;
	}
	
}

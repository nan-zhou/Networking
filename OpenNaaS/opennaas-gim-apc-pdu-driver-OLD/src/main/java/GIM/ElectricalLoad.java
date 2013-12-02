package GIM;
import GIM.Load;

/**
 * @author rcarroll
 * @version 1.0
 * @created 14-Feb-2013 15:41:39
 */
public class ElectricalLoad extends Load {

	private double inputVoltage;
	private double inputCurrent;
	private double inputPower;

	public ElectricalLoad(){

	}

	public void setVoltage(double voltage){
		inputVoltage = voltage;
	}
	
	public void setCurrent(double current){
		inputCurrent = current;
	}
	
	public void setPower(double power){
		inputPower = power;
	}
	
	public double getVoltage(){
		return inputVoltage;
	}
	
	public double getCurrent(){
		return inputCurrent;
	}
	
	public double getPower(){
		return inputPower;
	}
	
	public void finalize() throws Throwable {
		super.finalize();
	}

}
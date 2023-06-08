package assignment5;

import java.util.Objects;

public class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	
	Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
	    this.manufacturer = manufacturer;
	    this.processor = processor;
	    this.ramSize = ramSize;
	    this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return this.ramSize;
	}
	  
	public double getProcessorSpeed() {
		return this.processorSpeed;
	}
	
	public double computePower() {
		return (ramSize * processorSpeed);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer other = (Computer) obj;
        return manufacturer.equals(other.manufacturer) &&
        		processor.equals(other.processor) &&
        		ramSize == other.ramSize &&  processorSpeed == other.processorSpeed;
    }

    // Override hashCode() method

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
	
}

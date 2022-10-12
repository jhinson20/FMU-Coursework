public class AbstractAverage {
	public static void main(String[] args) {
		IntData intData = new IntData();
		System.out.println(intData.getAverage());
		DoubleData doubleData = new DoubleData();
		System.out.println(doubleData.getAverage());
		StringData stringData = new StringData();
		System.out.print(stringData.getAverage());
	}
}

abstract class Average{
 Average(){
 } //default constructor
 abstract double getAverage();
}//end abstract class

class IntData extends Average {
 int[ ] iData = {67, 82, 54,125,32,77,154,98};
 private double addition;
 private double average;
 public IntData () {
 }
 @Override 
 public double getAverage() {
	for(int i = 0; i < iData.length; i++) {
		addition += iData[i];
	}
	average = addition/iData.length;
	return average;
}
}

class DoubleData extends Average {
 double[ ] dData = {67.5, 82.33, 54.89,125.0,32.33,77.95,154.777,98.25};
 private double addition;
 private double average;
 public DoubleData() {
 }
 @Override
 public double getAverage() {
	for(int i = 0; i < dData.length; i++) {
		addition += dData[i];
	}
	average = addition/dData.length;
	return average;
 }
}
class StringData extends Average {
 String[ ] sData = {"67","82","54","125","32","77","154","98"};
 private double addition;
 private double average;
 public StringData() {
 }
 @Override
 public double getAverage() {
	for(int i = 0; i < sData.length; i++) {
		addition += Double.parseDouble(sData[i]);
	}
	average = addition/sData.length;
	return average;
 }
}
public class Jaeger {
	private String modelName;
	private String status;
	private float weight;
	private int speed;

	public Jaeger(){

	}

	public Jaeger(String modelName, String status, float weight, int speed) {
		this.modelName = modelName;
		this.status = status;
		this.weight = weight;
		this.speed = speed;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void move() {
		System.out.println("Робот " + modelName +" движется");
	}

	public void useVortexCannon() {
		System.out.println("Робот " + modelName + " использует вихревую пушку");
	}
}
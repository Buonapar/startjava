public class Variable {

	static byte core = 4;
	static short multiplier = 34;
	static int fsb = 24000000;
	static long frequency = 3400000000L;
	static float cpuVoltage = 1.2368f;
	static double pi = 3.141592653589d;
	static char tm = 'i';
	static boolean isExist = true;

	public static void main(String[] args) {
		System.out.println("core = " + core +
						   ", multiplier = " + multiplier + 
						   ", frequency = " + frequency +
						   ", fsb = " + fsb + 
						   ", cpuVoltage = " + cpuVoltage + 
						   ", tm = " + tm +
						   ", isExist = " + isExist +
						   ", pi = " + pi);
	}
}
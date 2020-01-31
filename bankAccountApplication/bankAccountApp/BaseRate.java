package bankAccountApp;

public interface BaseRate {
	// a method that returns base rate
	default double getBaseRate() {
		return 2.5;
	}

	
}

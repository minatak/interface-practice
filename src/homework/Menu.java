package homework;

public interface Menu {
	int RICE = 500;
	int BULGOGI = 2000;
	int DUBU = 1000;
	int GUK = 1000;
	int YOGURT = 800;
	int BANANA = 500;
	int	MILK = 500;
	int	ALMOND = 700;

	
	void chooseLunch(int choose);
	void chooseSnack(int choose);

	void CalculatePrice(String childName);
}

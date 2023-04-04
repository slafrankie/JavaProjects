//Stephen LaFrankie
public class speed
{
	private double speed;
	private double maxSpeed;

	public speed(int s, int mS)
	{
		speed = 0;
		maxSpeed = 100;
	}
	public double speedInc(int sp)throws speedException
	{
		speed = speed + sp;
		if(speed <= 100)
		{
			sp = speed;
			System.out.println("Current speed: "+sp);
			return sp;
		}
		if(speed > 100)
		{
			throw new speedException("SPEED OVER MAX LIMIT");
		}
	}
	public double speedDec(int sp)throws speedException
	{
		speed = speed - sp;
		if(speed > 0)
		{
			sp = speed;
			System.out.println("Current speed: " +sp);
			return sp;
		}
		if(speed < 0)
		{
			throw new speedException("SPEED UNDER MIN LIMIT");
		}
	}




	}

}








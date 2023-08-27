package taller3.televisores;

public class Control {
	public TV tv;
	
	public void enlazar(TV tv)
	{
		this.tv=tv;
		tv.setControl(this);
	}
	public void turnOn()
	{
		tv.turnOn();
	}
	public void turnOff()
	{
		tv.turnOff();

	}
	public void canalUp()
	{
		if(tv.estado)
		{
			if(tv.canal<120)
			{
				tv.canalUp();
			}
		}
	}
	public void canalDown()
	{
		if(tv.estado)
		{
			if(tv.canal>=1)
			{
				tv.canalDown();
			}
		}
	}
	public void volumenUp()
	{
		if (tv.estado)
		{
			if(tv.volumen<=7)
			{
				tv.volumenUp();
			}
		}
	}
	public void volumenDown()
	{
		if (tv.estado)
		{
			if(tv.volumen>=0)
			{
				tv.volumenDown();
			}
		}
	}
	public void setVolumen(int volumen)
	{
		if(tv.estado)
		{
			if(tv.volumen>=0 & tv.volumen<=7)
			{
				tv.volumen = volumen;
			}
		}
	}
	public void setCanal(int canal)
	{
		if (tv.estado)
		{
			if(canal>1 & canal<120)
			{
				tv.canal = canal;
			}
		}
	}
	public Object getTv()
	{
		return tv;
	}
	
	public void setTv(TV tv)
	{
        this.tv = tv;
	}
}



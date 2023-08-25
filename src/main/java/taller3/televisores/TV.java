package taller3.televisores;

public class TV {
	private Marca marca;
	private Control control;
	private int canal = 1;
	private int volumen = 1;
	private int precio = 500;
	private boolean estado;
	private int numTV = 0;
	
	public TV(Marca marca, boolean estado)
	{
		this.marca = marca;
		this.estado= estado;
		numTV++;
	}
	public void canalUP()
	{
		if(estado)
		{
			if(canal>1 & canal<120)
			{
				canal++;
			}
		}
	}
	public void canalDown()
	{
		if(estado)
		{
			if(canal>=1 & canal<=120)
			{
				canal--;
			}
		}
	}
	public void volumenUp()
	{
		if(estado)
		{
			if(canal>=0 & canal<=7)
			{
				volumen++;
			}
		}
	}
	public void turnOn(boolean estado)
	{
		this.estado=true;
	}
	public void turnOff(boolean estado)
	{
		this.estado=false;
	}
	public void volumenDown()
	{
		volumen--;
	}
	public void setMarca(Marca marca)
	{
		this.marca = marca;
	}
	
	public void setCanal(String canal)
	{
		this.canal = canal;
	}
	
	public void setPrecio(int precio)
	{
		this.precio = precio;
	}
	
	public String setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	
	public String setControl(Control control)
	{
		this.control = control;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public String getCanal()
	{
		return canal;
	}
	
	public String getPrecio()
	{
		return precio;
	}
	
	public String getVolumen()
	{
		return volumen;
	}
	public String getControl()
	{
		return control;
	}
}
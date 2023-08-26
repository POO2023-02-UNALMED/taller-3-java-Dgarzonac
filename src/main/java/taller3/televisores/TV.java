package taller3.televisores;

public class TV {
	private Marca marca;
	private Control control;
	private int canal = 1;
	private int volumen = 1;
	private int precio = 500;
	private boolean estado;
	public static int numTV = 0;
	TV tv;
	
	public TV(Marca marca, boolean estado)
	{
		this.marca = marca;
		this.estado= estado;
		numTV++;
	}
	public void setControl(Control control)
	{
		this.control = control;
	}
	public void canalUp()
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
	public void turnOn()
	{
		this.estado=true;
	}
	public void turnOff()
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
	
	public void setCanal(int canal)
	{
		this.canal = canal;
	}
	
	public void setPrecio(int precio)
	{
		this.precio = precio;
	}
	
	public void setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	public static void setNumTV(int numTV)
	{
		TV.numTV = numTV;
	}	
	public Marca getMarca()
	{
		return marca;
	}
	
	public int getCanal()
	{
		return canal;
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public int getVolumen()
	{
		return volumen;
	}
	public Control getControl()
	{
		return control;
	}
	public boolean getEstado()
	{
		return estado;
	}
	public Object getTV()
	{
		return tv;
	}
	public static int getNumTV()
	{
		return numTV;
	}

}
package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	static private int numTV;
	
//setting constructor	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV+=1;
	}
//setting and getting marca
	public void setMarca(Marca marca) {
		this.marca=marca;
		return;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
//setting and getting control
	public void setControl(Control control) {
		this.control=control;
		return;
	}
	
	public Control getControl() {
		return this.control;
	}
//setting and getting price
	public void setPrecio(int precio) {
		this.precio=precio;
		return;
	}
	
	public int getPrecio() {
		return this.precio;
	}
// setting and getting Volumen
	public void setVolumen(int volumen) {
		this.volumen=volumen;
		return;
	}

	public int getVolumen() {
		return this.volumen;
	}
// setting and getting canal
	public void setCanal(int canal) {
		if (canal<=120 && canal>=1) {
			this.canal=canal;
			return;
		}
		return;
	}

	public int getCanal() {
		return this.canal;
	}
//getting TV count numTV
	public static int getNumTV() {
		return numTV;
	}
//turning on and off the TV,  also getting the state
	public void turnOn() {
		this.estado=true;
		return;
	}
	
	public void turnOff() {
		this.estado=false;
		return;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp(){
		if(this.canal<120 && this.canal>0 && this.estado) {
			this.canal+=1;
			return;
		}
	}
	public void canalDown() {
		if(this.canal<121 && this.canal>1 && this.estado) {
			this.canal-=1;
			return;
		}
	}
	
	public void volumenUp(){
		if(this.volumen<7 && this.volumen>0 && this.estado) {
			this.volumen+=1;
			return;
		}
	}
	public void volumenDown() {
		if(this.volumen<8 && this.canal>1 && this.estado) {
			this.volumen-=1;
			return;
		}
	}
	
	static public void setNumTV(int num) {
		TV.numTV=num;
	}
	

}

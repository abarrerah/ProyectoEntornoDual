package Model;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Operations.Information;

public class Barco extends Marina implements Information{
	private double eslora;
	private String nombre;
	public Barco(String nombre, String dni, String rango, float altura, String barco,double eslora,String nombreV) {
		super(nombre, dni, rango, altura, barco);
		this.eslora=eslora;
		this.nombre=nombreV;
		// TODO Auto-generated constructor stub
	}
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return super.toString()+"Barco [eslora=" + eslora + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(eslora);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		if (Double.doubleToLongBits(eslora) != Double.doubleToLongBits(other.eslora))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String ficheroXMLInformation(ArrayList<Barco> al){
		// TODO Auto-generated method stub
		String Text="";
		try {
			 DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		      DocumentBuilder builder=factory.newDocumentBuilder();
		      Document doc=builder.newDocument();
		      Element root=doc.createElement("Barcos");
		      
		      for(int i=0;i<al.size();i++) {
		    	  Element bar=doc.createElement("Barco");
		    	  root.appendChild(bar);
		    	  Text="El barco es el siguiente:";
		    	  for(int j=0;j<1;j++) {
		    		  Element nombreB=doc.createElement("nombreDelBarco");
		    		  nombreB.setTextContent(al.get(i).getNombre());
		    		  bar.appendChild(nombreB);
		    		  Text=Text+" su nombre es "+nombreB;
		    	  }
		      }
		      TransformerFactory tf = TransformerFactory.newInstance();
		      Transformer transformer = tf.newTransformer();

		      transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
		      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		      transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
		      transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
		      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

		      DOMSource origenDOM = new DOMSource(root);
		      File nuevoPersonas = new File("InformacionBarco.xml");
		      StreamResult destino = new StreamResult(nuevoPersonas);

		      transformer.transform(origenDOM,destino);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return Text;
	}
	@Override
	public String locationInformation() {
			
		return "Ese barquito está en el agua xD";
	}
	
	

}

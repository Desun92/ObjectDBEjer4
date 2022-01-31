package es.iestetuan.acv;

import java.io.IOException;

import es.iestetuan.acv.dao.jpa.ColorJPA;
import es.iestetuan.acv.dao.vo.Color;
import es.iestetuan.acv.utilidades.ParseoJackson;

public class Main {

	public static void main(String[] args) {
		
		ColorJPA gestionColores = new ColorJPA();
		Color[] colores=null;
		
		try {
			colores  = ParseoJackson.parseoColores();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Color color : colores) {
			System.out.println(color);
			//gestionColores.crear(color);
		}
		
		/*ObjectMapper mapper = new XmlMapper();
		String xml = null;
		
		Color color1 = new Color();
		color1.setCodigoColor(1);
		color1.setNombre("Azul");
		color1.setCodigoHexadecimal("#1234A");
		
		Color color2 = new Color();
		color2.setCodigoColor(2);
		color2.setNombre("Rojo");
		color2.setCodigoHexadecimal("#5678B");
		
		try {
			xml = mapper.writeValueAsString(color1);
			System.out.println(xml);
			
			//xml = mapper.writeValueAsString(color2);
			color2 = mapper.readValue(xml, Color.class);
			System.out.println(color2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/

	}

}

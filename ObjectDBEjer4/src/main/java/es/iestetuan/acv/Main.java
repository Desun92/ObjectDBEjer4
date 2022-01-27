package es.iestetuan.acv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.iestetuan.acv.dao.vo.Color;
import es.iestetuan.acv.utilidades.ParseoJackson;

public class Main {

	public static void main(String[] args) {
		
		List<Color> listaColores = new ArrayList<Color>();
		String hola = null;
		
		try {
			hola = ParseoJackson.parseoColores();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(hola);
		
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

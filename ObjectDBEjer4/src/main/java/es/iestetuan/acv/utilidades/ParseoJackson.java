package es.iestetuan.acv.utilidades;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import es.iestetuan.acv.dao.vo.Color;
import es.iestetuan.acv.dao.vo.Linea;

public class ParseoJackson {

	public static void parseoLineas(List<Linea> listaLineas) {
		
	}
	
	public static String parseoColores() throws IOException {
		
		ObjectMapper mapper = new XmlMapper();
		String listaColoresString = Files.readString(Paths.get(GestorConfiguracion.getInfoConfiguracion("ruta.xml.colores")), StandardCharsets.UTF_8);
		return listaColoresString;

	}
	

}

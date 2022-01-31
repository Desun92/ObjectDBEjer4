package es.iestetuan.acv;

import java.io.IOException;
import java.util.List;

import es.iestetuan.acv.dao.jpa.ColorJPA;
import es.iestetuan.acv.dao.jpa.LineaJPA;
import es.iestetuan.acv.dao.vo.Color;
import es.iestetuan.acv.dao.vo.Linea;
import es.iestetuan.acv.procesamiento.LineaXML;
import es.iestetuan.acv.utilidades.ParseoJackson;

public class Main {

	public static void main(String[] args) {
		
		ColorJPA gestionColores = new ColorJPA();
		LineaJPA gestionLineas = new LineaJPA();
		Color[] colores=null;
		LineaXML[] lineaXml = null;	
		
		try {
			colores  = ParseoJackson.parseoColores();
			lineaXml = ParseoJackson.parseoLineas();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*for(Color color : colores) {
			gestionColores.crear(color);
		}
		
		for(LineaXML lineaxml : lineaXml) {
			Linea linea = new Linea();
			linea.setCodigoLinea(lineaxml.getCodigoLinea());
			linea.setNombreCorto(lineaxml.getNombreCorto());
			linea.setNombreLargo(lineaxml.getNombreLargo());
			linea.setColor(gestionColores.consultarPorID(lineaxml.getColor(), Color.class));
			linea.setKilometros(lineaxml.getKilometros());
			linea.setUrl(lineaxml.getUrl());
			linea.setImagen(linea.getUrl().getBytes());
			gestionLineas.crear(linea);
		}*/
		
		/*List<Linea> listaLineas = null;
		listaLineas=gestionLineas.consultarLista();
		
		for(Linea linea : listaLineas) {
			System.out.println(linea);
		}*/
		
	}

}

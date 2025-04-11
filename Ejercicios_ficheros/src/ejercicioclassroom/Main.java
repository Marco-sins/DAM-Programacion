package ejercicioclassroom;

import java.io.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Main {
	public static void main(String[] args)
	{
		try
		{
			JAXBContext contexto = JAXBContext.newInstance (Academico.class);
			Unmarshaller um = contexto.createUnmarshaller();
			Academico a = (Academico) um.unmarshal(new File("Academico.xml"));
			Marshaller m = contexto.createMarshaller();
			Academico ac = new Academico("Marco", 2024);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(ac, new FileWriter("socioNuevo.xml"));
		}
		catch (Exception ex)
		{
			System.out.println("Error " +  ex.getLocalizedMessage());
		}
	}
}

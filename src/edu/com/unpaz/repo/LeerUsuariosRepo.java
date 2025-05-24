package edu.com.unpaz.repo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import edu.com.unpaz.model.Usuario;

public class LeerUsuariosRepo implements ILeerUsuarios{
	
	Path dataFile = Paths.get("C:\\Users\\Angel\\OneDrive\\Desktop\\parcialData.txt");
	
	@Override
	public List<Usuario> leerUsuarios(){
		List<Usuario> data = new ArrayList<Usuario>(); 
		try {
			Files.lines(dataFile)
				.forEach(usrLine -> {
					
					String[] splitedUsr = usrLine.split(",");
					
					if (splitedUsr.length > 3) throw new Error("error en la lectura de los datos");
					
					Usuario user = new Usuario(
												splitedUsr[0],
												splitedUsr[1],
												splitedUsr[2]);
					data.add(user);
				});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Error e) {
			System.out.println(e.getMessage());
		}
		
		return data;
	}
	
}

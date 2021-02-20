/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package visor;

import Arquivo.Salvar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.module.ModuleDescriptor.read;
import static java.lang.module.ModuleDescriptor.read;
import static java.lang.module.ModuleDescriptor.read;
import java.util.Scanner;
import javax.swing.JLabel;

/**
 *
 * @author Caique
 */
public class Botões {
    
    public Object chooser;
    public static void Salvar(){
        Salvar.main(null);
    }
    
    public void writeToFile(String fileName, String text) throws Exception {
        
    }
    
    
    
    //Abrir arquivo:[
    public static void leitor(String path) throws IOException {
    
		BufferedReader buffRead = new BufferedReader(new FileReader("texto.html"));
                String linha = "";
                String Aux = "";
                while (true) {
			if (linha != null) {
				System.out.println(linha);
                                linha = linha + linha;
			} else
				break;
                        
                        tela.display.setText(linha);
			linha = buffRead.readLine();
		}
                
		buffRead.close();
    }
}

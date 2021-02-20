/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visor;

import static java.awt.Event.END;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.util.Scanner;
import javax.swing.ImageIcon;
import org.apache.commons.lang3.StringUtils;
import static visor.tela.display;
/**
 *
 * @author Caique
 */
public class Verificar {
    public static boolean Verificador = false;
    public static void Linguagem() {
      
      String str1 = tela.display.getText().toLowerCase();
        // In If-else statements you can use the contains() method
        if (str1.contains("fonte italico 14 pfv") || str1.contains("fonte 14 italico pfv")) {
        Font font = new Font("Serif", Font.ITALIC, 14);
        tela.display.setFont(font); 
            }
      /*  else if (str1.contains("fonte negrito 14 pfv") || str1.contains("fonte 14 negrito pfv") || str1.contains("fonte 14 pfv") || str1.contains("fonte normal pfv") || str1.contains("fonte padrão pfv")) {
        Font font = new Font("Serif", Font.BOLD, 14);
        tela.display.setFont(font); 
            }*/
        else if (str1.contains("fonte negrito 18 pfv") || str1.contains("fonte 18 negrito pfv")) {
        Font font = new Font("Serif", Font.BOLD, 18);
        tela.display.setFont(font); 
            }
        else if (str1.contains("fonte italico 18 pfv") || str1.contains("fonte 18 italico pfv")) {
        Font font = new Font("Serif", Font.ITALIC, 18);
        tela.display.setFont(font); 
            }
        else if (str1.contains("fonte enorme negrito pfv") || str1.contains("fonte grande pfv")) {
        Font font = new Font("Serif", Font.BOLD, 40);
        tela.display.setFont(font); 
            }
         else if (str1.contains("fonte enorme pfv") || str1.contains("fonte grande pfv")) {
        Font font = new Font("Serif", Font.PLAIN, 26);
        tela.display.setFont(font); 
            }
        else if (str1.contains("fonte enorme italico pfv") || str1.contains("fonte grande italico pfv")) {
        Font font = new Font("Serif", Font.ITALIC, 40);
        tela.display.setFont(font); 
            }
        else if (str1.contains("fonte bonita pfv") || str1.contains("fonte cursiva pfv")|| str1.contains("letra cursiva pfv")|| str1.contains("letra de mão pfv")) {
        Font font = new Font("Serif", Font.ITALIC, 20);
        tela.display.setFont(font); 
            }else{
             Font font = new Font("Serif", Font.BOLD, 14);
              tela.display.setFont(font); 
         }
         if (str1.contains("marque pfv") || str1.contains("grife pfv")) {
             System.out.println("vlalala");
                     Font font = tela.display.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON); // --- Look Here --- //
        //attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
        //attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);

        tela.display.setFont(font.deriveFont(attributes));
         }
         
          if (str1.contains("fruta pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.replaceAll("fruta pfv","");
              Texto = "<img src='http://socialcat.ga/Images/apple.png'></img src>"+ "<p>" + Texto + "</p>";
                tela.display.setText(Texto);
                Verificador = true;
            }
          if (str1.contains("chico pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("chico pfv","U U A A");
              Texto = "<img src='http://socialcat.ga/Images/chico.gif'></img src>"+ "<p>" + Texto + "</p>";
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("estrelas pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("estrelas pfv","plimplim plomplom");
              Texto = "<img src='http://socialcat.ga/Images/stars.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("bola pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("bola pfv","");
              Texto = "<img src='http://socialcat.ga/Images/ball.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("balões pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("balões pfv","");
              Texto = "<img src='http://socialcat.ga/Images/ballons.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("carro pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("carro pfv","");
              Texto = "<img src='http://socialcat.ga/Images/car.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("luna pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("luna pfv","AUAU");
              Texto = "<img src='http://socialcat.ga/Images/dog.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("paisagem pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("paisagem pfv","");
              Texto = "<img src='http://socialcat.ga/Images/landscape.png'></img src>" + Texto;
              
                tela.display.setText(Texto);
                Verificador = true;
            }else if (str1.contains("jujuba pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("jujuba pfv","");
              Texto = "<img src='http://socialcat.ga/Images/mouse.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }
             else if (str1.contains("sorria pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("sorria pfv","");
              Texto = "<img src='http://socialcat.ga/Images/smile.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }
           else if (str1.contains("cobra pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("cobra pfv","");
              Texto = "<img src='http://socialcat.ga/Images/snake.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            } else if (str1.contains("gato pfv")) {
              String Texto = tela.display.getText();
              Texto = Texto.toLowerCase().replaceAll("gato pfv","");
              Texto = "<img src='http://socialcat.ga/Images/cat.png'></img src>"+ "<p>" + Texto + "</p>";
              
                tela.display.setText(Texto);
                Verificador = true;
            }
          
          }   
        }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nubeConceptos;
import java.util.Random;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class texto {
    
    Palabras palabra;
    String words[];
    int x[], y[], tam[], an[];
    
    public texto(Palabras p){
        this.palabra = p;
    }
    
    public void datosPalabra(String w[], int xi[], int yi[], int t[], int a[]){
        words = w;
        x = xi;
        y = yi;
        tam = t;
        an = a;
        
    }
    public Color color(){
      Random rand = new Random();
float r = rand.nextFloat();
float g = rand.nextFloat();
float b = rand.nextFloat();
Color randomColor = new Color(r, g, b);
    
    return randomColor;
    }
            public void paint(Graphics2D g){
        Graphics p = palabra.getGraphics();
      

        for(int i=0; i<words.length; i++){
            Font f = new Font(Font.SERIF, Font.BOLD,tam[i]);
            
            g.setColor(color());
            g.setFont(f);
            if(words[i].equals("de") ){
            }else{
             g.drawString(words[i], x[i], y[i]);
            }
        }            //g.drawRect(x[i], y[i]-tam[i]+(tam[i]/4), an[i]-(tam[i]/8), tam[i]);
        }
    }


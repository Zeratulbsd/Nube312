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
    Random rand = new Random();
float r = rand.nextFloat();
float g = rand.nextFloat();
float b = rand.nextFloat();
Color randomColor = new Color(r, g, b);

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
    public void paint(Graphics2D g){
        Graphics p = palabra.getGraphics();
        
        for(int i=0; i<words.length; i++){
            Font f = new Font(Font.SERIF, Font.PLAIN, tam[i]);
            //aqui en esta parte cambias el color de letra########################
            //g.setColor(Color.red);
            g.setColor(randomColor);
            g.setFont(f);
            g.drawString(words[i], x[i], y[i]);
            //g.drawRect(x[i], y[i]-tam[i]+(tam[i]/4), an[i]-(tam[i]/8), tam[i]);
        }
    }
}

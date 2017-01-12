package mvc;

import javax.swing.SwingUtilities;

import mvc.controllers.Controller;
import mvc.models.Model;
import mvc.views.View;



public class Main
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Model model = new Model();
                View view = new View(); 
                new Controller(model,view);
            }
        });  
    }
}
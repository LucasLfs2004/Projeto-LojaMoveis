package com.mycompany.projetointegrador_lojamoveis;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.mycompany.view.MenuInicial;

/**
 *
 * @author Luka
 */
public class ProjetoIntegrador_LojaMoveis {

    public static void main(String[] args) {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

        new MenuInicial(); //Create and show the GUI.

        MenuInicial telaInicial = new MenuInicial();
        telaInicial.setVisible(true);
    }
}

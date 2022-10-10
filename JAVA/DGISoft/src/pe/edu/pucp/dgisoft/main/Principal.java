package pe.edu.pucp.dgisoft.main;

import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args){
        /*Look and Feel*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
		}
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        
        frmGestionGrupos panelGestGrupos = new frmGestionGrupos();
        JFrame formGestEmp = new JFrame();
        formGestEmp.add(panelGestGrupos);
        formGestEmp.pack();
        formGestEmp.setFocusable(true);
        formGestEmp.setResizable(false);
        formGestEmp.setTitle("Formulario de Gestión de Grupos");
        formGestEmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formGestEmp.setVisible(true);
    }
}

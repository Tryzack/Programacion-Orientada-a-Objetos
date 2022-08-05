package conectaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class ApartadoGrafico extends javax.swing.JFrame {

	ButtonGroup btn;

    public ApartadoGrafico() {
        initComponents();
        idC.setVisible(false);
        btn = new ButtonGroup();
        btn.add(sexoM);
        btn.add(sexoF);
        imprimirTabla();
    }
                     
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        tablafuera = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        datos = new javax.swing.JPanel();
        datos2 = new javax.swing.JPanel();
        nombreC = new javax.swing.JTextField();
        salarioC = new javax.swing.JTextField();
        posC = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        sexoM = new javax.swing.JRadioButton();
        sexoF = new javax.swing.JRadioButton();
        idC = new javax.swing.JTextPane();
        bAgregar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 153, 153));

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        titulo.setText("Lista de Empleados");

        tablafuera.setBackground(new java.awt.Color(0, 153, 153));
        tablafuera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Salario", "Sexo", "Posicion"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasarDatos(evt);
            }
        });
        tablafuera.setViewportView(tabla);

        datos.setBackground(new java.awt.Color(204, 204, 204));
        datos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        datos2.setBackground(new java.awt.Color(153, 153, 153));
        datos2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        nombre.setText("Nombre*");

        salario.setText("Salario");

        sexo.setText("Sexo*");

        pos.setText("Posicion");

        sexoM.setText("Masculino");

        sexoF.setText("Femenino");

        javax.swing.GroupLayout datos2Layout = new javax.swing.GroupLayout(datos2);
        datos2.setLayout(datos2Layout);
        datos2Layout.setHorizontalGroup(
            datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salario)
                    .addComponent(nombre)
                    .addComponent(sexo)
                    .addComponent(pos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salarioC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(posC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datos2Layout.createSequentialGroup()
                        .addComponent(sexoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(sexoF)))
                .addGap(23, 23, 23))
        );
        datos2Layout.setVerticalGroup(
            datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(sexoM)
                    .addComponent(sexoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(datos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(idC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLineaDatos(evt);
            }
        });

        bModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarLineaDatos(evt);
            }
        });

        bEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLineaDatos(evt);
            }
        });

        bNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoDato(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(bAgregar)
                        .addGap(69, 69, 69)
                        .addComponent(bModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar)
                        .addGap(61, 61, 61)
                        .addComponent(bNuevo))
                    .addComponent(tablafuera, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablafuera, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bModificar)
                    .addComponent(bEliminar)
                    .addComponent(bNuevo))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                     

    private void modificarLineaDatos(java.awt.event.ActionEvent evt) {
    	try {
	    	int id = Integer.parseInt(idC.getText());
	    	String nombre = nombreC.getText();
	    	Double salario = Double.parseDouble(salarioC.getText());
	    	String sexo;
	    	if(sexoM.isSelected()) {
	    		sexo = "Masculino";
	    	} else if (sexoF.isSelected()) {
	    		sexo = "Femenino";
	    	} else { sexo = "Indefinido";}
	    	String pos = posC.getText();
	    	
	    	try {
	    		Connection miConexion = Conecta_Pruebas.conectarse();
	    		PreparedStatement ps = miConexion.prepareStatement("UPDATE empleado SET nombre=?, salario=?, sexo=?, posicion=? WHERE id=?");
	    		ps.setString(1, nombre);
	    		ps.setDouble(2, salario);
	    		ps.setString(3, sexo);
	    		ps.setString(4, pos);
	    		ps.setInt(5, id);
	    		ps.executeUpdate();
	    		
	    		JOptionPane.showMessageDialog(null , "Registro modificado");
	    		limpiar();
	    		imprimirTabla();
	    		
	    	} catch(Exception e){
	    		JOptionPane.showMessageDialog(null , e.toString());
	    	}
	    	imprimirTabla();
	    	} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null , "Hubo algun error al guardar datos\n Codigo de error:"+e.toString());
	    }
    }

    private void agregarLineaDatos(java.awt.event.ActionEvent evt) {
    	try {
    	String nombre = nombreC.getText();
    	Double salario = Double.parseDouble(salarioC.getText());
    	String sexo;
    	if(sexoM.isSelected()) {
    		sexo = "Masculino";
    	} else if (sexoF.isSelected()) {
    		sexo = "Femenino";
    	} else { sexo = "Indefinido";}
    	String pos = posC.getText();
    	
    	try {
    		Connection miConexion = Conecta_Pruebas.conectarse();
    		PreparedStatement ps = miConexion.prepareStatement("INSERT INTO empleado(nombre, salario, sexo, posicion) VALUES(?, ?, ?, ?)");
    		ps.setString(1, nombre);
    		ps.setDouble(2, salario);
    		ps.setString(3, sexo);
    		ps.setString(4, pos);
    		ps.executeUpdate();
    		JOptionPane.showMessageDialog(null , "Registro guardado");
    		limpiar();
    		imprimirTabla();
    		
    	} catch(Exception e){
    		JOptionPane.showMessageDialog(null , e.toString());
    	}
    	} catch (Exception e) {
    		JOptionPane.showMessageDialog(null , "Hubo algun error al guardar datos\n Codigo de error:"+e.toString());
    	}
    }                                  

    private void eliminarLineaDatos(java.awt.event.ActionEvent evt) {
    	try {
    	int id = Integer.parseInt(idC.getText());
    	
    	
    	try {
    		Connection miConexion = Conecta_Pruebas.conectarse();
    		PreparedStatement ps = miConexion.prepareStatement("DELETE FROM empleado WHERE id=?");
    		ps.setInt(1, id);
    		ps.executeUpdate();
    		
    		JOptionPane.showMessageDialog(null , "Registro eliminado");
    		limpiar();
    		imprimirTabla();
    		
    	} catch(Exception e){
    		JOptionPane.showMessageDialog(null , e.toString());
    	}
    	imprimirTabla();
    	} catch (Exception e) {
    		JOptionPane.showMessageDialog(null , "Hubo algun error al guardar datos\n Codigo de error:"+e.toString());
    	}
    }

    private void nuevoDato(java.awt.event.ActionEvent evt) {
        limpiar();
    }                          

    private void pasarDatos(java.awt.event.MouseEvent evt) {
    	try {
    		int fila = tabla.getSelectedRow();
    		int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
    		Connection miConexion = Conecta_Pruebas.conectarse();
    		PreparedStatement ps;
    		ResultSet rs;
    		ps = miConexion.prepareStatement("SELECT nombre, salario, sexo, posicion FROM empleado WHERE id=?");
    		ps.setInt(1, id);
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			idC.setText(String.valueOf(id));
    			nombreC.setText(rs.getString("nombre"));
    			salarioC.setText(rs.getString("salario"));
    			if(rs.getString("sexo").equals("Masculino")){
    				sexoM.setSelected(true);
    			} else if (rs.getString("sexo").equals("Femenino")){
    				sexoF.setSelected(true);
    			}
    			posC.setText(rs.getString("posicion"));
    		}
    		
    		
    	}catch (Exception e){
    		
    	}
    }
    
    private void imprimirTabla() {
    	DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
    	modeloTabla.setRowCount(0);
    	PreparedStatement ps;
    	ResultSet rs;
    	ResultSetMetaData rsmd;
    	int columnas;
    	
    	try {
    		Connection miConexion = Conecta_Pruebas.conectarse();
    		ps = miConexion.prepareStatement("SELECT id, nombre, salario, sexo, posicion FROM empleado");
    		rs = ps.executeQuery();
    		rsmd = rs.getMetaData();
    		columnas = rsmd.getColumnCount();
    		
    		while(rs.next()) {
    			Object[] fila = new Object [columnas];
    			for(int i=0; i<columnas; i++) {
    				fila[i] = rs.getObject(i+1);
    			}
    			modeloTabla.addRow(fila);
    		}
    	}catch (Exception e){
    		JOptionPane.showMessageDialog(null , e.toString());
    	}
    }
    
    private void limpiar() {
    	nombreC.setText("");
    	salarioC.setText("");
    	posC.setText("");
    	btn.clearSelection();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApartadoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApartadoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApartadoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApartadoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApartadoGrafico().setVisible(true);
            }
        });
    }

    private JTextPane idC;
    private javax.swing.JButton bAgregar, bEliminar, bModificar, bNuevo;
    private javax.swing.JPanel datos, datos2, fondo;
    private javax.swing.JLabel nombre, salario, pos, sexo, titulo;
    private javax.swing.JTextField nombreC, posC, salarioC;
    private javax.swing.JRadioButton sexoF, sexoM;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablafuera;
   
